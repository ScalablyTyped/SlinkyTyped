package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "addTypes")
@js.native
object addTypes extends js.Object {
  
  def apply(schema: GraphQLSchema, newTypesOrDirectives: js.Array[GraphQLNamedType | GraphQLDirective]): GraphQLSchema = js.native
}
