package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.DestinationRecordingNameString
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoredRecording extends Resource {
  
  /**
    * Stop a live recording and discard it.
    */
  def cancel(): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and discard it.
    */
  def cancel(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Copy a stored recording.
    *
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(params: DestinationRecordingNameString): js.Promise[StoredRecording] = js.native
  /**
    * Copy a stored recording.
    *
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(
    params: DestinationRecordingNameString,
    callback: js.Function2[/* err */ js.Error, /* storedrecording */ this.type, Unit]
  ): Unit = js.native
  
  /**
    * Delete a stored recording.
    */
  def deleteStored(): js.Promise[Unit] = js.native
  /**
    * Delete a stored recording.
    */
  def deleteStored(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Format.
    */
  var format: String = js.native
  
  /**
    * List live recordings.
    */
  def getLive(): js.Promise[LiveRecording] = js.native
  /**
    * List live recordings.
    */
  def getLive(callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  
  /**
    * Get a stored recordings details.
    */
  def getStored(): js.Promise[StoredRecording] = js.native
  /**
    * Get a stored recordings details.
    */
  def getStored(callback: js.Function2[/* err */ js.Error, /* storedrecording */ this.type, Unit]): Unit = js.native
  
  /**
    * Get the file associated with the stored recording.
    */
  def getStoredFile(): js.Promise[Buffer] = js.native
  /**
    * Get the file associated with the stored recording.
    */
  def getStoredFile(callback: js.Function2[/* err */ js.Error, /* binary */ Buffer, Unit]): Unit = js.native
  
  /**
    * List recordings that are complete.
    */
  def listStored(): js.Promise[js.Array[StoredRecording]] = js.native
  /**
    * List recordings that are complete.
    */
  def listStored(callback: js.Function2[/* err */ js.Error, /* storedrecordings */ js.Array[this.type], Unit]): Unit = js.native
  
  /**
    * Mute a live recording.
    * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
    */
  def mute(): js.Promise[Unit] = js.native
  /**
    * Mute a live recording.
    * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
    */
  def mute(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Name.
    */
  var name: String = js.native
  
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    */
  def pause(): js.Promise[Unit] = js.native
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    */
  def pause(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Stop a live recording and store it.
    */
  def stop(): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and store it.
    */
  def stop(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Unmute a live recording.
    */
  def unmute(): js.Promise[Unit] = js.native
  /**
    * Unmute a live recording.
    */
  def unmute(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Unpause a live recording.
    */
  def unpause(): js.Promise[Unit] = js.native
  /**
    * Unpause a live recording.
    */
  def unpause(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
