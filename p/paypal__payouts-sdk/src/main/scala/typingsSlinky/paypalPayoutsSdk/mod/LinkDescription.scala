package typingsSlinky.paypalPayoutsSdk.mod

import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.CONNECT
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.DELETE
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.GET
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.HEAD
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.OPTIONS
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PATCH
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.POST
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkDescription extends js.Object {
  
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
  implicit class LinkDescriptionOps[Self <: LinkDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
