package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphql.mod.GraphQLUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "renameType")
@js.native
object renameType extends js.Object {
  
  def apply(`type`: GraphQLNamedType, newTypeName: String): GraphQLNamedType = js.native
  def apply(`type`: GraphQLEnumType, newTypeName: String): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType, newTypeName: String): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType, newTypeName: String): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLObjectType[_, _], newTypeName: String): GraphQLObjectType[_, _] = js.native
  def apply(`type`: GraphQLScalarType, newTypeName: String): GraphQLScalarType = js.native
  def apply(`type`: GraphQLUnionType, newTypeName: String): GraphQLUnionType = js.native
}
