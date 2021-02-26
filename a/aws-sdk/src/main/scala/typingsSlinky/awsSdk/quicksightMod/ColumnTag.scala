package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnTag extends StObject {
  
  /**
    * A description for a column.
    */
  var ColumnDescription: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ColumnDescription] = js.native
  
  /**
    * A geospatial role for a column.
    */
  var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole] = js.native
}
object ColumnTag {
  
  @scala.inline
  def apply(): ColumnTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTag]
  }
  
  @scala.inline
  implicit class ColumnTagMutableBuilder[Self <: ColumnTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnDescription(value: ColumnDescription): Self = StObject.set(x, "ColumnDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDescriptionUndefined: Self = StObject.set(x, "ColumnDescription", js.undefined)
    
    @scala.inline
    def setColumnGeographicRole(value: GeoSpatialDataRole): Self = StObject.set(x, "ColumnGeographicRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGeographicRoleUndefined: Self = StObject.set(x, "ColumnGeographicRole", js.undefined)
  }
}
