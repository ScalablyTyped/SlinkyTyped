package typingsSlinky.bootbox

import typingsSlinky.bootbox.anon.Group
import typingsSlinky.bootbox.bootboxStrings.checkbox
import typingsSlinky.bootbox.bootboxStrings.date
import typingsSlinky.bootbox.bootboxStrings.email
import typingsSlinky.bootbox.bootboxStrings.number
import typingsSlinky.bootbox.bootboxStrings.password
import typingsSlinky.bootbox.bootboxStrings.radio
import typingsSlinky.bootbox.bootboxStrings.range
import typingsSlinky.bootbox.bootboxStrings.select
import typingsSlinky.bootbox.bootboxStrings.text
import typingsSlinky.bootbox.bootboxStrings.textarea
import typingsSlinky.bootbox.bootboxStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for prompt modals */
@js.native
trait BootboxPromptOptions extends BootboxBaseOptions[String] {
  
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): js.Any = js.native
  
  var inputOptions: js.UndefOr[js.Array[Group]] = js.native
  
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.native
  
  @JSName("title")
  var title_BootboxPromptOptions: String = js.native
  
  var value: js.UndefOr[String] = js.native
}
object BootboxPromptOptions {
  
  @scala.inline
  def apply(callback: String => js.Any, title: String): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
  
  @scala.inline
  implicit class BootboxPromptOptionsMutableBuilder[Self <: BootboxPromptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: BootboxConfirmPromptButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: String => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputOptions(value: js.Array[Group]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    @scala.inline
    def setInputOptionsVarargs(value: Group*): Self = StObject.set(x, "inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setInputType(
      value: text | textarea | email | select | checkbox | date | time | number | password | radio | range
    ): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
