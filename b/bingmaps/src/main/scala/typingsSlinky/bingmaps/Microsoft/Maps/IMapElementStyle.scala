package typingsSlinky.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapElementStyle extends StObject {
  
  /**
    * Hex color used for filling polygons, the background of point icons, and for the center of lines if they have split.
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    * The hex color of a map label.
    */
  var labelColor: js.UndefOr[String] = js.native
  
  /**
    * The outline hex color of a map label.
    */
  var labelOutlineColor: js.UndefOr[String] = js.native
  
  /**
    * Species if a map label type is visible or not.
    */
  var labelVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Hex color used for the outline around polygons, the outline around point icons, and the color of lines.
    */
  var strokeColor: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the map element is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IMapElementStyle {
  
  @scala.inline
  def apply(): IMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapElementStyle]
  }
  
  @scala.inline
  implicit class IMapElementStyleMutableBuilder[Self <: IMapElementStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelOutlineColor(value: String): Self = StObject.set(x, "labelOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOutlineColorUndefined: Self = StObject.set(x, "labelOutlineColor", js.undefined)
    
    @scala.inline
    def setLabelVisible(value: Boolean): Self = StObject.set(x, "labelVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVisibleUndefined: Self = StObject.set(x, "labelVisible", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
