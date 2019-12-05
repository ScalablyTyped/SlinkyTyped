package typingsSlinky.relayDashTestDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayModernMockEnvironmentMod {
  import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
  import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor

  type OperationMockResolver = js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | js.Error | Null]
}
