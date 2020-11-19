package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmResponse extends js.Object {
  
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Hsm] = js.native
}
object CreateHsmResponse {
  
  @scala.inline
  def apply(): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmResponse]
  }
  
  @scala.inline
  implicit class CreateHsmResponseOps[Self <: CreateHsmResponse] (val x: Self) extends AnyVal {
    
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
    def setHsm(value: Hsm): Self = this.set("Hsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsm: Self = this.set("Hsm", js.undefined)
  }
}
