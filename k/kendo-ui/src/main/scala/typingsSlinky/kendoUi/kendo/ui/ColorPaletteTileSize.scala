package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPaletteTileSize extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ColorPaletteTileSize {
  
  @scala.inline
  def apply(): ColorPaletteTileSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPaletteTileSize]
  }
  
  @scala.inline
  implicit class ColorPaletteTileSizeMutableBuilder[Self <: ColorPaletteTileSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
