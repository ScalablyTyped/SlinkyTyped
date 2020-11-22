package typingsSlinky.gestalt.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.flexible
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import typingsSlinky.gestalt.mod.FlyoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flyout {
  
  @JSImport("gestalt", "Flyout")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Flyout] {
    
    @scala.inline
    def color(value: blue | orange | red | white | darkGray): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def idealDirection(value: up | right | down | left): this.type = set("idealDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionRelativeToAnchor(value: Boolean): this.type = set("positionRelativeToAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldFocus(value: Boolean): this.type = set("shouldFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xs | sm | md | lg | xl | flexible | Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlyoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(anchor: HTMLElement, onDismiss: () => Unit): Builder = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    new Builder(js.Array(this.component, __props.asInstanceOf[FlyoutProps]))
  }
}
