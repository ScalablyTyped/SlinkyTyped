package typingsSlinky.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationFilter extends StObject {
  
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Set of object tags for filtering.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}
object AnalyticsConfigurationFilter {
  
  @scala.inline
  def apply(): AnalyticsConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationFilter]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationFilterMutableBuilder[Self <: AnalyticsConfigurationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
