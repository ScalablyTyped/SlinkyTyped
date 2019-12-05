package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesBuildASTSchemaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.languageAstMod.NamedTypeNode
  import typingsSlinky.graphql.languageAstMod.TypeDefinitionNode
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType

  type TypeDefinitionsMap = StringDictionary[TypeDefinitionNode]
  type TypeResolver = js.Function1[/* typeRef */ NamedTypeNode, GraphQLNamedType]
}
