package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRegistryInput extends js.Object {
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typingsSlinky.awsSdk.glueMod.RegistryId = js.native
}
object DeleteRegistryInput {
  
  @scala.inline
  def apply(RegistryId: RegistryId): DeleteRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegistryInput]
  }
  
  @scala.inline
  implicit class DeleteRegistryInputOps[Self <: DeleteRegistryInput] (val x: Self) extends AnyVal {
    
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
    def setRegistryId(value: RegistryId): Self = this.set("RegistryId", value.asInstanceOf[js.Any])
  }
}
