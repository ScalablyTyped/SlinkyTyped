package typingsSlinky.aframe.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.std.EventListener
import typingsSlinky.three.mod.Camera
import typingsSlinky.three.mod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene
  extends Entity[ObjectMap[Component[js.Any, System[js.Any]]]] {
  
  def addEventListener(`type`: SceneEvents, listener: EventListener): Unit = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener, useCapture: Boolean): Unit = js.native
  
  var behaviors: js.Array[Behavior] = js.native
  
  var camera: Camera = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  var effect: js.UndefOr[js.Any] = js.native
  
  def enterVR(): js.Promise[Unit] | Unit = js.native
  
  def exitVR(): js.Promise[Unit] | Unit = js.native
  
  var isMobile: Boolean = js.native
  
  @JSName("object3D")
  var object3D_Scene: typingsSlinky.three.mod.Scene = js.native
  
  def reload(): Unit = js.native
  
  var renderStarted: Boolean = js.native
  
  var renderer: WebGLRenderer = js.native
  
  // THREE.VREffect
  var systems: ObjectMap[System[_]] = js.native
  
  var time: Double = js.native
}
