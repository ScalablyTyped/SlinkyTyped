package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordQuestionsRequired extends StObject {
  
  /**
    * The maximum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or greater than `minimumQuestions`.
    */
  var maximumQuestions: js.UndefOr[String] = js.native
  
  /**
    * The minimum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or less than `maximumQuestions`.
    */
  var minimumQuestions: js.UndefOr[String] = js.native
}
object AccountPasswordQuestionsRequired {
  
  @scala.inline
  def apply(): AccountPasswordQuestionsRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordQuestionsRequired]
  }
  
  @scala.inline
  implicit class AccountPasswordQuestionsRequiredMutableBuilder[Self <: AccountPasswordQuestionsRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumQuestions(value: String): Self = StObject.set(x, "maximumQuestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumQuestionsUndefined: Self = StObject.set(x, "maximumQuestions", js.undefined)
    
    @scala.inline
    def setMinimumQuestions(value: String): Self = StObject.set(x, "minimumQuestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumQuestionsUndefined: Self = StObject.set(x, "minimumQuestions", js.undefined)
  }
}
