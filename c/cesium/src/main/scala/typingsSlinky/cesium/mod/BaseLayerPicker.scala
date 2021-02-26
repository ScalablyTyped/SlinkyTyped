package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BaseLayerPicker")
@js.native
class BaseLayerPicker protected () extends StObject {
  def this(container: Element, options: typingsSlinky.cesium.anon.Globe) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: BaseLayerPickerViewModel = js.native
}
