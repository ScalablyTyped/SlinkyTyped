package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResolverResponse extends js.Object {
  
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}
object UpdateResolverResponse {
  
  @scala.inline
  def apply(): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverResponse]
  }
  
  @scala.inline
  implicit class UpdateResolverResponseOps[Self <: UpdateResolverResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResolver(value: Resolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
  }
}
