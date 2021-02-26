package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGEllipseAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGEllipseSelector extends Selectors {
  
  var ellipse: js.UndefOr[SVGEllipseAttributes] = js.native
}
object SVGEllipseSelector {
  
  @scala.inline
  def apply(): SVGEllipseSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGEllipseSelector]
  }
  
  @scala.inline
  implicit class SVGEllipseSelectorMutableBuilder[Self <: SVGEllipseSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipse(value: SVGEllipseAttributes): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
  }
}
