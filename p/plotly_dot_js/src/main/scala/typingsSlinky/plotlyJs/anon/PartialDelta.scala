package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
@js.native
trait PartialDelta extends StObject {
  
  var decreasing: js.UndefOr[Symbol] = js.native
  
  var increasing: js.UndefOr[Symbol] = js.native
  
  var position: js.UndefOr[top | bottom | left | right] = js.native
  
  var reference: js.UndefOr[Double] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var valueformat: js.UndefOr[String] = js.native
}
object PartialDelta {
  
  @scala.inline
  def apply(): PartialDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDelta]
  }
  
  @scala.inline
  implicit class PartialDeltaMutableBuilder[Self <: PartialDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecreasing(value: Symbol): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreasingUndefined: Self = StObject.set(x, "decreasing", js.undefined)
    
    @scala.inline
    def setIncreasing(value: Symbol): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasingUndefined: Self = StObject.set(x, "increasing", js.undefined)
    
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    @scala.inline
    def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueformatUndefined: Self = StObject.set(x, "valueformat", js.undefined)
  }
}
