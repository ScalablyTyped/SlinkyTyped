package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define a table border.
  */
@js.native
trait TableBorderSettings extends StObject {
  
  /**
    * Gets or sets the border color.
    */
  var color: String = js.native
  
  /**
    * Gets or sets the border line style.
    */
  var style: BorderLineStyle = js.native
  
  /**
    * Gets or sets the border line width in twips.
    */
  var width: Double = js.native
}
object TableBorderSettings {
  
  @scala.inline
  def apply(color: String, style: BorderLineStyle, width: Double): TableBorderSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderSettings]
  }
  
  @scala.inline
  implicit class TableBorderSettingsMutableBuilder[Self <: TableBorderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: BorderLineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
