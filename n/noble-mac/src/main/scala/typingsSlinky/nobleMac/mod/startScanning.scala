package typingsSlinky.nobleMac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("noble-mac", "startScanning")
@js.native
object startScanning extends js.Object {
  
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def apply(serviceUUIDs: js.Array[String]): Unit = js.native
  def apply(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = js.native
  def apply(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
