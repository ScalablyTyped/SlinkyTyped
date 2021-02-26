package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBoxSyncOptions extends StObject {
  
  /**
    * Array of texts for buttons. On Windows, an empty array will result in one button
    * labeled "OK".
    */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The index of the button to be used to cancel the dialog, via the `Esc` key. By
    * default this is assigned to the first button with "cancel" or "no" as the label.
    * If no such labeled buttons exist and this option is not set, `0` will be used as
    * the return value.
    */
  var cancelId: js.UndefOr[Double] = js.native
  
  /**
    * Initial checked state of the checkbox. `false` by default.
    */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, the message box will include a checkbox with the given label.
    */
  var checkboxLabel: js.UndefOr[String] = js.native
  
  /**
    * Index of the button in the buttons array which will be selected by default when
    * the message box opens.
    */
  var defaultId: js.UndefOr[Double] = js.native
  
  /**
    * Extra information of the message.
    */
  var detail: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Content of the message box.
    */
  var message: String = js.native
  
  /**
    * On Windows Electron will try to figure out which one of the `buttons` are common
    * buttons (like "Cancel" or "Yes"), and show the others as command links in the
    * dialog. This can make the dialog appear in the style of modern Windows apps. If
    * you don't like this behavior, you can set `noLink` to `true`.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Normalize the keyboard access keys across platforms. Default is `false`.
    * Enabling this assumes `&` is used in the button labels for the placement of the
    * keyboard shortcut access key and labels will be converted so they work correctly
    * on each platform, `&` characters are removed on macOS, converted to `_` on
    * Linux, and left untouched on Windows. For example, a button label of `Vie&w`
    * will be converted to `Vie_w` on Linux and `View` on macOS and can be selected
    * via `Alt-W` on Windows and Linux.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Title of the message box, some platforms will not show it.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Can be `"none"`, `"info"`, `"error"`, `"question"` or `"warning"`. On Windows,
    * `"question"` displays the same icon as `"info"`, unless you set an icon using
    * the `"icon"` option. On macOS, both `"warning"` and `"error"` display the same
    * warning icon.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MessageBoxSyncOptions {
  
  @scala.inline
  def apply(message: String): MessageBoxSyncOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxSyncOptions]
  }
  
  @scala.inline
  implicit class MessageBoxSyncOptionsMutableBuilder[Self <: MessageBoxSyncOptions] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
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
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
