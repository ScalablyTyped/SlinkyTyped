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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ParameterRuleItem extends js.Object
object _ParameterRuleItem {
  
  @scala.inline
  def ParameterRuleCustom(`type`: String): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleDateTime(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleArray(`type`: array | arrayQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleUrl(`type`: url | urlQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleEnum(`type`: enum | enumQuestionmark, values: js.Array[_]): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleNumber(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleEmail(`type`: email | emailQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRulePassword(`type`: password | passwordQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleID(`type`: id | idQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleObject(`type`: `object` | objectQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleString(`type`: string | stringQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
}
