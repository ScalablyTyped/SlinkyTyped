package typingsSlinky.reactDashLeaflet.reactDashLeafletMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashLeaflet.reactDashLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "withLeaflet")
@js.native
object withLeaflet extends js.Object {
  def apply[T /* <: ContextProps */](WrappedComponent: ReactComponentClass[T]): ReactComponentClass[Omit[T, leaflet]] = js.native
}

