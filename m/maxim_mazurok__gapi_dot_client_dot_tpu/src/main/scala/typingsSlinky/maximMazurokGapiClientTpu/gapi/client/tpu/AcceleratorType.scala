package typingsSlinky.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorType extends js.Object {
  
  /** The resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** the accelerator type. */
  var `type`: js.UndefOr[String] = js.native
}
object AcceleratorType {
  
  @scala.inline
  def apply(): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorType]
  }
  
  @scala.inline
  implicit class AcceleratorTypeOps[Self <: AcceleratorType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
