package typingsSlinky.reactOffcanvas.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOffcanvas.mod.OffCanvasMenuProps
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.left
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OffCanvasMenu {
  @JSImport("react-offcanvas", "OffCanvasMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOffcanvas.mod.OffCanvasMenu] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def isMenuOpened(value: Boolean): this.type = set("isMenuOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OffCanvasMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: OffCanvasMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

