package typingsSlinky.relayRuntime.relayModernGraphQLTagMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
  - typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
  - js.Function0[
typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment | typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
*/
trait GraphQLTaggedNode extends js.Object

object GraphQLTaggedNode {
  @scala.inline
  implicit def apply(value: ConcreteRequest): GraphQLTaggedNode = value.asInstanceOf[GraphQLTaggedNode]
  @scala.inline
  implicit def apply(value: js.Function0[ReaderFragment | ConcreteRequest]): GraphQLTaggedNode = value.asInstanceOf[GraphQLTaggedNode]
  @scala.inline
  implicit def apply(value: ReaderFragment): GraphQLTaggedNode = value.asInstanceOf[GraphQLTaggedNode]
}

