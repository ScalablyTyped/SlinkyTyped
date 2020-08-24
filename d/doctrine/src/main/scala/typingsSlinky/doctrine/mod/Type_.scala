package typingsSlinky.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.doctrine.mod.`type`.AllLiteral
  - typingsSlinky.doctrine.mod.`type`.ArrayType
  - typingsSlinky.doctrine.mod.`type`.FieldType
  - typingsSlinky.doctrine.mod.`type`.FunctionType
  - typingsSlinky.doctrine.mod.`type`.NameExpression
  - typingsSlinky.doctrine.mod.`type`.NonNullableType
  - typingsSlinky.doctrine.mod.`type`.NullableLiteral
  - typingsSlinky.doctrine.mod.`type`.NullableType
  - typingsSlinky.doctrine.mod.`type`.NullLiteral
  - typingsSlinky.doctrine.mod.`type`.OptionalType
  - typingsSlinky.doctrine.mod.`type`.ParameterType
  - typingsSlinky.doctrine.mod.`type`.RecordType
  - typingsSlinky.doctrine.mod.`type`.RestType
  - typingsSlinky.doctrine.mod.`type`.TypeApplication
  - typingsSlinky.doctrine.mod.`type`.UndefinedLiteral
  - typingsSlinky.doctrine.mod.`type`.UnionType
  - typingsSlinky.doctrine.mod.`type`.VoidLiteral
*/
trait Type_ extends js.Object

object Type_ {
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.TypeApplication
  ): Type_ = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ParameterType(expression: Type_, name: String, `type`: typingsSlinky.doctrine.doctrineStrings.ParameterType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableType(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NullableType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RecordType(fields: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.RecordType): Type_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.NullLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def AllLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FunctionType(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType
  ): Type_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NonNullableType(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RestType(`type`: typingsSlinky.doctrine.doctrineStrings.RestType): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ArrayType(elements: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.ArrayType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FieldType(key: String, `type`: typingsSlinky.doctrine.doctrineStrings.FieldType): Type_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def OptionalType(expression: Type_, `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NameExpression(name: String, `type`: typingsSlinky.doctrine.doctrineStrings.NameExpression): Type_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def VoidLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UndefinedLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UnionType(elements: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.UnionType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
}

