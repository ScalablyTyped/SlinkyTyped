package typingsSlinky.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure to configure the properties of a Spatial Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
@js.native
trait SpatialIndex extends StObject {
  
  /** Specifies that the targeted field need not be present or have a GeoJSON geometry object as its value. */
  var lax: js.UndefOr[Boolean] = js.native
  
  /** Name of the index. */
  var name: String = js.native
  
  /** Specifies that the targeted field must be present and have a GeoJSON geometry object as its value. */
  var scalarRequired: js.UndefOr[Boolean] = js.native
  
  /** Specifies the path to the JSON field to be indexed. */
  var spatial: String = js.native
}
object SpatialIndex {
  
  @scala.inline
  def apply(name: String, spatial: String): SpatialIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialIndex]
  }
  
  @scala.inline
  implicit class SpatialIndexMutableBuilder[Self <: SpatialIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLax(value: Boolean): Self = StObject.set(x, "lax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaxUndefined: Self = StObject.set(x, "lax", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarRequired(value: Boolean): Self = StObject.set(x, "scalarRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarRequiredUndefined: Self = StObject.set(x, "scalarRequired", js.undefined)
    
    @scala.inline
    def setSpatial(value: String): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
  }
}
