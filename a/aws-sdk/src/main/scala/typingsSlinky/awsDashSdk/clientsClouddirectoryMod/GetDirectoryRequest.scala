package typingsSlinky.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: typingsSlinky.awsDashSdk.clientsClouddirectoryMod.DirectoryArn = js.native
}

object GetDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: DirectoryArn): GetDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDirectoryRequest]
  }
}

