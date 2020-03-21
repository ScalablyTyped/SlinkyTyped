package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.networkNetworkMod.NetworkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Network", JSImport.Namespace)
@js.native
object networkMod extends js.Object {
  @js.native
  class Network ()
    extends typingsSlinky.reactFns.networkNetworkMod.Network
  
  def withNetwork[Props](Component: ReactComponentClass[Props with NetworkProps]): ReactComponentClass[Props] = js.native
}

