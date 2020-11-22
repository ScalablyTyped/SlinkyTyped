package typingsSlinky.reactThreeFiber.canvasMod

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactUseMeasure.mod.RectReadOnly
import typingsSlinky.three.mod.Clock
import typingsSlinky.three.mod.Raycaster
import typingsSlinky.three.mod.Scene
import typingsSlinky.three.mod.Vector2
import typingsSlinky.three.mod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedCanvasContext extends js.Object {
  
  var aspect: Double = js.native
  
  var camera: Camera = js.native
  
  var clock: Clock = js.native
  
  var events: DomEventHandlers = js.native
  
  def forceResize(): Unit = js.native
  
  var gl: WebGLRenderer = js.native
  
  def intersect(): Unit = js.native
  def intersect(event: DomEvent): Unit = js.native
  
  def invalidate(): Unit = js.native
  
  var mouse: Vector2 = js.native
  
  var raycaster: Raycaster = js.native
  
  var scene: Scene = js.native
  
  def setDefaultCamera(camera: Camera): Unit = js.native
  
  var size: RectReadOnly = js.native
  
  def subscribe(callback: MutableRefObject[RenderCallback]): js.Function0[Unit] = js.native
  def subscribe(callback: MutableRefObject[RenderCallback], priority: Double): js.Function0[Unit] = js.native
  
  var viewport: ViewportData = js.native
}
