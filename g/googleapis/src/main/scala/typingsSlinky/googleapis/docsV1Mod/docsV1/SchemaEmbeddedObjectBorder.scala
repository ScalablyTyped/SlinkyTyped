package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border around an EmbeddedObject.
  */
@js.native
trait SchemaEmbeddedObjectBorder extends js.Object {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * The property state of the border property.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}
object SchemaEmbeddedObjectBorder {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorder]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectBorderOps[Self <: SchemaEmbeddedObjectBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: SchemaOptionalColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    
    @scala.inline
    def setWidth(value: SchemaDimension): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
