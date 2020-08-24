package typingsSlinky.graphqlToolsStitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type MergeTypeFilter = js.Function2[
    /* mergeTypeCandidates */ js.Array[typingsSlinky.graphqlToolsStitch.typesMod.MergeTypeCandidate], 
    /* typeName */ java.lang.String, 
    scala.Boolean
  ]
  type OnTypeConflict = js.Function3[
    /* left */ typingsSlinky.graphql.definitionMod.GraphQLNamedType, 
    /* right */ typingsSlinky.graphql.definitionMod.GraphQLNamedType, 
    /* info */ js.UndefOr[typingsSlinky.graphqlToolsStitch.anon.Left], 
    typingsSlinky.graphql.definitionMod.GraphQLNamedType
  ]
  type SchemaLikeObject = typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig | typingsSlinky.graphql.mod.GraphQLSchema | java.lang.String | typingsSlinky.graphql.astMod.DocumentNode | js.Array[typingsSlinky.graphql.definitionMod.GraphQLNamedType]
}
