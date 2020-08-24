package typingsSlinky.graphqlToolsMerge.mergeTypedefsMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.Source
import typingsSlinky.graphqlToolsMerge.anon.OmitPartialConfigcommentD
import typingsSlinky.graphqlToolsMerge.anon.PartialConfigcommentDescr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/merge-typedefs", "mergeTypeDefs")
@js.native
object mergeTypeDefs extends js.Object {
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema]): DocumentNode = js.native
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: OmitPartialConfigcommentD): DocumentNode = js.native
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: PartialConfigcommentDescr): String = js.native
}

