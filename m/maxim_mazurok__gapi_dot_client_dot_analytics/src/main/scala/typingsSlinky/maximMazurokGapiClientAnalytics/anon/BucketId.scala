package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketId extends StObject {
  
  /** Id of the bucket the file object is stored in. */
  var bucketId: js.UndefOr[String] = js.native
  
  /** Id of the file object containing the report data. */
  var objectId: js.UndefOr[String] = js.native
}
object BucketId {
  
  @scala.inline
  def apply(): BucketId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketId]
  }
  
  @scala.inline
  implicit class BucketIdMutableBuilder[Self <: BucketId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
