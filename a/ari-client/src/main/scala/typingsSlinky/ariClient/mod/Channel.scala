package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.AppArgsSnoopId
import typingsSlinky.ariClient.anon.AppString
import typingsSlinky.ariClient.anon.Before
import typingsSlinky.ariClient.anon.DirectionString
import typingsSlinky.ariClient.anon.Encapsulation
import typingsSlinky.ariClient.anon.EndpointString
import typingsSlinky.ariClient.anon.Extension
import typingsSlinky.ariClient.anon.Format
import typingsSlinky.ariClient.anon.Formats
import typingsSlinky.ariClient.anon.Label
import typingsSlinky.ariClient.anon.MohClassString
import typingsSlinky.ariClient.anon.Offsetms
import typingsSlinky.ariClient.anon.PlaybackId
import typingsSlinky.ariClient.anon.ReasonString
import typingsSlinky.ariClient.anon.Timeout
import typingsSlinky.ariClient.anon.Value
import typingsSlinky.ariClient.anon.Whisper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends Resource {
  var accountcode: String = js.native
  var caller: CallerID = js.native
  var channelvars: js.UndefOr[IndexableObject] = js.native
  var connected: CallerID = js.native
  var creationtime: js.Date = js.native
  var dialplan: DialplanCEP = js.native
  /* Properties */
  var id: String = js.native
  var language: String = js.native
  var name: String = js.native
  var state: String = js.native
  def answer(): js.Promise[Unit] = js.native
  def answer(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def continueInDialplan(): js.Promise[Unit] = js.native
  def continueInDialplan(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def continueInDialplan(params: Label): js.Promise[Unit] = js.native
  def continueInDialplan(params: Label, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(params: Formats): js.Promise[Channel] = js.native
  def create(params: Formats, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def dial(): js.Promise[Unit] = js.native
  def dial(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def dial(params: Timeout): js.Promise[Unit] = js.native
  def dial(params: Timeout, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def externalMedia(params: Encapsulation): js.Promise[Channel] = js.native
  def externalMedia(params: Encapsulation, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def get(): js.Promise[Channel] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def getChannelVar(params: typingsSlinky.ariClient.anon.Variable): js.Promise[Variable] = js.native
  def getChannelVar(
    params: typingsSlinky.ariClient.anon.Variable,
    callback: js.Function2[/* err */ js.Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  def hangup(): js.Promise[Unit] = js.native
  def hangup(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def hangup(params: ReasonString): js.Promise[Unit] = js.native
  def hangup(params: ReasonString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def hold(): js.Promise[Unit] = js.native
  def hold(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Channel]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* channels */ js.Array[this.type], Unit]): Unit = js.native
  def move(params: AppString): js.Promise[Unit] = js.native
  def move(params: AppString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def mute(): js.Promise[Unit] = js.native
  def mute(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def mute(params: DirectionString): js.Promise[Unit] = js.native
  def mute(params: DirectionString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def originate(params: Extension): js.Promise[Channel] = js.native
  def originate(params: Extension, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def originateWithId(params: Extension): js.Promise[Channel] = js.native
  def originateWithId(params: Extension, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def play(params: Offsetms, playback: Playback): js.Promise[Playback] = js.native
  def play(
    params: Offsetms,
    playback: Playback,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def playWithId(params: PlaybackId): js.Promise[Playback] = js.native
  def playWithId(params: PlaybackId, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: Format, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  def record(
    params: Format,
    recording: LiveRecording,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def redirect(params: EndpointString): js.Promise[Unit] = js.native
  def redirect(params: EndpointString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ring(): js.Promise[Unit] = js.native
  def ring(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ringStop(): js.Promise[Unit] = js.native
  def ringStop(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def rtpstatistics(): js.Promise[RTPstat] = js.native
  def rtpstatistics(callback: js.Function2[/* err */ js.Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  def sendDTMF(): js.Promise[Unit] = js.native
  def sendDTMF(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def sendDTMF(params: Before): js.Promise[Unit] = js.native
  def sendDTMF(params: Before, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setChannelVar(params: Value): js.Promise[Unit] = js.native
  def setChannelVar(params: Value, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def snoopChannel(params: Whisper, snoopChannel: Channel): js.Promise[Channel] = js.native
  def snoopChannel(
    params: Whisper,
    snoopChannel: Channel,
    callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  def snoopChannelWithId(params: AppArgsSnoopId): js.Promise[Channel] = js.native
  def snoopChannelWithId(params: AppArgsSnoopId, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def startMoh(): js.Promise[Unit] = js.native
  def startMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: MohClassString): js.Promise[Unit] = js.native
  def startMoh(params: MohClassString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startSilence(): js.Promise[Unit] = js.native
  def startSilence(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopMoh(): js.Promise[Unit] = js.native
  def stopMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopSilence(): js.Promise[Unit] = js.native
  def stopSilence(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unhold(): js.Promise[Unit] = js.native
  def unhold(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unmute(): js.Promise[Unit] = js.native
  def unmute(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unmute(params: DirectionString): js.Promise[Unit] = js.native
  def unmute(params: DirectionString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

