package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.layerPainted
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.layerTreeDidChange
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LayerPaintedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LayerTreeDidChangeEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.ReleaseSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerTreeApi extends js.Object {
  
  /**
    * Provides the reasons why the given layer was composited.
    */
  def compositingReasons(params: CompositingReasonsRequest): js.Promise[CompositingReasonsResponse] = js.native
  
  /**
    * Disables compositing tree inspection.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables compositing tree inspection.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns the snapshot identifier.
    */
  def loadSnapshot(params: LoadSnapshotRequest): js.Promise[LoadSnapshotResponse] = js.native
  
  /**
    * Returns the layer snapshot identifier.
    */
  def makeSnapshot(params: MakeSnapshotRequest): js.Promise[MakeSnapshotResponse] = js.native
  
  @JSName("on")
  def on_layerPainted(event: layerPainted, listener: js.Function1[/* params */ LayerPaintedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_layerTreeDidChange(event: layerTreeDidChange, listener: js.Function1[/* params */ LayerTreeDidChangeEvent, Unit]): Unit = js.native
  
  def profileSnapshot(params: ProfileSnapshotRequest): js.Promise[ProfileSnapshotResponse] = js.native
  
  /**
    * Releases layer snapshot captured by the back-end.
    */
  def releaseSnapshot(params: ReleaseSnapshotRequest): js.Promise[Unit] = js.native
  
  /**
    * Replays the layer snapshot and returns the resulting bitmap.
    */
  def replaySnapshot(params: ReplaySnapshotRequest): js.Promise[ReplaySnapshotResponse] = js.native
  
  /**
    * Replays the layer snapshot and returns canvas log.
    */
  def snapshotCommandLog(params: SnapshotCommandLogRequest): js.Promise[SnapshotCommandLogResponse] = js.native
}
