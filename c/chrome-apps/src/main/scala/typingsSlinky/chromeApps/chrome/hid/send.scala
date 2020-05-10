package typingsSlinky.chromeApps.chrome.hid

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.send")
@js.native
object send extends js.Object {
  /**
    * Send an output report to the device.
    * Note: Do not include a report ID prefix in data. It will be added if necessary.
    * @param connectionId The connectionId returned by connect.
    * @param reportId reportId - The report ID or 0 if none.
    * @param data The report data.
    * @param callback
    */
  def apply(
    connectionId: integer,
    reportId: integer,
    data: js.typedarray.ArrayBuffer,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

