package typingsSlinky.graphql.getIntrospectionQueryMod

import typingsSlinky.graphql.graphqlStrings.ENUM
import typingsSlinky.graphql.graphqlStrings.INPUT_OBJECT
import typingsSlinky.graphql.graphqlStrings.SCALAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionScalarType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionEnumType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionInputType extends js.Object
object IntrospectionInputType {
  
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  
  @scala.inline
  def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
}
