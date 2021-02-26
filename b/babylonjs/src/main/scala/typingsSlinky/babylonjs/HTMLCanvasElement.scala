package typingsSlinky.babylonjs

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCanvasElement extends StObject {
  
  /** Capture Stream method defined by some browsers */
  def captureStream(): MediaStream = js.native
  def captureStream(fps: Double): MediaStream = js.native
  
  /** Track wether a record is in progress */
  var isRecording: Boolean = js.native
  
  var mozRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  
  var msRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  
  def requestPointerLock(): Unit = js.native
  
  var webkitRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
}
