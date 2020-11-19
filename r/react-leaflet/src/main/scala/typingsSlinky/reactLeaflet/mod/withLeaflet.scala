package typingsSlinky.reactLeaflet.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactLeaflet.reactLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "withLeaflet")
@js.native
object withLeaflet extends js.Object {
  
  def apply[T /* <: ContextProps */](WrappedComponent: ReactComponentClass[T]): ReactComponentClass[Omit[T, leaflet]] = js.native
}
