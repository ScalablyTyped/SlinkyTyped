package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationOperation
import typingsSlinky.relayRuntime.readerNodeMod.ReaderArgumentDefinition
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderSelection
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernGraphQLTagMod {
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getFragment")
  @js.native
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getInlineDataFragment")
  @js.native
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getNode")
  @js.native
  def getNode(taggedNode: js.Any): js.Any = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getPaginationFragment")
  @js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getRefetchableFragment")
  @js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "getRequest")
  @js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "graphql")
  @js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "isFragment")
  @js.native
  def isFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "isInlineDataFragment")
  @js.native
  def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", "isRequest")
  @js.native
  def isRequest(node: GraphQLTaggedNode): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
    - typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment | typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
  
  trait _GraphQLTaggedNode extends StObject
  object _GraphQLTaggedNode {
    
    @scala.inline
    def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
    }
    
    @scala.inline
    def ReaderFragment(
      argumentDefinitions: js.Array[ReaderArgumentDefinition],
      kind: String,
      name: String,
      selections: js.Array[ReaderSelection],
      `type`: String
    ): typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment = {
      val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment]
    }
  }
}
