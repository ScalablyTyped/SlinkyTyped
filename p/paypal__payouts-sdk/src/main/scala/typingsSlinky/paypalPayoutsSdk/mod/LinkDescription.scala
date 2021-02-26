package typingsSlinky.paypalPayoutsSdk.mod

import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.CONNECT
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.DELETE
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.GET
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.HEAD
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.OPTIONS
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PATCH
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.POST
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkDescription extends StObject {
  
  var href: String = js.native
  
  var method: js.UndefOr[CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT] = js.native
  
  var rel: String = js.native
}
object LinkDescription {
  
  @scala.inline
  def apply(href: String, rel: String): LinkDescription = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDescription]
  }
  
  @scala.inline
  implicit class LinkDescriptionMutableBuilder[Self <: LinkDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
  }
}
