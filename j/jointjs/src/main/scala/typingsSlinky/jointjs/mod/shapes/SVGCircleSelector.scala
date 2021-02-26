package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGCircleSelector extends Selectors {
  
  var circle: js.UndefOr[SVGCircleAttributes] = js.native
}
object SVGCircleSelector {
  
  @scala.inline
  def apply(): SVGCircleSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleSelector]
  }
  
  @scala.inline
  implicit class SVGCircleSelectorMutableBuilder[Self <: SVGCircleSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: SVGCircleAttributes): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
  }
}
