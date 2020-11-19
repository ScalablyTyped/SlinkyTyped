package typingsSlinky.reactHamburgerMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHamburgerMenu.mod.HamburgerMenuProps
import typingsSlinky.reactHamburgerMenu.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHamburgerMenu {
  
  @JSImport("react-hamburger-menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HamburgerMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(color: String, isOpen: Boolean, menuClicked: () => Unit): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
    new Builder(js.Array(this.component, __props.asInstanceOf[HamburgerMenuProps]))
  }
}
