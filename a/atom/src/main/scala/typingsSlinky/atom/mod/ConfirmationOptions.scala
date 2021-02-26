package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.error
import typingsSlinky.atom.atomStrings.info
import typingsSlinky.atom.atomStrings.none
import typingsSlinky.atom.atomStrings.question
import typingsSlinky.atom.atomStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmationOptions extends StObject {
  
  /** The text for the buttons. */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  The index of the button to be used to cancel the dialog, via the `Esc` key.
    *  By default this is assigned to the first button with "cancel" or "no" as the
    *  label. If no such labeled buttons exist and this option is not set, 0 will be
    *  used as the return value or callback response.
    *
    *  This option is ignored on Windows.
    */
  var cancelId: js.UndefOr[Double] = js.native
  
  /** Initial checked state of the checkbox. false by default. */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  
  /** If provided, the message box will include a checkbox with the given label. */
  var checkboxLabel: js.UndefOr[String] = js.native
  
  /** The index for the button to be selected by default in the prompt. */
  var defaultId: js.UndefOr[Double] = js.native
  
  /** Additional information regarding the message. */
  var detail: js.UndefOr[String] = js.native
  
  /** An Electron NativeImage to use as the prompt's icon. */
  var icon: js.UndefOr[js.Object] = js.native
  
  /** The content of the message box. */
  var message: js.UndefOr[String] = js.native
  
  /**
    *  On Windows, Electron will try to figure out which one of the buttons are
    *  common buttons (like `Cancel` or `Yes`), and show the others as command links
    *  in the dialog. This can make the dialog appear in the style of modern Windows
    *  apps. If you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Normalize the keyboard access keys across platforms.
    * Atom defaults this to true.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  
  /** The title for the prompt. */
  var title: js.UndefOr[String] = js.native
  
  /** The type of the confirmation prompt. */
  var `type`: js.UndefOr[none | info | error | question | warning] = js.native
}
object ConfirmationOptions {
  
  @scala.inline
  def apply(): ConfirmationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmationOptions]
  }
  
  @scala.inline
  implicit class ConfirmationOptionsMutableBuilder[Self <: ConfirmationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setCancelId(value: Double): Self = StObject.set(x, "cancelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelIdUndefined: Self = StObject.set(x, "cancelId", js.undefined)
    
    @scala.inline
    def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxCheckedUndefined: Self = StObject.set(x, "checkboxChecked", js.undefined)
    
    @scala.inline
    def setCheckboxLabel(value: String): Self = StObject.set(x, "checkboxLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxLabelUndefined: Self = StObject.set(x, "checkboxLabel", js.undefined)
    
    @scala.inline
    def setDefaultId(value: Double): Self = StObject.set(x, "defaultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIdUndefined: Self = StObject.set(x, "defaultId", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Object): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    @scala.inline
    def setNormalizeAccessKeys(value: Boolean): Self = StObject.set(x, "normalizeAccessKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeAccessKeysUndefined: Self = StObject.set(x, "normalizeAccessKeys", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: none | info | error | question | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
