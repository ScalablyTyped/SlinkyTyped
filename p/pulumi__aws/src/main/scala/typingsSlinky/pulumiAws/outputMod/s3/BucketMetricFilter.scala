package typingsSlinky.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketMetricFilter extends StObject {
  
  /**
    * Object prefix for filtering (singular).
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Object tags for filtering (up to 10).
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}
object BucketMetricFilter {
  
  @scala.inline
  def apply(): BucketMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketMetricFilter]
  }
  
  @scala.inline
  implicit class BucketMetricFilterMutableBuilder[Self <: BucketMetricFilter] (val x: Self) extends AnyVal {
    
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
