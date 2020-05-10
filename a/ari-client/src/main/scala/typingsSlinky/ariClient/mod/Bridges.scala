package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonAbsorbDTMF
import typingsSlinky.ariClient.AnonBeep
import typingsSlinky.ariClient.AnonBridgeId
import typingsSlinky.ariClient.AnonBridgeIdString
import typingsSlinky.ariClient.AnonChannel
import typingsSlinky.ariClient.AnonChannelId
import typingsSlinky.ariClient.AnonLang
import typingsSlinky.ariClient.AnonMedia
import typingsSlinky.ariClient.AnonMohClass
import typingsSlinky.ariClient.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridges extends js.Object {
  def addChannel(params: AnonAbsorbDTMF): js.Promise[Unit] = js.native
  def addChannel(params: AnonAbsorbDTMF, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def clearVideoSource(params: AnonBridgeIdString): js.Promise[Unit] = js.native
  def clearVideoSource(params: AnonBridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(): js.Promise[Bridge] = js.native
  def create(callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def create(params: AnonBridgeId): js.Promise[Bridge] = js.native
  def create(params: AnonBridgeId, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def createWithId(params: AnonName): js.Promise[Bridge] = js.native
  def createWithId(params: AnonName, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def destroy(params: AnonBridgeIdString): js.Promise[Unit] = js.native
  def destroy(params: AnonBridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: AnonBridgeIdString): js.Promise[Bridge] = js.native
  def get(params: AnonBridgeIdString, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* bridges */ js.Array[Bridge], Unit]): Unit = js.native
  def play(params: AnonLang): js.Promise[Playback] = js.native
  def play(params: AnonLang, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: AnonMedia): js.Promise[Playback] = js.native
  def playWithId(params: AnonMedia, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: AnonBeep): js.Promise[LiveRecording] = js.native
  def record(
    params: AnonBeep,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def removeChannel(params: AnonChannel): js.Promise[Unit] = js.native
  def removeChannel(params: AnonChannel, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setVideoSource(params: AnonChannelId): js.Promise[Unit] = js.native
  def setVideoSource(params: AnonChannelId, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: AnonMohClass): js.Promise[Unit] = js.native
  def startMoh(params: AnonMohClass, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopMoh(params: AnonBridgeIdString): js.Promise[Unit] = js.native
  def stopMoh(params: AnonBridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

