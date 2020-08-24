package typingsSlinky.graphqlToolsResolversComposition

import typingsSlinky.graphqlToolsResolversComposition.resolversCompositionMod.ResolversComposerMapping
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/resolvers-composition", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def composeResolvers[Resolvers /* <: Record[String, _] */](resolvers: Resolvers): Resolvers = js.native
  def composeResolvers[Resolvers /* <: Record[String, _] */](resolvers: Resolvers, mapping: ResolversComposerMapping[Resolvers]): Resolvers = js.native
}

