package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfiguration extends StObject {
  
  /**
    * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
    */
  var Filter: js.UndefOr[AnalyticsFilter] = js.native
  
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
  
  /**
    *  Contains data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes. 
    */
  var StorageClassAnalysis: typingsSlinky.awsSdk.s3Mod.StorageClassAnalysis = js.native
}
object AnalyticsConfiguration {
  
  @scala.inline
  def apply(Id: AnalyticsId, StorageClassAnalysis: StorageClassAnalysis): AnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfiguration]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationMutableBuilder[Self <: AnalyticsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: AnalyticsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setId(value: AnalyticsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassAnalysis(value: StorageClassAnalysis): Self = StObject.set(x, "StorageClassAnalysis", value.asInstanceOf[js.Any])
  }
}
