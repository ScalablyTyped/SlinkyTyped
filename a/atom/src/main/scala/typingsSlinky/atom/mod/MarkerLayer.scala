package typingsSlinky.atom.mod

import typingsSlinky.atom.anon.ExclusiveInvalidate
import typingsSlinky.atom.anon.`27`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerLayer extends StObject {
  
  /** Remove all markers from this layer. */
  def clear(): Unit = js.native
  
  // Lifecycle
  /** Create a copy of this layer with markers in the same state and locations. */
  def copy(): MarkerLayer = js.native
  
  /** Destroy this layer. */
  def destroy(): Boolean = js.native
  
  /** Find markers in the layer conforming to the given parameters. */
  def findMarkers(params: FindMarkerOptions): js.Array[Marker] = js.native
  
  // Querying
  /** Get an existing marker by its id. */
  def getMarker(id: Double): js.UndefOr[Marker] = js.native
  
  /** Get the number of markers in the marker layer. */
  def getMarkerCount(): Double = js.native
  
  /** Get all existing markers on the marker layer. */
  def getMarkers(): js.Array[Marker] = js.native
  
  /** Get the role of the marker layer e.g. "atom.selection". */
  def getRole(): js.UndefOr[String] = js.native
  
  /** The identifier for this MarkerLayer. */
  val id: String = js.native
  
  /** Determine whether this layer has been destroyed. */
  def isDestroyed(): Boolean = js.native
  
  /** Create a marker at with its head at the given position with no tail. */
  def markPosition(position: PointCompatible): Marker = js.native
  def markPosition(position: PointCompatible, options: `27`): Marker = js.native
  
  // Marker Creation
  /** Create a marker with the given range. */
  def markRange(range: RangeCompatible): Marker = js.native
  def markRange(range: RangeCompatible, options: ExclusiveInvalidate): Marker = js.native
  
  /**
    *  Subscribe to be notified synchronously whenever markers are created on
    *  this layer.
    */
  def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, Unit]): Disposable = js.native
  
  /** Subscribe to be notified synchronously when this layer is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  // Event Subscription
  /**
    *  Subscribe to be notified asynchronously whenever markers are created,
    *  updated, or destroyed on this layer.
    */
  def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
}
