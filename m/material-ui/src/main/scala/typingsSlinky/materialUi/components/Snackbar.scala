package typingsSlinky.materialUi.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.SnackbarProps
import typingsSlinky.materialUi.snackbarMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Snackbar {
  @JSImport("material-ui/Snackbar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actionReactElement(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def action(value: TagMod[Any]): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: TagMod[Any]): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def onActionClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onActionClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRequestClose(value: /* reason */ String => Unit): this.type = set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackbarProps]))
  }
}

