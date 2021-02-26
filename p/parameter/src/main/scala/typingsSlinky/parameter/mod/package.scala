package typingsSlinky.parameter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* static member */
  @scala.inline
  def CONVERT_MAP: typingsSlinky.std.Record[java.lang.String, js.UndefOr[typingsSlinky.parameter.mod.ParameterConvertType]] = typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CONVERT_MAP").asInstanceOf[typingsSlinky.std.Record[java.lang.String, js.UndefOr[typingsSlinky.parameter.mod.ParameterConvertType]]]
  @scala.inline
  def CONVERT_MAP_=(
    x: typingsSlinky.std.Record[java.lang.String, js.UndefOr[typingsSlinky.parameter.mod.ParameterConvertType]]
  ): scala.Unit = typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].updateDynamic("CONVERT_MAP")(x.asInstanceOf[js.Any])
  
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
  
  @scala.inline
  def TYPE_MAP: typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[typingsSlinky.parameter.mod.ParameterCheckFunction[java.lang.String]]
  ] = typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_MAP").asInstanceOf[typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[typingsSlinky.parameter.mod.ParameterCheckFunction[java.lang.String]]
  ]]
  
  @scala.inline
  def addRule[T /* <: java.lang.String */](`type`: T, check: js.RegExp): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](`type`: T, check: js.RegExp, convertType: typingsSlinky.parameter.mod.ParameterConvertType): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](
    `type`: T,
    check: js.RegExp,
    `override`: js.UndefOr[scala.Nothing],
    convertType: typingsSlinky.parameter.mod.ParameterConvertType
  ): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](`type`: T, check: js.RegExp, `override`: scala.Boolean): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](
    `type`: T,
    check: js.RegExp,
    `override`: scala.Boolean,
    convertType: typingsSlinky.parameter.mod.ParameterConvertType
  ): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /* static member */
  @scala.inline
  def addRule[T /* <: java.lang.String */](`type`: T, check: typingsSlinky.parameter.mod.ParameterCheckFunction[T]): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /**
    * Add custom rules
    * @param type
    * @param check
    * @param override Override exist rules. Default: `true`
    * @param convertType Make parameter convert the input param to the specific type
    */
  /* static member */
  @scala.inline
  def addRule[T /* <: java.lang.String */](
    `type`: T,
    check: typingsSlinky.parameter.mod.ParameterCheckFunction[T],
    convertType: typingsSlinky.parameter.mod.ParameterConvertType
  ): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](
    `type`: T,
    check: typingsSlinky.parameter.mod.ParameterCheckFunction[T],
    `override`: js.UndefOr[scala.Nothing],
    convertType: typingsSlinky.parameter.mod.ParameterConvertType
  ): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](`type`: T, check: typingsSlinky.parameter.mod.ParameterCheckFunction[T], `override`: scala.Boolean): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addRule[T /* <: java.lang.String */](
    `type`: T,
    check: typingsSlinky.parameter.mod.ParameterCheckFunction[T],
    `override`: scala.Boolean,
    convertType: typingsSlinky.parameter.mod.ParameterConvertType
  ): scala.Unit = (typingsSlinky.parameter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
