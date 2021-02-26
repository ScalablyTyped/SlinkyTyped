package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.`bottom-left`
import typingsSlinky.c3.c3Strings.`bottom-right`
import typingsSlinky.c3.c3Strings.`top-left`
import typingsSlinky.c3.c3Strings.`top-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends StObject {
  
  /**
    * Decides the position of the legend.
    * Defaults to `"top-left"`.
    */
  var anchor: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.native
  
  /**
    * Defines the max step the legend has (e.g. If `step=2` and legend has 3 items, the legend has 2 columns).
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Set the horizontal position of the legend based on the anchor.
    * Defaults to `10`.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Set the vertical position of the legend based on the anchor.
    * Defaults to `0`.
    */
  var y: js.UndefOr[Double] = js.native
}
object Anchor {
  
  @scala.inline
  def apply(): Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
