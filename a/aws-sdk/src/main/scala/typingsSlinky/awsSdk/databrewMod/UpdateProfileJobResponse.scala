package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProfileJobResponse extends StObject {
  
  /**
    * The name of the job that was updated.
    */
  var Name: JobName = js.native
}
object UpdateProfileJobResponse {
  
  @scala.inline
  def apply(Name: JobName): UpdateProfileJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileJobResponse]
  }
  
  @scala.inline
  implicit class UpdateProfileJobResponseMutableBuilder[Self <: UpdateProfileJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
