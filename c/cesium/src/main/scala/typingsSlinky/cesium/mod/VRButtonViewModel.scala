package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VRButtonViewModel")
@js.native
class VRButtonViewModel protected () extends js.Object {
  def this(scene: Scene, vrElement: String) = this()
  def this(scene: Scene, vrElement: Element) = this()
  
  var command: Command = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var isVREnabled: Boolean = js.native
  
  var isVRMode: Boolean = js.native
  
  var tooltip: String = js.native
  
  var vrElement: Element = js.native
}
