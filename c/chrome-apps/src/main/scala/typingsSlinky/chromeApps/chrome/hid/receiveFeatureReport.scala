package typingsSlinky.chromeApps.chrome.hid

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.receiveFeatureReport")
@js.native
object receiveFeatureReport extends js.Object {
  /**
    * Request a feature report from the device.
    * @param connectionId The connectionId returned by connect.
    * @param reportId The report ID, or 0 if none.
    * @param callback Will provide `data` which contain the report data, including a report ID prefix if one is sent by the device.
    */
  def apply(
    connectionId: integer,
    reportId: integer,
    callback: js.Function1[/* data */ scala.scalajs.js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
}

