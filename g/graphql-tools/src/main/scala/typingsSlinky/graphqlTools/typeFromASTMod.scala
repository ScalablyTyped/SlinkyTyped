package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlTools.graphqlToolsStrings.`object`
import typingsSlinky.graphqlTools.graphqlToolsStrings.input
import typingsSlinky.graphqlTools.graphqlToolsStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  type GetType = js.Function2[
    /* name */ String, 
    /* type */ `object` | interface | input, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputObjectType | GraphQLInterfaceType
  ]
}

