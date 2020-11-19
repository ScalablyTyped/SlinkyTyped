package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileShareOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted file share.
    */
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
}
object DeleteFileShareOutput {
  
  @scala.inline
  def apply(): DeleteFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileShareOutput]
  }
  
  @scala.inline
  implicit class DeleteFileShareOutputOps[Self <: DeleteFileShareOutput] (val x: Self) extends AnyVal {
    
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
    def setFileShareARN(value: FileShareARN): Self = this.set("FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShareARN: Self = this.set("FileShareARN", js.undefined)
  }
}
