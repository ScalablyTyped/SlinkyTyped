package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAccessPolicy extends StObject {
  
  /** Output only. The time when this row access policy was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Required. A SQL boolean expression that represents the rows defined by this row access policy, similar to the boolean expression in a WHERE clause of a SELECT query on a table.
    * References to other tables, routines, and temporary functions are not supported. Examples: region="EU" date_field = CAST('2019-9-27' as DATE) nullable_field is not NULL
    * numeric_field BETWEEN 1.0 AND 5.0
    */
  var filterPredicate: js.UndefOr[String] = js.native
  
  /** Output only. The time when this row access policy was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /** Required. Reference describing the ID of this row access policy. */
  var rowAccessPolicyReference: js.UndefOr[RowAccessPolicyReference] = js.native
}
object RowAccessPolicy {
  
  @scala.inline
  def apply(): RowAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAccessPolicy]
  }
  
  @scala.inline
  implicit class RowAccessPolicyMutableBuilder[Self <: RowAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFilterPredicate(value: String): Self = StObject.set(x, "filterPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPredicateUndefined: Self = StObject.set(x, "filterPredicate", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setRowAccessPolicyReference(value: RowAccessPolicyReference): Self = StObject.set(x, "rowAccessPolicyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAccessPolicyReferenceUndefined: Self = StObject.set(x, "rowAccessPolicyReference", js.undefined)
  }
}
