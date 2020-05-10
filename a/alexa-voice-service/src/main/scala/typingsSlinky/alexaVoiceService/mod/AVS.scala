package typingsSlinky.alexaVoiceService.mod

import typingsSlinky.alexaVoiceService.AnonResponse
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
  def sendAudio(dataView: js.typedarray.DataView): js.Promise[AnonResponse] = js.native
  def startRecording(): js.Promise[Unit] = js.native
  def stopRecording(): js.Promise[js.UndefOr[js.typedarray.DataView]] = js.native
}

