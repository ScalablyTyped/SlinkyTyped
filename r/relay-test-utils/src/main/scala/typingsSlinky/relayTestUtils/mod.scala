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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MockPayloadGenerator {
    
    @JSImport("relay-test-utils", "MockPayloadGenerator.generate")
    @js.native
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    @JSImport("relay-test-utils", "MockPayloadGenerator.generate")
    @js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
  @JSImport("relay-test-utils", "createMockEnvironment")
  @js.native
  def createMockEnvironment(): RelayMockEnvironment = js.native
  @JSImport("relay-test-utils", "createMockEnvironment")
  @js.native
  def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = js.native
  
  @JSImport("relay-test-utils", "unwrapContainer")
  @js.native
  def unwrapContainer[Props](ComponentClass: ReactComponentClass[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ReactComponentClass[Props] = js.native
}
