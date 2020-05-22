package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryResult extends js.Object {
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
}

object CreateDirectoryResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): CreateDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryResult]
  }
}

