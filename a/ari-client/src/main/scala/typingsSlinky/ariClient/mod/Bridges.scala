package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.AbsorbDTMF
import typingsSlinky.ariClient.anon.Beep
import typingsSlinky.ariClient.anon.BridgeId
import typingsSlinky.ariClient.anon.BridgeIdString
import typingsSlinky.ariClient.anon.ChannelId
import typingsSlinky.ariClient.anon.Lang
import typingsSlinky.ariClient.anon.Media
import typingsSlinky.ariClient.anon.MohClass
import typingsSlinky.ariClient.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridges extends js.Object {
  def addChannel(params: AbsorbDTMF): js.Promise[Unit] = js.native
  def addChannel(params: AbsorbDTMF, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def clearVideoSource(params: BridgeIdString): js.Promise[Unit] = js.native
  def clearVideoSource(params: BridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(): js.Promise[Bridge] = js.native
  def create(callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def create(params: BridgeId): js.Promise[Bridge] = js.native
  def create(params: BridgeId, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def createWithId(params: Name): js.Promise[Bridge] = js.native
  def createWithId(params: Name, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def destroy(params: BridgeIdString): js.Promise[Unit] = js.native
  def destroy(params: BridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: BridgeIdString): js.Promise[Bridge] = js.native
  def get(params: BridgeIdString, callback: js.Function2[/* err */ js.Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* bridges */ js.Array[Bridge], Unit]): Unit = js.native
  def play(params: Lang): js.Promise[Playback] = js.native
  def play(params: Lang, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: Media): js.Promise[Playback] = js.native
  def playWithId(params: Media, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: Beep): js.Promise[LiveRecording] = js.native
  def record(params: Beep, callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  def removeChannel(params: typingsSlinky.ariClient.anon.Channel): js.Promise[Unit] = js.native
  def removeChannel(params: typingsSlinky.ariClient.anon.Channel, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setVideoSource(params: ChannelId): js.Promise[Unit] = js.native
  def setVideoSource(params: ChannelId, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: MohClass): js.Promise[Unit] = js.native
  def startMoh(params: MohClass, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopMoh(params: BridgeIdString): js.Promise[Unit] = js.native
  def stopMoh(params: BridgeIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

