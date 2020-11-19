package typingsSlinky.openjscad.OpenJsCad

import typingsSlinky.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewer extends js.Object {
  
  def animate(): Unit = js.native
  
  def applyDrawOptions(): Unit = js.native
  
  var bgColor_ : js.Any = js.native
  
  var camera_ : js.Any = js.native
  
  def cancelAnimate(): Unit = js.native
  
  var canvas: js.Any = js.native
  
  def clear(): Unit = js.native
  
  var containerElm_ : js.Any = js.native
  
  var controls_ : js.Any = js.native
  
  def createCamera(): Unit = js.native
  
  def createControls(canvas: js.Any): Unit = js.native
  
  def createRenderer(bool_noWebGL: js.Any): Unit = js.native
  
  def createScene(drawAxes: js.Any, axLen: js.Any): Unit = js.native
  
  var defaultColor_ : js.Any = js.native
  
  def drawAxes(axLen: js.Any): Unit = js.native
  
  var drawOptions: js.Any = js.native
  
  def getUserMeshes(): js.Array[Object3D] = js.native
  def getUserMeshes(str: js.Any): js.Array[Object3D] = js.native
  
  def handleResize(): Unit = js.native
  
  def parseSizeParams(): Unit = js.native
  
  var pauseRender_ : js.Any = js.native
  
  var perspective: js.Any = js.native
  
  def refreshRenderer(bool_noWebGL: js.Any): Unit = js.native
  
  def render(): Unit = js.native
  
  var renderer_ : js.Any = js.native
  
  var requestID_ : js.Any = js.native
  
  def resetZoom(r: js.Any): Unit = js.native
  
  var scene_ : js.Any = js.native
  
  def setCsg(csg: js.Any, resetZoom: js.Any): Unit = js.native
  
  var size: js.Any = js.native
  
  def webGLAvailable(): Boolean = js.native
}
