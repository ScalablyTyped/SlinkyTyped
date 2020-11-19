package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SelectionIndicator")
@js.native
class SelectionIndicator protected () extends js.Object {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: SelectionIndicatorViewModel = js.native
}
