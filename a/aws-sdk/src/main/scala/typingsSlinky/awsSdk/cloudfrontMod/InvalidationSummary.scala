package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidationSummary extends StObject {
  
  /**
    * The time that an invalidation request was created.
    */
  var CreateTime: js.Date = js.native
  
  /**
    * The unique ID for an invalidation request.
    */
  var Id: String = js.native
  
  /**
    * The status of an invalidation request.
    */
  var Status: String = js.native
}
object InvalidationSummary {
  
  @scala.inline
  def apply(CreateTime: js.Date, Id: String, Status: String): InvalidationSummary = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationSummary]
  }
  
  @scala.inline
  implicit class InvalidationSummaryMutableBuilder[Self <: InvalidationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
