package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonDestinationRecordingName
import typingsSlinky.ariClient.AnonRecordingName
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordings extends js.Object {
  def cancel(params: AnonRecordingName): js.Promise[Unit] = js.native
  def cancel(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def copyStored(params: AnonDestinationRecordingName): js.Promise[StoredRecording] = js.native
  def copyStored(
    params: AnonDestinationRecordingName,
    callback: js.Function2[/* err */ js.Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  def deleteStored(params: AnonRecordingName): js.Promise[Unit] = js.native
  def deleteStored(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def getLive(params: AnonRecordingName): js.Promise[LiveRecording] = js.native
  def getLive(
    params: AnonRecordingName,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def getStored(params: AnonRecordingName): js.Promise[StoredRecording] = js.native
  def getStored(
    params: AnonRecordingName,
    callback: js.Function2[/* err */ js.Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  def getStoredFile(params: AnonRecordingName): js.Promise[Buffer] = js.native
  def getStoredFile(params: AnonRecordingName, callback: js.Function2[/* err */ js.Error, /* binary */ Buffer, Unit]): Unit = js.native
  def listStored(): js.Promise[js.Array[StoredRecording]] = js.native
  /* Methods */
  def listStored(callback: js.Function2[/* err */ js.Error, /* storedrecordings */ js.Array[StoredRecording], Unit]): Unit = js.native
  def mute(params: AnonRecordingName): js.Promise[Unit] = js.native
  def mute(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pause(params: AnonRecordingName): js.Promise[Unit] = js.native
  def pause(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stop(params: AnonRecordingName): js.Promise[Unit] = js.native
  def stop(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unmute(params: AnonRecordingName): js.Promise[Unit] = js.native
  def unmute(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unpause(params: AnonRecordingName): js.Promise[Unit] = js.native
  def unpause(params: AnonRecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

