package typingsSlinky.googleMapsReact.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-maps-react", "GoogleApiWrapper")
@js.native
object GoogleApiWrapper extends js.Object {
  def apply(opts: GoogleApiOptionsFunc): js.Function1[
    /* ctor */ ReactComponentClass[IProvidedProps], 
    ReactComponentClass[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
  def apply(opts: IGoogleApiOptions): js.Function1[
    /* ctor */ ReactComponentClass[IProvidedProps], 
    ReactComponentClass[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
}

