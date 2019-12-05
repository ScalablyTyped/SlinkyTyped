package typingsSlinky.cordovaDashPluginDashBleDashCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralData extends js.Object {
  var advertising: scala.scalajs.js.typedarray.ArrayBuffer | js.Any
  var id: String
  var name: String
  var rssi: Double
}

object PeripheralData {
  @scala.inline
  def apply(
    advertising: scala.scalajs.js.typedarray.ArrayBuffer | js.Any,
    id: String,
    name: String,
    rssi: Double
  ): PeripheralData = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeripheralData]
  }
}

