package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.mod.FragmentRef
import typingsSlinky.relayRuntime.mod.RefType
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/readInlineData", JSImport.Namespace)
@js.native
object readInlineDataMod extends js.Object {
  
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
  @JSName("readInlineData")
  def readInlineData_T_RefTypeWildcard_Union[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
}
