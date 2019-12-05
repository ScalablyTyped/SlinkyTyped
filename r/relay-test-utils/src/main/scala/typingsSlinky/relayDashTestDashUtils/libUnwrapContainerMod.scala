package typingsSlinky.relayDashTestDashUtils

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayPaginationProp
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayProp
import typingsSlinky.reactDashRelay.reactDashRelayMod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
@js.native
object libUnwrapContainerMod extends js.Object {
  def unwrapContainer[Props](ComponentClass: ReactComponentClass[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ReactComponentClass[Props] = js.native
}

