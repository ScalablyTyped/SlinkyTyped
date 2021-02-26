package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointCommonAttribute extends StObject {
  
  /**
    * The name of the HTTP endpoint common attribute.
    */
  var AttributeName: HttpEndpointAttributeName = js.native
  
  /**
    * The value of the HTTP endpoint common attribute.
    */
  var AttributeValue: HttpEndpointAttributeValue = js.native
}
object HttpEndpointCommonAttribute {
  
  @scala.inline
  def apply(AttributeName: HttpEndpointAttributeName, AttributeValue: HttpEndpointAttributeValue): HttpEndpointCommonAttribute = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointCommonAttribute]
  }
  
  @scala.inline
  implicit class HttpEndpointCommonAttributeMutableBuilder[Self <: HttpEndpointCommonAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: HttpEndpointAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: HttpEndpointAttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}
