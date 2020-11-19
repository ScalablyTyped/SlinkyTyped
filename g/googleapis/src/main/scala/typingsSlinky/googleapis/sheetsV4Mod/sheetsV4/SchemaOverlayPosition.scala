package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The location an object is overlaid on top of a grid.
  */
@js.native
trait SchemaOverlayPosition extends js.Object {
  
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
  implicit class SchemaOverlayPositionOps[Self <: SchemaOverlayPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchorCell(value: SchemaGridCoordinate): Self = this.set("anchorCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorCell: Self = this.set("anchorCell", js.undefined)
    
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightPixels: Self = this.set("heightPixels", js.undefined)
    
    @scala.inline
    def setOffsetXPixels(value: Double): Self = this.set("offsetXPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetXPixels: Self = this.set("offsetXPixels", js.undefined)
    
    @scala.inline
    def setOffsetYPixels(value: Double): Self = this.set("offsetYPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetYPixels: Self = this.set("offsetYPixels", js.undefined)
    
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthPixels: Self = this.set("widthPixels", js.undefined)
  }
}
