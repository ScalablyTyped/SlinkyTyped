package typingsSlinky.relayTestUtils

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.mod.RelayPaginationProp
import typingsSlinky.reactRelay.mod.RelayProp
import typingsSlinky.reactRelay.mod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
@js.native
object unwrapContainerMod extends js.Object {
  
  def unwrapContainer[Props](ComponentClass: ReactComponentClass[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ReactComponentClass[Props] = js.native
}
