package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.backgroundServiceEventReceived
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordingStateChanged
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.BackgroundServiceEventReceivedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.ClearEventsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.RecordingStateChangedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.SetRecordingRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.StartObservingRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.StopObservingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundServiceApi extends StObject {
  
  /**
    * Clears all stored data for the service.
    */
  def clearEvents(params: ClearEventsRequest): js.Promise[Unit] = js.native
  
  /**
    * Called with all existing backgroundServiceEvents when enabled, and all new
    * events afterwards if enabled and recording.
    */
  @JSName("on")
  def on_backgroundServiceEventReceived(
    event: backgroundServiceEventReceived,
    listener: js.Function1[/* params */ BackgroundServiceEventReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Called when the recording state for the service has been updated.
    */
  @JSName("on")
  def on_recordingStateChanged(
    event: recordingStateChanged,
    listener: js.Function1[/* params */ RecordingStateChangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Set the recording state for the service.
    */
  def setRecording(params: SetRecordingRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables event updates for the service.
    */
  def startObserving(params: StartObservingRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables event updates for the service.
    */
  def stopObserving(params: StopObservingRequest): js.Promise[Unit] = js.native
}
