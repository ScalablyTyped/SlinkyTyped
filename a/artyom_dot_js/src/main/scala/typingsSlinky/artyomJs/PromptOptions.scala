package typingsSlinky.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptOptions extends StObject {
  
  var beforePrompt: js.UndefOr[js.Function] = js.native
  
  var onEndPrompt: js.UndefOr[js.Function] = js.native
  
  var onMatch: js.UndefOr[js.Function] = js.native
  
  var onStartPrompt: js.UndefOr[js.Function] = js.native
  
  var options: js.Any = js.native
  
  var question: String = js.native
  
  var smart: js.UndefOr[Boolean] = js.native
}
object PromptOptions {
  
  @scala.inline
  def apply(options: js.Any, question: String): PromptOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforePrompt(value: js.Function): Self = StObject.set(x, "beforePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforePromptUndefined: Self = StObject.set(x, "beforePrompt", js.undefined)
    
    @scala.inline
    def setOnEndPrompt(value: js.Function): Self = StObject.set(x, "onEndPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndPromptUndefined: Self = StObject.set(x, "onEndPrompt", js.undefined)
    
    @scala.inline
    def setOnMatch(value: js.Function): Self = StObject.set(x, "onMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
    
    @scala.inline
    def setOnStartPrompt(value: js.Function): Self = StObject.set(x, "onStartPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartPromptUndefined: Self = StObject.set(x, "onStartPrompt", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}
