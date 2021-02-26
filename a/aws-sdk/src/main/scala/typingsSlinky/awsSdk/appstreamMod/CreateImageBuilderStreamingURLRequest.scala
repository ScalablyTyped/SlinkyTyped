package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageBuilderStreamingURLRequest extends StObject {
  
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
  
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 3600 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}
object CreateImageBuilderStreamingURLRequest {
  
  @scala.inline
  def apply(Name: String): CreateImageBuilderStreamingURLRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderStreamingURLRequest]
  }
  
  @scala.inline
  implicit class CreateImageBuilderStreamingURLRequestMutableBuilder[Self <: CreateImageBuilderStreamingURLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: Long): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "Validity", js.undefined)
  }
}
