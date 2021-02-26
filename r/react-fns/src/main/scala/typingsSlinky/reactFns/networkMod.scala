package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.networkNetworkMod.NetworkProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("react-fns/dist/Network", "Network")
  @js.native
  class Network protected ()
    extends typingsSlinky.reactFns.networkNetworkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/Network", "withNetwork")
  @js.native
  def withNetwork[Props](Component: ReactComponentClass[Props with NetworkProps]): ReactComponentClass[Props] = js.native
}
