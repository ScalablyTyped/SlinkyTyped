package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGRectSelector extends Selectors {
  
  var rect: js.UndefOr[SVGRectAttributes] = js.native
}
object SVGRectSelector {
  
  @scala.inline
  def apply(): SVGRectSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectSelector]
  }
  
  @scala.inline
  implicit class SVGRectSelectorMutableBuilder[Self <: SVGRectSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRect(value: SVGRectAttributes): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
