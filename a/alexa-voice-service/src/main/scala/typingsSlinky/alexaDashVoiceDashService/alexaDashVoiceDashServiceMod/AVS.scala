package typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

import typingsSlinky.alexaDashVoiceDashService.Anon_Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVS extends js.Object {
  var player: Player = js.native
  def on(eventType: EventTypes): Unit = js.native
  def on(eventType: EventTypes, callback: js.Function0[Unit]): Unit = js.native
  def refreshToken(): js.Promise[TokenResponse] = js.native
  def requestMic(): js.Promise[_] = js.native
  def sendAudio(dataView: scala.scalajs.js.typedarray.DataView): js.Promise[Anon_Response] = js.native
  def startRecording(): js.Promise[Unit] = js.native
  def stopRecording(): js.Promise[js.UndefOr[scala.scalajs.js.typedarray.DataView]] = js.native
}

