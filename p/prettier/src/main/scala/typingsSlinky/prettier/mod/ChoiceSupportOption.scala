package typingsSlinky.prettier.mod

import typingsSlinky.prettier.anon.Description
import typingsSlinky.prettier.anon.Since
import typingsSlinky.prettier.prettierStrings.choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceSupportOption[Value] extends BaseSupportOption[choice] {
  
  var default: Value | js.Array[Since[Value]] = js.native
  
  var choices: js.Array[Description[Value]] = js.native
  
  @JSName("description")
  var description_ChoiceSupportOption: String = js.native
}
object ChoiceSupportOption {
  
  @scala.inline
  def apply[Value](
    category: String,
    choices: js.Array[Description[Value]],
    default: Value | js.Array[Since[Value]],
    description: String,
    since: String,
    `type`: choice
  ): ChoiceSupportOption[Value] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceSupportOption[Value]]
  }
  
  @scala.inline
  implicit class ChoiceSupportOptionMutableBuilder[Self <: ChoiceSupportOption[_], Value] (val x: Self with ChoiceSupportOption[Value]) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Array[Description[Value]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: Description[Value]*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: Value | js.Array[Since[Value]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: Since[Value]*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
