package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAnimateOptionRen extends ElementAnimateOptionsBase {
  
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: js.UndefOr[Position] = js.native
}
object ElementAnimateOptionRen {
  
  @scala.inline
  def apply(): ElementAnimateOptionRen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionRen]
  }
  
  @scala.inline
  implicit class ElementAnimateOptionRenMutableBuilder[Self <: ElementAnimateOptionRen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedPositionUndefined: Self = StObject.set(x, "renderedPosition", js.undefined)
  }
}
