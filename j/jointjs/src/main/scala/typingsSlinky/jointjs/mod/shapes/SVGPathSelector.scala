package typingsSlinky.jointjs.mod.shapes

import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSelector extends Selectors {
  
  var path: js.UndefOr[SVGPathAttributes] = js.native
}
object SVGPathSelector {
  
  @scala.inline
  def apply(): SVGPathSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathSelector]
  }
  
  @scala.inline
  implicit class SVGPathSelectorMutableBuilder[Self <: SVGPathSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: SVGPathAttributes): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
