package typingsSlinky.officeUiFabricReact.buttonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButton extends js.Object {
  
  /**
    * If there is a menu associated with this button and it is visible, this will dismiss the menu
    */
  def dismissMenu(): Unit = js.native
  
  /**
    * Sets focus to the button.
    */
  def focus(): Unit = js.native
  
  /**
    * If there is a menu associated with this button and it is visible, this will open the menu.
    * Params are optional overrides to the ones defined in `menuProps` to apply to just this instance of
    * opening the menu.
    *
    * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
    * BaseButton implementation defaults to 'undefined'.
    * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation
    * defaults to `true`.
    */
  def openMenu(): Unit = js.native
  def openMenu(shouldFocusOnContainer: js.UndefOr[scala.Nothing], shouldFocusOnMount: Boolean): Unit = js.native
  def openMenu(shouldFocusOnContainer: Boolean): Unit = js.native
  def openMenu(shouldFocusOnContainer: Boolean, shouldFocusOnMount: Boolean): Unit = js.native
}
