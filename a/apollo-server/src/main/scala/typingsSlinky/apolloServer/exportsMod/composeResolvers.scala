package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsResolversComposition.resolversCompositionMod.ResolversComposerMapping
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "composeResolvers")
@js.native
object composeResolvers extends js.Object {
  
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers): Resolvers = js.native
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers, mapping: ResolversComposerMapping[Resolvers]): Resolvers = js.native
}
