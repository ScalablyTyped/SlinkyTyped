package typingsSlinky.parameter.mod

import typingsSlinky.parameter.parameterStrings.`object`
import typingsSlinky.parameter.parameterStrings.array
import typingsSlinky.parameter.parameterStrings.arrayQuestionmark
import typingsSlinky.parameter.parameterStrings.date
import typingsSlinky.parameter.parameterStrings.dateQuestionmark
import typingsSlinky.parameter.parameterStrings.dateTime
import typingsSlinky.parameter.parameterStrings.dateTimeQuestionmark
import typingsSlinky.parameter.parameterStrings.datetimeQuestionmark
import typingsSlinky.parameter.parameterStrings.datetime_
import typingsSlinky.parameter.parameterStrings.email
import typingsSlinky.parameter.parameterStrings.emailQuestionmark
import typingsSlinky.parameter.parameterStrings.enum
import typingsSlinky.parameter.parameterStrings.enumQuestionmark
import typingsSlinky.parameter.parameterStrings.id
import typingsSlinky.parameter.parameterStrings.idQuestionmark
import typingsSlinky.parameter.parameterStrings.int
import typingsSlinky.parameter.parameterStrings.intQuestionmark
import typingsSlinky.parameter.parameterStrings.integer
import typingsSlinky.parameter.parameterStrings.integerQuestionmark
import typingsSlinky.parameter.parameterStrings.number
import typingsSlinky.parameter.parameterStrings.numberQuestionmark
import typingsSlinky.parameter.parameterStrings.objectQuestionmark
import typingsSlinky.parameter.parameterStrings.password
import typingsSlinky.parameter.parameterStrings.passwordQuestionmark
import typingsSlinky.parameter.parameterStrings.string
import typingsSlinky.parameter.parameterStrings.stringQuestionmark
import typingsSlinky.parameter.parameterStrings.url
import typingsSlinky.parameter.parameterStrings.urlQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ParameterRuleItem extends StObject
object _ParameterRuleItem {
  
  @scala.inline
  def ParameterRuleArray(`type`: array | arrayQuestionmark): typingsSlinky.parameter.mod.ParameterRuleArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleArray]
  }
  
  @scala.inline
  def ParameterRuleCustom(`type`: String): typingsSlinky.parameter.mod.ParameterRuleCustom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleCustom]
  }
  
  @scala.inline
  def ParameterRuleDateTime(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): typingsSlinky.parameter.mod.ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleDateTime]
  }
  
  @scala.inline
  def ParameterRuleEmail(`type`: email | emailQuestionmark): typingsSlinky.parameter.mod.ParameterRuleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleEmail]
  }
  
  @scala.inline
  def ParameterRuleEnum(`type`: enum | enumQuestionmark, values: js.Array[_]): typingsSlinky.parameter.mod.ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleEnum]
  }
  
  @scala.inline
  def ParameterRuleID(`type`: id | idQuestionmark): typingsSlinky.parameter.mod.ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleID]
  }
  
  @scala.inline
  def ParameterRuleNumber(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): typingsSlinky.parameter.mod.ParameterRuleNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleNumber]
  }
  
  @scala.inline
  def ParameterRuleObject(`type`: `object` | objectQuestionmark): typingsSlinky.parameter.mod.ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleObject]
  }
  
  @scala.inline
  def ParameterRulePassword(`type`: password | passwordQuestionmark): typingsSlinky.parameter.mod.ParameterRulePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRulePassword]
  }
  
  @scala.inline
  def ParameterRuleString(`type`: string | stringQuestionmark): typingsSlinky.parameter.mod.ParameterRuleString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleString]
  }
  
  @scala.inline
  def ParameterRuleUrl(`type`: url | urlQuestionmark): typingsSlinky.parameter.mod.ParameterRuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.parameter.mod.ParameterRuleUrl]
  }
}
