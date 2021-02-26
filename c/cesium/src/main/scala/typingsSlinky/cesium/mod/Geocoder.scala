package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.anon.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Geocoder")
@js.native
class Geocoder protected () extends StObject {
  def this(options: Container) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: GeocoderViewModel = js.native
}
