package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLEnumType
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object introspectionMod extends js.Object {
  @JSName("__Directive")
  val Directive: GraphQLObjectType[js.Any, js.Any] = js.native
  @JSName("__DirectiveLocation")
  val DirectiveLocation: GraphQLEnumType = js.native
  @JSName("__EnumValue")
  val EnumValue: GraphQLObjectType[js.Any, js.Any] = js.native
  @JSName("__Field")
  val Field: GraphQLObjectType[js.Any, js.Any] = js.native
  @JSName("__InputValue")
  val InputValue: GraphQLObjectType[js.Any, js.Any] = js.native
  @JSName("__Schema")
  val Schema: GraphQLObjectType[js.Any, js.Any] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Type")
  val Type: GraphQLObjectType[js.Any, js.Any] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__TypeKind")
  val _TypeKind: GraphQLEnumType = js.native
  val introspectionTypes: js.Array[GraphQLNamedType] = js.native
  def isIntrospectionType(`type`: GraphQLNamedType): Boolean = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typingsSlinky.graphql.graphqlStrings.ENUM = js.native
    var INPUT_OBJECT: typingsSlinky.graphql.graphqlStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsSlinky.graphql.graphqlStrings.INTERFACE = js.native
    var LIST: typingsSlinky.graphql.graphqlStrings.LIST = js.native
    var NON_NULL: typingsSlinky.graphql.graphqlStrings.NON_NULL = js.native
    var OBJECT: typingsSlinky.graphql.graphqlStrings.OBJECT = js.native
    var SCALAR: typingsSlinky.graphql.graphqlStrings.SCALAR = js.native
    var UNION: typingsSlinky.graphql.graphqlStrings.UNION = js.native
  }
  
}

