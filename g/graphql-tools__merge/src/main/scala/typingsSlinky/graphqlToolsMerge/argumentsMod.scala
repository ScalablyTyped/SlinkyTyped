package typingsSlinky.graphqlToolsMerge

import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge/typedefs-mergers/arguments", JSImport.Namespace)
@js.native
object argumentsMod extends js.Object {
  
  def mergeArguments(
    args1: js.Array[InputValueDefinitionNode],
    args2: js.Array[InputValueDefinitionNode],
    config: Config
  ): js.Array[InputValueDefinitionNode] = js.native
}
