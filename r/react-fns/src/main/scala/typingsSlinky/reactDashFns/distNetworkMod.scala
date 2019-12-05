package typingsSlinky.reactDashFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashFns.distNetworkNetworkMod.NetworkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Network", JSImport.Namespace)
@js.native
object distNetworkMod extends js.Object {
  @js.native
  class Network ()
    extends typingsSlinky.reactDashFns.distNetworkNetworkMod.Network
  
  def withNetwork[Props](Component: ReactComponentClass[Props with NetworkProps]): ReactComponentClass[Props] = js.native
}

