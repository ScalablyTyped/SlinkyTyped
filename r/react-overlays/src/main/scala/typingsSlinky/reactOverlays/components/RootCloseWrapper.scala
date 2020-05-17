package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import typingsSlinky.reactOverlays.rootCloseWrapperMod.RootCloseWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootCloseWrapper {
  @JSImport("react-overlays", "RootCloseWrapper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.RootCloseWrapper] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def event(value: click | mousedown): this.type = set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def onRootClose(value: /* e */ SyntheticEvent[Event, _] => Unit): this.type = set("onRootClose", js.Any.fromFunction1(value))
  }
  
  def withProps(p: RootCloseWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RootCloseWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

