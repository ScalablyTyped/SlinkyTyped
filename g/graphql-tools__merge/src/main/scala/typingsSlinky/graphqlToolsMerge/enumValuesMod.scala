package typingsSlinky.graphqlToolsMerge

import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge/typedefs-mergers/enum-values", JSImport.Namespace)
@js.native
object enumValuesMod extends js.Object {
  
  def mergeEnumValues(
    first: js.Array[EnumValueDefinitionNode],
    second: js.Array[EnumValueDefinitionNode],
    config: Config
  ): js.Array[EnumValueDefinitionNode] = js.native
}
