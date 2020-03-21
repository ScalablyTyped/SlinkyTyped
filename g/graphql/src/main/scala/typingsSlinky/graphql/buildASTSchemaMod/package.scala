package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildASTSchemaMod {
  type TypeDefinitionsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.astMod.TypeDefinitionNode]
  type TypeResolver = js.Function1[
    /* typeRef */ typingsSlinky.graphql.astMod.NamedTypeNode, 
    typingsSlinky.graphql.definitionMod.GraphQLNamedType
  ]
}
