package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource that represents an external  Google identifier for a company,
  * for example, a Google+ business page or a Google Maps business page. For
  * unsupported types, use `unknown_type_id`.
  */
@js.native
trait SchemaCompanyInfoSource extends StObject {
  
  /**
    * Optional.  The Google&#39;s Knowledge Graph value for the employer&#39;s
    * company.
    */
  var freebaseMid: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The numeric identifier for the employer&#39;s Google+ business
    * page.
    */
  var gplusId: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The numeric identifier for the employer&#39;s headquarters on
    * Google Maps, namely, the Google Maps CID (cell id).
    */
  var mapsCid: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A Google identifier that does not match any of the other
    * types.
    */
  var unknownTypeId: js.UndefOr[String] = js.native
}
object SchemaCompanyInfoSource {
  
  @scala.inline
  def apply(): SchemaCompanyInfoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanyInfoSource]
  }
  
  @scala.inline
  implicit class SchemaCompanyInfoSourceMutableBuilder[Self <: SchemaCompanyInfoSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreebaseMid(value: String): Self = StObject.set(x, "freebaseMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreebaseMidUndefined: Self = StObject.set(x, "freebaseMid", js.undefined)
    
    @scala.inline
    def setGplusId(value: String): Self = StObject.set(x, "gplusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGplusIdUndefined: Self = StObject.set(x, "gplusId", js.undefined)
    
    @scala.inline
    def setMapsCid(value: String): Self = StObject.set(x, "mapsCid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapsCidUndefined: Self = StObject.set(x, "mapsCid", js.undefined)
    
    @scala.inline
    def setUnknownTypeId(value: String): Self = StObject.set(x, "unknownTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownTypeIdUndefined: Self = StObject.set(x, "unknownTypeId", js.undefined)
  }
}
