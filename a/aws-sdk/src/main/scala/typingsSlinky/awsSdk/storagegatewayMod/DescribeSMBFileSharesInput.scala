package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSMBFileSharesInput extends js.Object {
  
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described.
    */
  var FileShareARNList: typingsSlinky.awsSdk.storagegatewayMod.FileShareARNList = js.native
}
object DescribeSMBFileSharesInput {
  
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeSMBFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBFileSharesInput]
  }
  
  @scala.inline
  implicit class DescribeSMBFileSharesInputOps[Self <: DescribeSMBFileSharesInput] (val x: Self) extends AnyVal {
    
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
    def setFileShareARNListVarargs(value: FileShareARN*): Self = this.set("FileShareARNList", js.Array(value :_*))
    
    @scala.inline
    def setFileShareARNList(value: FileShareARNList): Self = this.set("FileShareARNList", value.asInstanceOf[js.Any])
  }
}
