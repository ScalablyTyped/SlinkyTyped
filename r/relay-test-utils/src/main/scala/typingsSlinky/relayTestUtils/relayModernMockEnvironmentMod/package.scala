package typingsSlinky.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayModernMockEnvironmentMod {
  type OperationMockResolver = js.Function1[
    /* operation */ typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor, 
    typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse | js.Error | scala.Null
  ]
}
