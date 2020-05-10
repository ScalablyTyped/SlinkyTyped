package typingsSlinky.baseui.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.accordionMod.PanelOverrides
import typingsSlinky.baseui.accordionMod.PanelState
import typingsSlinky.baseui.accordionMod.SharedProps
import typingsSlinky.baseui.accordionMod.StatefulPanelProps
import typingsSlinky.baseui.baseuiStrings.expand
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPanel {
  @JSImport("baseui/accordion", "StatefulPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: PanelState): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ AnonExpandedBoolean => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: /* e */ Event_ => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* e */ KeyboardEvent => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: PanelOverrides[SharedProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (expand, PanelState, PanelState) => PanelState): this.type = set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

