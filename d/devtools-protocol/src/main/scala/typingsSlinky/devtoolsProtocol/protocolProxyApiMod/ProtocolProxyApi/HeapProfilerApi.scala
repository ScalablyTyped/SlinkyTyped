package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.addHeapSnapshotChunk
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.heapStatsUpdate
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.lastSeenObjectId
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.reportHeapSnapshotProgress
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.resetProfiles
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.AddHeapSnapshotChunkEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.AddInspectedHeapObjectRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetSamplingProfileResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.HeapStatsUpdateEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.LastSeenObjectIdEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.ReportHeapSnapshotProgressEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.StartSamplingRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.StartTrackingHeapObjectsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.StopSamplingResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.StopTrackingHeapObjectsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.TakeHeapSnapshotRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapProfilerApi extends StObject {
  
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  def addInspectedHeapObject(params: AddInspectedHeapObjectRequest): js.Promise[Unit] = js.native
  
  def collectGarbage(): js.Promise[Unit] = js.native
  
  def disable(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  def getHeapObjectId(params: GetHeapObjectIdRequest): js.Promise[GetHeapObjectIdResponse] = js.native
  
  def getObjectByHeapObjectId(params: GetObjectByHeapObjectIdRequest): js.Promise[GetObjectByHeapObjectIdResponse] = js.native
  
  def getSamplingProfile(): js.Promise[GetSamplingProfileResponse] = js.native
  
  @JSName("on")
  def on_addHeapSnapshotChunk(event: addHeapSnapshotChunk, listener: js.Function1[/* params */ AddHeapSnapshotChunkEvent, Unit]): Unit = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  def on_heapStatsUpdate(event: heapStatsUpdate, listener: js.Function1[/* params */ HeapStatsUpdateEvent, Unit]): Unit = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  def on_lastSeenObjectId(event: lastSeenObjectId, listener: js.Function1[/* params */ LastSeenObjectIdEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_reportHeapSnapshotProgress(
    event: reportHeapSnapshotProgress,
    listener: js.Function1[/* params */ ReportHeapSnapshotProgressEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_resetProfiles(event: resetProfiles, listener: js.Function0[Unit]): Unit = js.native
  
  def startSampling(params: StartSamplingRequest): js.Promise[Unit] = js.native
  
  def startTrackingHeapObjects(params: StartTrackingHeapObjectsRequest): js.Promise[Unit] = js.native
  
  def stopSampling(): js.Promise[StopSamplingResponse] = js.native
  
  def stopTrackingHeapObjects(params: StopTrackingHeapObjectsRequest): js.Promise[Unit] = js.native
  
  def takeHeapSnapshot(params: TakeHeapSnapshotRequest): js.Promise[Unit] = js.native
}
