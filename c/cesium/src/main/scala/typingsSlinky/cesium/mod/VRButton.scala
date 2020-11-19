package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VRButton")
@js.native
class VRButton protected () extends js.Object {
  def this(container: String, scene: Scene, vrElement: String) = this()
  def this(container: String, scene: Scene, vrElement: Element) = this()
  def this(container: Element, scene: Scene, vrElement: String) = this()
  def this(container: Element, scene: Scene, vrElement: Element) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: VRButtonViewModel = js.native
}
