package typingsSlinky.graphql.introspectionQueryMod

import typingsSlinky.graphql.graphqlStrings.ENUM
import typingsSlinky.graphql.graphqlStrings.INTERFACE
import typingsSlinky.graphql.graphqlStrings.OBJECT
import typingsSlinky.graphql.graphqlStrings.SCALAR
import typingsSlinky.graphql.graphqlStrings.UNION
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionScalarType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionObjectType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionInterfaceType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionUnionType
  - typingsSlinky.graphql.introspectionQueryMod.IntrospectionEnumType
*/
trait IntrospectionOutputType extends js.Object

object IntrospectionOutputType {
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String, description: js.UndefOr[Null | Maybe[String]] = js.undefined): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionEnumType(
    enumValues: js.Array[IntrospectionEnumValue],
    kind: ENUM,
    name: String,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]],
    kind: OBJECT,
    name: String,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
  @scala.inline
  def IntrospectionUnionType(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionOutputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOutputType]
  }
}

