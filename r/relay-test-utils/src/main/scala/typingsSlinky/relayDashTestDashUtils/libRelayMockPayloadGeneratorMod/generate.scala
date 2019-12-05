package typingsSlinky.relayDashTestDashUtils.libRelayMockPayloadGeneratorMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", "generate")
@js.native
object generate extends js.Object {
  def apply(operation: OperationDescriptor): GraphQLResponse = js.native
  def apply(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
}

