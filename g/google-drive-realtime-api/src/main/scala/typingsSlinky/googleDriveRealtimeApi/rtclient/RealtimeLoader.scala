package typingsSlinky.googleDriveRealtimeApi.rtclient

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeLoader extends js.Object {
  def handleErrors(e: Error): Unit = js.native
  def load(): Unit = js.native
  def start(): Unit = js.native
}

@JSGlobal("rtclient.RealtimeLoader")
@js.native
object RealtimeLoader extends TopLevel[RealtimeLoaderFactory]

