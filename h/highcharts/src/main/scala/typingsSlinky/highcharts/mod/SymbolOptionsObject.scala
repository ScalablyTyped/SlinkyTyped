package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolOptionsObject extends StObject {
  
  /**
    * The anchor X position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorX: js.UndefOr[Double] = js.native
  
  /**
    * The anchor Y position for the `callout` symbol. This is where the chevron
    * points to.
    */
  var anchorY: js.UndefOr[Double] = js.native
  
  /**
    * The end angle of an `arc` symbol.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Whether to draw `arc` symbol open or closed.
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * The radius of an `arc` symbol, or the border radius for the `callout`
    * symbol.
    */
  var r: js.UndefOr[Double] = js.native
  
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.native
  
  /**
    * The start angle of an `arc` symbol.
    */
  var start: js.UndefOr[Double] = js.native
}
object SymbolOptionsObject {
  
  @scala.inline
  def apply(): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOptionsObject]
  }
  
  @scala.inline
  implicit class SymbolOptionsObjectMutableBuilder[Self <: SymbolOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXUndefined: Self = StObject.set(x, "anchorX", js.undefined)
    
    @scala.inline
    def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYUndefined: Self = StObject.set(x, "anchorY", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
