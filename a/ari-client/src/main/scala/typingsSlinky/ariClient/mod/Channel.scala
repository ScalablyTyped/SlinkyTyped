package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonAppArgsSnoopId
import typingsSlinky.ariClient.AnonAppString
import typingsSlinky.ariClient.AnonBefore
import typingsSlinky.ariClient.AnonDirectionString
import typingsSlinky.ariClient.AnonEncapsulation
import typingsSlinky.ariClient.AnonEndpointString
import typingsSlinky.ariClient.AnonExtension
import typingsSlinky.ariClient.AnonFormat
import typingsSlinky.ariClient.AnonFormats
import typingsSlinky.ariClient.AnonLabel
import typingsSlinky.ariClient.AnonMohClassString
import typingsSlinky.ariClient.AnonOffsetms
import typingsSlinky.ariClient.AnonPlaybackId
import typingsSlinky.ariClient.AnonReasonString
import typingsSlinky.ariClient.AnonTimeout
import typingsSlinky.ariClient.AnonValue
import typingsSlinky.ariClient.AnonVariable
import typingsSlinky.ariClient.AnonWhisper
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
  def continueInDialplan(params: AnonLabel): js.Promise[Unit] = js.native
  def continueInDialplan(params: AnonLabel, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(params: AnonFormats): js.Promise[Channel] = js.native
  def create(params: AnonFormats, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def dial(): js.Promise[Unit] = js.native
  def dial(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def dial(params: AnonTimeout): js.Promise[Unit] = js.native
  def dial(params: AnonTimeout, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def externalMedia(params: AnonEncapsulation): js.Promise[Channel] = js.native
  def externalMedia(
    params: AnonEncapsulation,
    callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  def get(): js.Promise[Channel] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def getChannelVar(params: AnonVariable): js.Promise[Variable] = js.native
  def getChannelVar(params: AnonVariable, callback: js.Function2[/* err */ js.Error, /* variable */ Variable, Unit]): Unit = js.native
  def hangup(): js.Promise[Unit] = js.native
  def hangup(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def hangup(params: AnonReasonString): js.Promise[Unit] = js.native
  def hangup(params: AnonReasonString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def hold(): js.Promise[Unit] = js.native
  def hold(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Channel]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* channels */ js.Array[this.type], Unit]): Unit = js.native
  def move(params: AnonAppString): js.Promise[Unit] = js.native
  def move(params: AnonAppString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def mute(): js.Promise[Unit] = js.native
  def mute(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def mute(params: AnonDirectionString): js.Promise[Unit] = js.native
  def mute(params: AnonDirectionString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def originate(params: AnonExtension): js.Promise[Channel] = js.native
  def originate(params: AnonExtension, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def originateWithId(params: AnonExtension): js.Promise[Channel] = js.native
  def originateWithId(params: AnonExtension, callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]): Unit = js.native
  def play(params: AnonOffsetms, playback: Playback): js.Promise[Playback] = js.native
  def play(
    params: AnonOffsetms,
    playback: Playback,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def playWithId(params: AnonPlaybackId): js.Promise[Playback] = js.native
  def playWithId(params: AnonPlaybackId, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: AnonFormat, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  def record(
    params: AnonFormat,
    recording: LiveRecording,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def redirect(params: AnonEndpointString): js.Promise[Unit] = js.native
  def redirect(params: AnonEndpointString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ring(): js.Promise[Unit] = js.native
  def ring(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ringStop(): js.Promise[Unit] = js.native
  def ringStop(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def rtpstatistics(): js.Promise[RTPstat] = js.native
  def rtpstatistics(callback: js.Function2[/* err */ js.Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  def sendDTMF(): js.Promise[Unit] = js.native
  def sendDTMF(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def sendDTMF(params: AnonBefore): js.Promise[Unit] = js.native
  def sendDTMF(params: AnonBefore, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setChannelVar(params: AnonValue): js.Promise[Unit] = js.native
  def setChannelVar(params: AnonValue, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def snoopChannel(params: AnonWhisper, snoopChannel: Channel): js.Promise[Channel] = js.native
  def snoopChannel(
    params: AnonWhisper,
    snoopChannel: Channel,
    callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  def snoopChannelWithId(params: AnonAppArgsSnoopId): js.Promise[Channel] = js.native
  def snoopChannelWithId(
    params: AnonAppArgsSnoopId,
    callback: js.Function2[/* err */ js.Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  def startMoh(): js.Promise[Unit] = js.native
  def startMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: AnonMohClassString): js.Promise[Unit] = js.native
  def startMoh(params: AnonMohClassString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
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
  def unmute(params: AnonDirectionString): js.Promise[Unit] = js.native
  def unmute(params: AnonDirectionString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

