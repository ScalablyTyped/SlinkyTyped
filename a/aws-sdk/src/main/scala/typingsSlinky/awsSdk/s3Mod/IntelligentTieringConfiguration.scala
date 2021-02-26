package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntelligentTieringConfiguration extends StObject {
  
  /**
    * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[IntelligentTieringFilter] = js.native
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId = js.native
  
  /**
    * Specifies the status of the configuration.
    */
  var Status: IntelligentTieringStatus = js.native
  
  /**
    * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
    */
  var Tierings: TieringList = js.native
}
object IntelligentTieringConfiguration {
  
  @scala.inline
  def apply(Id: IntelligentTieringId, Status: IntelligentTieringStatus, Tierings: TieringList): IntelligentTieringConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tierings = Tierings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntelligentTieringConfiguration]
  }
  
  @scala.inline
  implicit class IntelligentTieringConfigurationMutableBuilder[Self <: IntelligentTieringConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: IntelligentTieringFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setId(value: IntelligentTieringId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: IntelligentTieringStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierings(value: TieringList): Self = StObject.set(x, "Tierings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTieringsVarargs(value: Tiering*): Self = StObject.set(x, "Tierings", js.Array(value :_*))
  }
}
