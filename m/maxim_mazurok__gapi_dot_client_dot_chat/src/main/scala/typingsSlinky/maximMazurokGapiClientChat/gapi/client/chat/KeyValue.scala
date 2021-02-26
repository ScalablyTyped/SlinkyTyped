package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValue extends StObject {
  
  /** The text of the bottom label. Formatted text supported. */
  var bottomLabel: js.UndefOr[String] = js.native
  
  /** A button that can be clicked to trigger an action. */
  var button: js.UndefOr[Button] = js.native
  
  /** The text of the content. Formatted text supported and always required. */
  var content: js.UndefOr[String] = js.native
  
  /** If the content should be multiline. */
  var contentMultiline: js.UndefOr[Boolean] = js.native
  
  /** An enum value that will be replaced by the Chat API with the corresponding icon image. */
  var icon: js.UndefOr[String] = js.native
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** The onclick action. Only the top label, bottom label and content region are clickable. */
  var onClick: js.UndefOr[OnClick] = js.native
  
  /** The text of the top label. Formatted text supported. */
  var topLabel: js.UndefOr[String] = js.native
}
object KeyValue {
  
  @scala.inline
  def apply(): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    @scala.inline
    def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMultiline(value: Boolean): Self = StObject.set(x, "contentMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMultilineUndefined: Self = StObject.set(x, "contentMultiline", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
  }
}
