package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.transBtnMod.TransBtnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransBtn {
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def customizeIconReactElement(value: ReactElement): this.type = set("customizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def customizeIconFunction1(value: /* props */ js.Any => ReactElement): this.type = set("customizeIcon", js.Any.fromFunction1(value))
    @scala.inline
    def customizeIcon(value: RenderNode): this.type = set("customizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def customizeIconProps(value: js.Any): this.type = set("customizeIconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  }
  
  def withProps(p: TransBtnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(className: String): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransBtnProps]))
  }
}

