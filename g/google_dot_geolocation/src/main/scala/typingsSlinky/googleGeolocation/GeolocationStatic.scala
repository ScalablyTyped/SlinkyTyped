package typingsSlinky.googleGeolocation

import org.scalajs.dom.raw.PositionOptions
import typingsSlinky.std.GeolocationPosition
import typingsSlinky.std.GeolocationPositionError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationStatic extends js.Object {
  
  def getCurrentPosition(success: js.Function1[/* position */ GeolocationPosition, Unit]): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.UndefOr[scala.Nothing],
    opts: PositionOptions
  ): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.Function1[/* positionError */ GeolocationPositionError, Unit]
  ): Unit = js.native
  def getCurrentPosition(
    success: js.Function1[/* position */ GeolocationPosition, Unit],
    error: js.Function1[/* positionError */ GeolocationPositionError, Unit],
    opts: PositionOptions
  ): Unit = js.native
  
  def init(): Boolean = js.native
  
  def showMap(latitude: Double, longitude: Double): Unit = js.native
}
