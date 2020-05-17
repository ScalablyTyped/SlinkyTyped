package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.DestinationRecordingName
import typingsSlinky.ariClient.anon.RecordingName
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordings extends js.Object {
  def cancel(params: RecordingName): js.Promise[Unit] = js.native
  def cancel(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def copyStored(params: DestinationRecordingName): js.Promise[StoredRecording] = js.native
  def copyStored(
    params: DestinationRecordingName,
    callback: js.Function2[/* err */ js.Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  def deleteStored(params: RecordingName): js.Promise[Unit] = js.native
  def deleteStored(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def getLive(params: RecordingName): js.Promise[LiveRecording] = js.native
  def getLive(
    params: RecordingName,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def getStored(params: RecordingName): js.Promise[StoredRecording] = js.native
  def getStored(
    params: RecordingName,
    callback: js.Function2[/* err */ js.Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  def getStoredFile(params: RecordingName): js.Promise[Buffer] = js.native
  def getStoredFile(params: RecordingName, callback: js.Function2[/* err */ js.Error, /* binary */ Buffer, Unit]): Unit = js.native
  def listStored(): js.Promise[js.Array[StoredRecording]] = js.native
  /* Methods */
  def listStored(callback: js.Function2[/* err */ js.Error, /* storedrecordings */ js.Array[StoredRecording], Unit]): Unit = js.native
  def mute(params: RecordingName): js.Promise[Unit] = js.native
  def mute(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pause(params: RecordingName): js.Promise[Unit] = js.native
  def pause(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def stop(params: RecordingName): js.Promise[Unit] = js.native
  def stop(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unmute(params: RecordingName): js.Promise[Unit] = js.native
  def unmute(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unpause(params: RecordingName): js.Promise[Unit] = js.native
  def unpause(params: RecordingName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

