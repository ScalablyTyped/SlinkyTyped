package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Geolocation
@JSImport("rx", "DOM.geolocation")
@js.native
object geolocation extends js.Object {
  def getCurrentPosition(): typingsSlinky.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def getCurrentPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def watchPosition(): typingsSlinky.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  def watchPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
}

