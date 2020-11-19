package typingsSlinky.relayTestUtils.relayMockPayloadGeneratorMod

import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", "generate")
@js.native
object generate extends js.Object {
  
  def apply(operation: OperationDescriptor): GraphQLResponse = js.native
  def apply(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
}
