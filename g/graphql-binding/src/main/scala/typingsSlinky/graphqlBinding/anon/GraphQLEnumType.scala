package typingsSlinky.graphqlBinding.anon

import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLEnumType extends js.Object {
  def GraphQLEnumType(`type`: typingsSlinky.graphql.mod.GraphQLEnumType): String = js.native
  def GraphQLIDType(`type`: GraphQLScalarType): String = js.native
  def GraphQLInputObjectType(`type`: typingsSlinky.graphql.mod.GraphQLInputObjectType): String = js.native
  def GraphQLInputObjectType(`type`: GraphQLInterfaceType): String = js.native
  def GraphQLInputObjectType(`type`: GraphQLObjectType[_, _]): String = js.native
  def GraphQLInterfaceType(`type`: GraphQLInputObjectType): String = js.native
  def GraphQLInterfaceType(`type`: typingsSlinky.graphql.mod.GraphQLInterfaceType): String = js.native
  def GraphQLInterfaceType(`type`: GraphQLObjectType[_, _]): String = js.native
  def GraphQLObjectType(`type`: GraphQLInputObjectType): String = js.native
  def GraphQLObjectType(`type`: GraphQLInterfaceType): String = js.native
  def GraphQLObjectType(`type`: typingsSlinky.graphql.mod.GraphQLObjectType[_, _]): String = js.native
  def GraphQLScalarType(`type`: typingsSlinky.graphql.mod.GraphQLScalarType): String = js.native
  def GraphQLUnionType(`type`: typingsSlinky.graphql.mod.GraphQLUnionType): String = js.native
}

