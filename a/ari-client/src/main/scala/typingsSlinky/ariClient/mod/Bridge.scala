package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.Anon1
import typingsSlinky.ariClient.AnonChannelIdString
import typingsSlinky.ariClient.AnonFormat
import typingsSlinky.ariClient.AnonMohClassString
import typingsSlinky.ariClient.AnonMute
import typingsSlinky.ariClient.AnonOffsetms
import typingsSlinky.ariClient.AnonPlaybackId
import typingsSlinky.ariClient.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends Resource {
  var bridge_class: String = js.native
  var bridge_type: String = js.native
  var channels: String | js.Array[String] = js.native
  var creationtime: js.Date = js.native
  var creator: String = js.native
  /* Properties */
  var id: String = js.native
  var name: String = js.native
  var technology: String = js.native
  var video_mode: js.UndefOr[String] = js.native
  var video_source_id: js.UndefOr[String] = js.native
  def addChannel(params: AnonMute): js.Promise[Unit] = js.native
  def addChannel(params: AnonMute, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def clearVideoSource(): js.Promise[Unit] = js.native
  def clearVideoSource(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(): js.Promise[Bridge] = js.native
  def create(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def create(params: AnonType): js.Promise[Bridge] = js.native
  def create(params: AnonType, callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def createWithId(): js.Promise[Bridge] = js.native
  def createWithId(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def createWithId(params: AnonType): js.Promise[Bridge] = js.native
  def createWithId(params: AnonType, callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def destroy(): js.Promise[Unit] = js.native
  def destroy(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(): js.Promise[Bridge] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* bridges */ js.Array[this.type], Unit]): Unit = js.native
  def play(params: AnonOffsetms): js.Promise[Playback] = js.native
  def play(params: AnonOffsetms, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: AnonPlaybackId): js.Promise[Playback] = js.native
  def playWithId(params: AnonPlaybackId, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: AnonFormat, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  def record(
    params: AnonFormat,
    recording: LiveRecording,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def removeChannel(params: Anon1): js.Promise[Unit] = js.native
  def removeChannel(params: Anon1, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setVideoSource(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def setVideoSource(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(): js.Promise[Unit] = js.native
  def startMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: AnonMohClassString): js.Promise[Unit] = js.native
  def startMoh(params: AnonMohClassString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopMoh(): js.Promise[Unit] = js.native
  def stopMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

