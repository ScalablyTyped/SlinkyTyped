package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object typeIntrospectionMod extends js.Object {
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Directive: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: GraphQLEnumType = js.native
  val __EnumValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Field: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __InputValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Schema: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Type: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __TypeKind: GraphQLEnumType = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
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

