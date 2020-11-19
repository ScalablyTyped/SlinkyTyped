package typingsSlinky.amapJsApiMap3d.AMap

import typingsSlinky.amapJsApi.AMap.Layer
import typingsSlinky.amapJsApiMap3d.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3DLayer_ extends Layer {
  
  def add(object3d: Object3D): Unit = js.native
  
  def clear(): Unit = js.native
  
  def reDraw(): Unit = js.native
  
  def remove(object3d: Object3D): Unit = js.native
  
  // internal
  def setOption(options: Height): Unit = js.native
}
