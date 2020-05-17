package typingsSlinky.relayTestUtils

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.mod.RelayPaginationProp
import typingsSlinky.reactRelay.mod.RelayProp
import typingsSlinky.reactRelay.mod.RelayRefetchProp
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayTestUtils.anon.HandlerProvider
import typingsSlinky.relayTestUtils.relayMockPayloadGeneratorMod.MockResolvers
import typingsSlinky.relayTestUtils.relayModernMockEnvironmentMod.RelayMockEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMockEnvironment(): RelayMockEnvironment = js.native
  def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = js.native
  def unwrapContainer[Props](ComponentClass: ReactComponentClass[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ReactComponentClass[Props] = js.native
  @js.native
  object MockPayloadGenerator extends js.Object {
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
}

