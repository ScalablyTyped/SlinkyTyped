package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sort order associated with a specific column or row.
  */
@js.native
trait SchemaSortSpec extends StObject {
  
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.native
  
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object SchemaSortSpec {
  
  @scala.inline
  def apply(): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortSpec]
  }
  
  @scala.inline
  implicit class SchemaSortSpecMutableBuilder[Self <: SchemaSortSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
