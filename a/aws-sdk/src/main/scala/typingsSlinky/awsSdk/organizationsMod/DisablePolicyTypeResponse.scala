package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisablePolicyTypeResponse extends js.Object {
  
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Root] = js.native
}
object DisablePolicyTypeResponse {
  
  @scala.inline
  def apply(): DisablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePolicyTypeResponse]
  }
  
  @scala.inline
  implicit class DisablePolicyTypeResponseOps[Self <: DisablePolicyTypeResponse] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: Root): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
  }
}
