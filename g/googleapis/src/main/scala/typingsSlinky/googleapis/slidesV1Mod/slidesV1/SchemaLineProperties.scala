package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Line.  When unset, these fields default to values
  * that match the appearance of new lines created in the Slides editor.
  */
@js.native
trait SchemaLineProperties extends StObject {
  
  /**
    * The dash style of the line.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * The style of the arrow at the end of the line.
    */
  var endArrow: js.UndefOr[String] = js.native
  
  /**
    * The connection at the end of the line. If unset, there is no connection.
    * Only lines with a Type indicating it is a &quot;connector&quot; can have
    * an `end_connection`.
    */
  var endConnection: js.UndefOr[SchemaLineConnection] = js.native
  
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[SchemaLineFill] = js.native
  
  /**
    * The hyperlink destination of the line. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * The style of the arrow at the beginning of the line.
    */
  var startArrow: js.UndefOr[String] = js.native
  
  /**
    * The connection at the beginning of the line. If unset, there is no
    * connection.  Only lines with a Type indicating it is a
    * &quot;connector&quot; can have a `start_connection`.
    */
  var startConnection: js.UndefOr[SchemaLineConnection] = js.native
  
  /**
    * The thickness of the line.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}
object SchemaLineProperties {
  
  @scala.inline
  def apply(): SchemaLineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineProperties]
  }
  
  @scala.inline
  implicit class SchemaLinePropertiesMutableBuilder[Self <: SchemaLineProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
    
    @scala.inline
    def setEndConnection(value: SchemaLineConnection): Self = StObject.set(x, "endConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectionUndefined: Self = StObject.set(x, "endConnection", js.undefined)
    
    @scala.inline
    def setLineFill(value: SchemaLineFill): Self = StObject.set(x, "lineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFillUndefined: Self = StObject.set(x, "lineFill", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
    
    @scala.inline
    def setStartConnection(value: SchemaLineConnection): Self = StObject.set(x, "startConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartConnectionUndefined: Self = StObject.set(x, "startConnection", js.undefined)
    
    @scala.inline
    def setWeight(value: SchemaDimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
