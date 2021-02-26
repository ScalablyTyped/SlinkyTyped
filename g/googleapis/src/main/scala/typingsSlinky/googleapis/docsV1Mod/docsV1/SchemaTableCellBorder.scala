package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border around a table cell.
  */
@js.native
trait SchemaTableCellBorder extends StObject {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTableCellBorder {
  
  @scala.inline
  def apply(): SchemaTableCellBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellBorder]
  }
  
  @scala.inline
  implicit class SchemaTableCellBorderMutableBuilder[Self <: SchemaTableCellBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaOptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
