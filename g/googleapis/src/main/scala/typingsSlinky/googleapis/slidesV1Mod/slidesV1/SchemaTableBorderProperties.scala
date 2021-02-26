package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The border styling properties of the TableBorderCell.
  */
@js.native
trait SchemaTableBorderProperties extends StObject {
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[SchemaTableBorderFill] = js.native
  
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTableBorderProperties {
  
  @scala.inline
  def apply(): SchemaTableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderProperties]
  }
  
  @scala.inline
  implicit class SchemaTableBorderPropertiesMutableBuilder[Self <: SchemaTableBorderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setTableBorderFill(value: SchemaTableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
    
    @scala.inline
    def setWeight(value: SchemaDimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
