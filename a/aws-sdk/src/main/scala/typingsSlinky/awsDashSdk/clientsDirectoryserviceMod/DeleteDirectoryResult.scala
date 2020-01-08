package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryResult extends js.Object {
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.native
}

object DeleteDirectoryResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): DeleteDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryResult]
  }
}

