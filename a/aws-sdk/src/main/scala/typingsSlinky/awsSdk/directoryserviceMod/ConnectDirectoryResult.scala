package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectDirectoryResult extends js.Object {
  /**
    * The identifier of the new directory.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
}

object ConnectDirectoryResult {
  @scala.inline
  def apply(): ConnectDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectDirectoryResult]
  }
  @scala.inline
  implicit class ConnectDirectoryResultOps[Self <: ConnectDirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
  }
  
}

