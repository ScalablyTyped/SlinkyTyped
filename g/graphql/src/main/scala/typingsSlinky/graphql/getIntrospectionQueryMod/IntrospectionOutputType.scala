package typingsSlinky.graphql.getIntrospectionQueryMod

import typingsSlinky.graphql.graphqlStrings.ENUM
import typingsSlinky.graphql.graphqlStrings.INTERFACE
import typingsSlinky.graphql.graphqlStrings.OBJECT
import typingsSlinky.graphql.graphqlStrings.SCALAR
import typingsSlinky.graphql.graphqlStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionScalarType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionObjectType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionInterfaceType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionUnionType
  - typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionEnumType
*/
trait IntrospectionOutputType extends js.Object

object IntrospectionOutputType {
  @scala.inline
  def IntrospectionUnionType(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[
      IntrospectionNamedTypeRef[typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionInterfaceType]
    ],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]],
    kind: OBJECT,
    name: String
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
}

