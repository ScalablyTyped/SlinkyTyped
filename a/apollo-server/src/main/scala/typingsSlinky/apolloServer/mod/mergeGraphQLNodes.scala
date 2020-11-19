package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphqlToolsMerge.mergeNodesMod.MergedResultMap
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "mergeGraphQLNodes")
@js.native
object mergeGraphQLNodes extends js.Object {
  
  def apply(nodes: js.Array[DefinitionNode]): MergedResultMap = js.native
  def apply(nodes: js.Array[DefinitionNode], config: Config): MergedResultMap = js.native
}
