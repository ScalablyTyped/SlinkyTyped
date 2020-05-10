package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryResponse extends js.Object {
  /**
    * Metadata about the directory.
    */
  var Directory: typingsSlinky.awsSdk.clouddirectoryMod.Directory = js.native
}

object GetDirectoryResponse {
  @scala.inline
  def apply(Directory: Directory): GetDirectoryResponse = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResponse]
  }
  @scala.inline
  implicit class GetDirectoryResponseOps[Self <: GetDirectoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: Directory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

