package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphqlToolsMerge.mergeResolversMod.MergeResolversOptions
import typingsSlinky.graphqlToolsMerge.mergeResolversMod.ResolversDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "mergeResolvers")
@js.native
object mergeResolvers extends js.Object {
  
  def apply[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T]): T = js.native
  def apply[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T], options: MergeResolversOptions): T = js.native
}
