package typingsSlinky.parameter.mod

import typingsSlinky.parameter.parameterStrings.date
import typingsSlinky.parameter.parameterStrings.dateQuestionmark
import typingsSlinky.parameter.parameterStrings.dateTime
import typingsSlinky.parameter.parameterStrings.dateTimeQuestionmark
import typingsSlinky.parameter.parameterStrings.datetimeQuestionmark
import typingsSlinky.parameter.parameterStrings.datetime_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleDateTime
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ParameterRuleDateTime: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark = js.native
}
object ParameterRuleDateTime {
  
  @scala.inline
  def apply(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleDateTime]
  }
  
  @scala.inline
  implicit class ParameterRuleDateTimeMutableBuilder[Self <: ParameterRuleDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setType(
      value: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
