package typingsSlinky.parameter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParameterCheckFunction[T /* <: java.lang.String */] = js.Function2[
    /* rule */ typingsSlinky.parameter.mod.ParameterRuleCustom with typingsSlinky.parameter.anon.Type[T], 
    /* value */ js.Any, 
    java.lang.String | js.Array[typingsSlinky.parameter.mod.ValidateError] | scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parameter.parameterStrings.int
    - typingsSlinky.parameter.parameterStrings.number
    - typingsSlinky.parameter.parameterStrings.string
    - typingsSlinky.parameter.parameterStrings.bool
    - typingsSlinky.parameter.parameterStrings.boolean
    - js.Function1[/ * value * / js.Any, js.Any]
  */
  type ParameterConvertType = typingsSlinky.parameter.mod._ParameterConvertType | (js.Function1[/* value */ js.Any, js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parameter.parameterStrings.int
    - typingsSlinky.parameter.parameterStrings.intQuestionmark
    - typingsSlinky.parameter.parameterStrings.integer
    - typingsSlinky.parameter.parameterStrings.integerQuestionmark
    - typingsSlinky.parameter.parameterStrings.number
    - typingsSlinky.parameter.parameterStrings.numberQuestionmark
    - typingsSlinky.parameter.parameterStrings.date
    - typingsSlinky.parameter.parameterStrings.dateQuestionmark
    - typingsSlinky.parameter.parameterStrings.dateTime
    - typingsSlinky.parameter.parameterStrings.dateTimeQuestionmark
    - typingsSlinky.parameter.parameterStrings.datetime_
    - typingsSlinky.parameter.parameterStrings.datetimeQuestionmark
    - typingsSlinky.parameter.parameterStrings.id
    - typingsSlinky.parameter.parameterStrings.idQuestionmark
    - typingsSlinky.parameter.parameterStrings.boolean
    - typingsSlinky.parameter.parameterStrings.booleanQuestionmark
    - typingsSlinky.parameter.parameterStrings.bool
    - typingsSlinky.parameter.parameterStrings.boolQuestionmark
    - typingsSlinky.parameter.parameterStrings.string
    - typingsSlinky.parameter.parameterStrings.stringQuestionmark
    - typingsSlinky.parameter.parameterStrings.email
    - typingsSlinky.parameter.parameterStrings.emailQuestionmark
    - typingsSlinky.parameter.parameterStrings.password
    - typingsSlinky.parameter.parameterStrings.passwordQuestionmark
    - typingsSlinky.parameter.parameterStrings.`object`
    - typingsSlinky.parameter.parameterStrings.objectQuestionmark
    - typingsSlinky.parameter.parameterStrings.array
    - typingsSlinky.parameter.parameterStrings.arrayQuestionmark
    - js.Array[js.Any]
    - typingsSlinky.std.RegExp
  */
  type ParameterRuleAbbr = typingsSlinky.parameter.mod._ParameterRuleAbbr | js.Array[js.Any] | js.RegExp
  
  type ParameterRuleBoolean = typingsSlinky.parameter.mod.ParameterRuleBase
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parameter.mod.ParameterRuleCustom
    - typingsSlinky.parameter.mod.ParameterRuleNumber
    - typingsSlinky.parameter.mod.ParameterRuleString
    - typingsSlinky.parameter.mod.ParameterRuleID
    - typingsSlinky.parameter.mod.ParameterRuleDateTime
    - typingsSlinky.parameter.mod.ParameterRuleEmail
    - typingsSlinky.parameter.mod.ParameterRuleUrl
    - typingsSlinky.parameter.mod.ParameterRuleBoolean
    - typingsSlinky.parameter.mod.ParameterRulePassword
    - typingsSlinky.parameter.mod.ParameterRuleEnum
    - typingsSlinky.parameter.mod.ParameterRuleObject
    - typingsSlinky.parameter.mod.ParameterRuleArray
  */
  type ParameterRuleItem = typingsSlinky.parameter.mod._ParameterRuleItem | typingsSlinky.parameter.mod.ParameterRuleBoolean
  
  type ParameterRules = typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[
      typingsSlinky.parameter.mod.ParameterRuleItem | typingsSlinky.parameter.mod.ParameterRuleAbbr
    ]
  ]
  
  type ParameterTranslateFunction = js.ThisFunction2[
    /* this */ typingsSlinky.parameter.mod.Parameter, 
    /* message */ java.lang.String, 
    /* repeated */ js.Any, 
    java.lang.String
  ]
}
