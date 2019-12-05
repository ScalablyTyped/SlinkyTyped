package typingsSlinky.relayDashTestDashUtils

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayPaginationProp
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayProp
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayRefetchProp
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayDashTestDashUtils.libRelayMockPayloadGeneratorMod.MockResolvers
import typingsSlinky.relayDashTestDashUtils.libRelayModernMockEnvironmentMod.RelayMockEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils", JSImport.Namespace)
@js.native
object relayDashTestDashUtilsMod extends js.Object {
  def createMockEnvironment(): RelayMockEnvironment = js.native
  def createMockEnvironment(config: Anon_HandlerProvider): RelayMockEnvironment = js.native
  def unwrapContainer[Props](ComponentClass: ReactComponentClass[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ReactComponentClass[Props] = js.native
  @js.native
  object MockEnvironment extends js.Object {
    def createMockEnvironment(): RelayMockEnvironment = js.native
    def createMockEnvironment(config: Anon_HandlerProvider): RelayMockEnvironment = js.native
  }
  
  @js.native
  object MockPayloadGenerator extends js.Object {
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
}

