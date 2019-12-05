package typingsSlinky.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLDirective
import typingsSlinky.graphql.graphqlMod.GraphQLInputObjectType
import typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType
import typingsSlinky.graphql.graphqlMod.GraphQLObjectType
import typingsSlinky.graphql.languageAstMod.DefinitionNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.`object`
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.input
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/typeFromAST", JSImport.Namespace)
@js.native
object distStitchingTypeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  type GetType = js.Function2[
    /* name */ String, 
    /* type */ `object` | interface | input, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputObjectType | GraphQLInterfaceType
  ]
}

