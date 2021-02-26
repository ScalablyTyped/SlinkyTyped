package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGPolygonAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolygonSelector extends Selectors {
  
  var polygon: js.UndefOr[SVGPolygonAttributes] = js.native
}
object SVGPolygonSelector {
  
  @scala.inline
  def apply(): SVGPolygonSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonSelector]
  }
  
  @scala.inline
  implicit class SVGPolygonSelectorMutableBuilder[Self <: SVGPolygonSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolygon(value: SVGPolygonAttributes): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
  }
}
