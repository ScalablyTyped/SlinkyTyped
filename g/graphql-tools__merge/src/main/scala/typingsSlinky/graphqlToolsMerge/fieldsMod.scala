package typingsSlinky.graphqlToolsMerge

import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphqlToolsMerge.anon.Name
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge/typedefs-mergers/fields", JSImport.Namespace)
@js.native
object fieldsMod extends js.Object {
  
  def mergeFields[T /* <: FieldDefinitionNode | InputValueDefinitionNode */](`type`: Name, f1: js.Array[T], f2: js.Array[T], config: Config): js.Array[T] = js.native
}
