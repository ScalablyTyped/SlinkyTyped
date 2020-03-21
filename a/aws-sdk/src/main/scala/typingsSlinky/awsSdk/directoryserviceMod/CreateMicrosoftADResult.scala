package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMicrosoftADResult extends js.Object {
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
}

object CreateMicrosoftADResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): CreateMicrosoftADResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMicrosoftADResult]
  }
}

