package typingsSlinky.kurentoClient.mod.KurentoClient

import typingsSlinky.kurentoClient.kurentoClientStrings.OnIceCandidate
import typingsSlinky.kurentoClient.kurentoClientStrings.Paused
import typingsSlinky.kurentoClient.kurentoClientStrings.Recording
import typingsSlinky.kurentoClient.kurentoClientStrings.Stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInstance extends js.Object {
  def close(): Unit = js.native
  @JSName("create")
  def create_MediaPipeline(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.MediaPipeline): js.Promise[MediaPipeline] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.WebRtcEndpoint): js.Promise[WebRtcEndpoint] = js.native
  def getMediaobjectById(objectId: String): js.Promise[_] = js.native
  @JSName("on")
  def on_Error(
    event: typingsSlinky.kurentoClient.kurentoClientStrings.Error,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnIceCandidate(event: OnIceCandidate, callback: js.Function1[/* event */ IceCandidate, Unit]): Unit = js.native
  @JSName("on")
  def on_Paused(event: Paused, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_Recording(event: Recording, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_Stopped(event: Stopped, callback: js.Function0[Unit]): Unit = js.native
}

