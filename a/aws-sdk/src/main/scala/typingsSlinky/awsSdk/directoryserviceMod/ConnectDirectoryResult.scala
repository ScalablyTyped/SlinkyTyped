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
  def apply(DirectoryId: DirectoryId = null): ConnectDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryResult]
  }
}

