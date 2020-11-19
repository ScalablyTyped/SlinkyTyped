package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "correctASTNodes")
@js.native
object correctASTNodes extends js.Object {
  
  def apply(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLObjectType[_, _]): GraphQLObjectType[_, _] = js.native
}
