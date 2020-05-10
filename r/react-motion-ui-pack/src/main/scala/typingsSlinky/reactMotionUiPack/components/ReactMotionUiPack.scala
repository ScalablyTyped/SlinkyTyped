package typingsSlinky.reactMotionUiPack.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import typingsSlinky.reactMotionUiPack.mod.Transition.TransitionProps
import typingsSlinky.reactMotionUiPack.mod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionUiPack {
  @JSImport("react-motion-ui-pack", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def appear(value: Style): this.type = set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def componentReactElement(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: String | Boolean | ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def enter(value: Style): this.type = set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def leave(value: Style): this.type = set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnter(value: /* style */ PlainStyle => Unit): this.type = set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onLeave(value: /* style */ Style => Unit): this.type = set("onLeave", js.Any.fromFunction1(value))
    @scala.inline
    def runOnMount(value: Boolean): this.type = set("runOnMount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactMotionUiPack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

