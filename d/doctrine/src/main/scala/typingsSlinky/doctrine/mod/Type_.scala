package typingsSlinky.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Type_ extends StObject
object Type_ {
  
  @scala.inline
  def AllLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral): typingsSlinky.doctrine.mod.`type`.AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.AllLiteral]
  }
  
  @scala.inline
  def ArrayType(elements: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.ArrayType): typingsSlinky.doctrine.mod.`type`.ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.ArrayType]
  }
  
  @scala.inline
  def FieldType(key: String, `type`: typingsSlinky.doctrine.doctrineStrings.FieldType): typingsSlinky.doctrine.mod.`type`.FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.FieldType]
  }
  
  @scala.inline
  def FunctionType(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType
  ): typingsSlinky.doctrine.mod.`type`.FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.FunctionType]
  }
  
  @scala.inline
  def NameExpression(name: String, `type`: typingsSlinky.doctrine.doctrineStrings.NameExpression): typingsSlinky.doctrine.mod.`type`.NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.NameExpression]
  }
  
  @scala.inline
  def NonNullableType(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType): typingsSlinky.doctrine.mod.`type`.NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.NonNullableType]
  }
  
  @scala.inline
  def NullLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.NullLiteral): typingsSlinky.doctrine.mod.`type`.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.NullLiteral]
  }
  
  @scala.inline
  def NullableLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): typingsSlinky.doctrine.mod.`type`.NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.NullableLiteral]
  }
  
  @scala.inline
  def NullableType(expression: Type_, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NullableType): typingsSlinky.doctrine.mod.`type`.NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.NullableType]
  }
  
  @scala.inline
  def OptionalType(expression: Type_, `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType): typingsSlinky.doctrine.mod.`type`.OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.OptionalType]
  }
  
  @scala.inline
  def ParameterType(expression: Type_, name: String, `type`: typingsSlinky.doctrine.doctrineStrings.ParameterType): typingsSlinky.doctrine.mod.`type`.ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.ParameterType]
  }
  
  @scala.inline
  def RecordType(fields: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.RecordType): typingsSlinky.doctrine.mod.`type`.RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.RecordType]
  }
  
  @scala.inline
  def RestType(`type`: typingsSlinky.doctrine.doctrineStrings.RestType): typingsSlinky.doctrine.mod.`type`.RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.RestType]
  }
  
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.TypeApplication
  ): typingsSlinky.doctrine.mod.`type`.TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.TypeApplication]
  }
  
  @scala.inline
  def UndefinedLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral): typingsSlinky.doctrine.mod.`type`.UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.UndefinedLiteral]
  }
  
  @scala.inline
  def UnionType(elements: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.UnionType): typingsSlinky.doctrine.mod.`type`.UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.UnionType]
  }
  
  @scala.inline
  def VoidLiteral(`type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral): typingsSlinky.doctrine.mod.`type`.VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.doctrine.mod.`type`.VoidLiteral]
  }
}
