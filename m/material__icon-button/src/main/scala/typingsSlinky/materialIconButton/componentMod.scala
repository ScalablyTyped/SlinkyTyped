package typingsSlinky.materialIconButton

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation
import typingsSlinky.materialRipple.componentMod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/icon-button/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCIconButtonToggle () extends MDCComponent[MDCIconButtonToggleFoundation] {
    
    def on: Boolean = js.native
    def on_=(isOn: Boolean): Unit = js.native
    
    def ripple: MDCRipple = js.native
  }
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    
    def attachTo(root: HTMLElement): MDCIconButtonToggle = js.native
  }
}
