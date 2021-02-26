package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointRequestConfiguration extends StObject {
  
  /**
    * Describes the metadata sent to the HTTP endpoint destination.
    */
  var CommonAttributes: js.UndefOr[HttpEndpointCommonAttributesList] = js.native
  
  /**
    * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. For more information, see Content-Encoding in MDN Web Docs, the official Mozilla documentation.
    */
  var ContentEncoding: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ContentEncoding] = js.native
}
object HttpEndpointRequestConfiguration {
  
  @scala.inline
  def apply(): HttpEndpointRequestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointRequestConfiguration]
  }
  
  @scala.inline
  implicit class HttpEndpointRequestConfigurationMutableBuilder[Self <: HttpEndpointRequestConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonAttributes(value: HttpEndpointCommonAttributesList): Self = StObject.set(x, "CommonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonAttributesUndefined: Self = StObject.set(x, "CommonAttributes", js.undefined)
    
    @scala.inline
    def setCommonAttributesVarargs(value: HttpEndpointCommonAttribute*): Self = StObject.set(x, "CommonAttributes", js.Array(value :_*))
    
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
  }
}
