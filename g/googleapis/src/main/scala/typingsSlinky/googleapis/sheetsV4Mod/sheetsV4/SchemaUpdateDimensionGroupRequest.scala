package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the state of the specified group.
  */
@js.native
trait SchemaUpdateDimensionGroupRequest extends StObject {
  
  /**
    * The group whose state should be updated. The range and depth of the group
    * should specify a valid group on the sheet, and all other fields updated.
    */
  var dimensionGroup: js.UndefOr[SchemaDimensionGroup] = js.native
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `dimensionGroup` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}
object SchemaUpdateDimensionGroupRequest {
  
  @scala.inline
  def apply(): SchemaUpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateDimensionGroupRequestMutableBuilder[Self <: SchemaUpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionGroup(value: SchemaDimensionGroup): Self = StObject.set(x, "dimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionGroupUndefined: Self = StObject.set(x, "dimensionGroup", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
