package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingLayer extends TileLayer {
  
  def imagerySet(): Unit = js.native
  
  @JSName("options")
  var options_BingLayer: BingLayerOptions = js.native
}
object BingLayer {
  
  @scala.inline
  def apply(hide: () => Unit, imagerySet: () => Unit, map: Map, options: BingLayerOptions, show: () => Unit): BingLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), imagerySet = js.Any.fromFunction0(imagerySet), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BingLayer]
  }
  
  @scala.inline
  implicit class BingLayerMutableBuilder[Self <: BingLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagerySet(value: () => Unit): Self = StObject.set(x, "imagerySet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: BingLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
