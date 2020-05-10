package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonAfter
import typingsSlinky.ariClient.AnonAppAppArgs
import typingsSlinky.ariClient.AnonAppArgs
import typingsSlinky.ariClient.AnonCaller
import typingsSlinky.ariClient.AnonCallerId
import typingsSlinky.ariClient.AnonChannelIdEndpoint
import typingsSlinky.ariClient.AnonChannelIdLang
import typingsSlinky.ariClient.AnonChannelIdMohClass
import typingsSlinky.ariClient.AnonChannelIdString
import typingsSlinky.ariClient.AnonChannelIdValue
import typingsSlinky.ariClient.AnonChannelIdVariable
import typingsSlinky.ariClient.AnonConnectiontype
import typingsSlinky.ariClient.AnonContext
import typingsSlinky.ariClient.AnonDirection
import typingsSlinky.ariClient.AnonEndpoint
import typingsSlinky.ariClient.AnonIfExists
import typingsSlinky.ariClient.AnonReason
import typingsSlinky.ariClient.AnonSkipms
import typingsSlinky.ariClient.AnonSnoopId
import typingsSlinky.ariClient.AnonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channels extends js.Object {
  def answer(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def answer(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def continueInDialplan(params: AnonContext): js.Promise[Unit] = js.native
  def continueInDialplan(params: AnonContext, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def create(params: AnonEndpoint): js.Promise[Channel] = js.native
  def create(params: AnonEndpoint, callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]): Unit = js.native
  def dial(params: AnonCaller): js.Promise[Unit] = js.native
  def dial(params: AnonCaller, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def externalMedia(params: AnonConnectiontype): js.Promise[Channel] = js.native
  def externalMedia(
    params: AnonConnectiontype,
    callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]
  ): Unit = js.native
  def get(params: AnonChannelIdString): js.Promise[Channel] = js.native
  def get(
    params: AnonChannelIdString,
    callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]
  ): Unit = js.native
  def getChannelVar(params: AnonChannelIdVariable): js.Promise[Variable] = js.native
  def getChannelVar(
    params: AnonChannelIdVariable,
    callback: js.Function2[/* err */ js.Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  def hangup(params: AnonReason): js.Promise[Unit] = js.native
  def hangup(params: AnonReason, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def hold(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def hold(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Channel]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* channels */ js.Array[Channel], Unit]): Unit = js.native
  def move(params: AnonAppAppArgs): js.Promise[Unit] = js.native
  def move(params: AnonAppAppArgs, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def mute(params: AnonDirection): js.Promise[Unit] = js.native
  def mute(params: AnonDirection, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def originate(params: AnonAppArgs): js.Promise[Channel] = js.native
  def originate(params: AnonAppArgs, callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]): Unit = js.native
  def originateWithId(params: AnonCallerId): js.Promise[Channel] = js.native
  def originateWithId(params: AnonCallerId, callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]): Unit = js.native
  def play(params: AnonSkipms): js.Promise[Playback] = js.native
  def play(params: AnonSkipms, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: AnonChannelIdLang): js.Promise[Playback] = js.native
  def playWithId(
    params: AnonChannelIdLang,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def record(params: AnonIfExists): js.Promise[LiveRecording] = js.native
  def record(
    params: AnonIfExists,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def redirect(params: AnonChannelIdEndpoint): js.Promise[Unit] = js.native
  def redirect(params: AnonChannelIdEndpoint, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ring(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def ring(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ringStop(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def ringStop(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def rtpstatistics(params: AnonChannelIdString): js.Promise[RTPstat] = js.native
  def rtpstatistics(
    params: AnonChannelIdString,
    callback: js.Function2[/* err */ js.Error, /* rtpstat */ RTPstat, Unit]
  ): Unit = js.native
  def sendDTMF(params: AnonAfter): js.Promise[Unit] = js.native
  def sendDTMF(params: AnonAfter, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setChannelVar(params: AnonChannelIdValue): js.Promise[Unit] = js.native
  def setChannelVar(params: AnonChannelIdValue, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def snoopChannel(params: AnonSnoopId): js.Promise[Channel] = js.native
  def snoopChannel(params: AnonSnoopId, callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]): Unit = js.native
  def snoopChannelWithId(params: AnonSpy): js.Promise[Channel] = js.native
  def snoopChannelWithId(params: AnonSpy, callback: js.Function2[/* err */ js.Error, /* channel */ Channel, Unit]): Unit = js.native
  def startMoh(params: AnonChannelIdMohClass): js.Promise[Unit] = js.native
  def startMoh(params: AnonChannelIdMohClass, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startSilence(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def startSilence(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopMoh(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def stopMoh(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stopSilence(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def stopSilence(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unhold(params: AnonChannelIdString): js.Promise[Unit] = js.native
  def unhold(params: AnonChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unmute(params: AnonDirection): js.Promise[Unit] = js.native
  def unmute(params: AnonDirection, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

