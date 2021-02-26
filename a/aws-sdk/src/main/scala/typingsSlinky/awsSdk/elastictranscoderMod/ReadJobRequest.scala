package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadJobRequest extends StObject {
  
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: typingsSlinky.awsSdk.elastictranscoderMod.Id = js.native
}
object ReadJobRequest {
  
  @scala.inline
  def apply(Id: Id): ReadJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobRequest]
  }
  
  @scala.inline
  implicit class ReadJobRequestMutableBuilder[Self <: ReadJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
