package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
@js.native
object relayModernGraphQLTagMod extends js.Object {
  
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  
  def getNode(taggedNode: js.Any): js.Any = js.native
  
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  def isFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  def isRequest(node: GraphQLTaggedNode): Boolean = js.native
  
  trait _GraphQLTaggedNode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
    - typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment | typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
}
