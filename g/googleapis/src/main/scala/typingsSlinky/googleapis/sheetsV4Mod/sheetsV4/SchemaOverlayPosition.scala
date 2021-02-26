package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The location an object is overlaid on top of a grid.
  */
@js.native
trait SchemaOverlayPosition extends StObject {
  
  /**
    * The cell the object is anchored to.
    */
  var anchorCell: js.UndefOr[SchemaGridCoordinate] = js.native
  
  /**
    * The height of the object, in pixels. Defaults to 371.
    */
  var heightPixels: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal offset, in pixels, that the object is offset from the
    * anchor cell.
    */
  var offsetXPixels: js.UndefOr[Double] = js.native
  
  /**
    * The vertical offset, in pixels, that the object is offset from the anchor
    * cell.
    */
  var offsetYPixels: js.UndefOr[Double] = js.native
  
  /**
    * The width of the object, in pixels. Defaults to 600.
    */
  var widthPixels: js.UndefOr[Double] = js.native
}
object SchemaOverlayPosition {
  
  @scala.inline
  def apply(): SchemaOverlayPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOverlayPosition]
  }
  
  @scala.inline
  implicit class SchemaOverlayPositionMutableBuilder[Self <: SchemaOverlayPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorCell(value: SchemaGridCoordinate): Self = StObject.set(x, "anchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorCellUndefined: Self = StObject.set(x, "anchorCell", js.undefined)
    
    @scala.inline
    def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    @scala.inline
    def setOffsetXPixels(value: Double): Self = StObject.set(x, "offsetXPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXPixelsUndefined: Self = StObject.set(x, "offsetXPixels", js.undefined)
    
    @scala.inline
    def setOffsetYPixels(value: Double): Self = StObject.set(x, "offsetYPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYPixelsUndefined: Self = StObject.set(x, "offsetYPixels", js.undefined)
    
    @scala.inline
    def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
