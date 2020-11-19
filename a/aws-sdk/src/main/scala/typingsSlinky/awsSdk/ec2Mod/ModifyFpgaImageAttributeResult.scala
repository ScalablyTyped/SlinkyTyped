package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyFpgaImageAttributeResult extends js.Object {
  
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FpgaImageAttribute] = js.native
}
object ModifyFpgaImageAttributeResult {
  
  @scala.inline
  def apply(): ModifyFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyFpgaImageAttributeResult]
  }
  
  @scala.inline
  implicit class ModifyFpgaImageAttributeResultOps[Self <: ModifyFpgaImageAttributeResult] (val x: Self) extends AnyVal {
    
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
    def setFpgaImageAttribute(value: FpgaImageAttribute): Self = this.set("FpgaImageAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpgaImageAttribute: Self = this.set("FpgaImageAttribute", js.undefined)
  }
}
