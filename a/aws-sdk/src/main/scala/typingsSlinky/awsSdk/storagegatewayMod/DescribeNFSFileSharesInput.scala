package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNFSFileSharesInput extends StObject {
  
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described.
    */
  var FileShareARNList: typingsSlinky.awsSdk.storagegatewayMod.FileShareARNList = js.native
}
object DescribeNFSFileSharesInput {
  
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeNFSFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNFSFileSharesInput]
  }
  
  @scala.inline
  implicit class DescribeNFSFileSharesInputMutableBuilder[Self <: DescribeNFSFileSharesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARNList(value: FileShareARNList): Self = StObject.set(x, "FileShareARNList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNListVarargs(value: FileShareARN*): Self = StObject.set(x, "FileShareARNList", js.Array(value :_*))
  }
}
