package typingsSlinky.awsSdkClientXrayNode.typesSamplingTargetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSamplingTargetDocument extends SamplingTargetDocument {
  
  /**
    * <p>When the reservoir quota expires.</p>
    */
  @JSName("ReservoirQuotaTTL")
  var ReservoirQuotaTTL_UnmarshalledSamplingTargetDocument: js.UndefOr[js.Date] = js.native
}
object UnmarshalledSamplingTargetDocument {
  
  @scala.inline
  def apply(): UnmarshalledSamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingTargetDocument]
  }
  
  @scala.inline
  implicit class UnmarshalledSamplingTargetDocumentOps[Self <: UnmarshalledSamplingTargetDocument] (val x: Self) extends AnyVal {
    
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
    def setReservoirQuotaTTL(value: js.Date): Self = this.set("ReservoirQuotaTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservoirQuotaTTL: Self = this.set("ReservoirQuotaTTL", js.undefined)
  }
}
