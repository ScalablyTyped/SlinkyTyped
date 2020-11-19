package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/addTypes", JSImport.Namespace)
@js.native
object addTypesMod extends js.Object {
  
  def addTypes(schema: GraphQLSchema, newTypesOrDirectives: js.Array[GraphQLNamedType | GraphQLDirective]): GraphQLSchema = js.native
}
