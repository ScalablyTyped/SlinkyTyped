package typingsSlinky.reactRelay.mod

import typingsSlinky.relayRuntime.mod.FragmentRef
import typingsSlinky.relayRuntime.mod.RefType
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay", "readInlineData")
@js.native
object readInlineData extends js.Object {
  
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
}
