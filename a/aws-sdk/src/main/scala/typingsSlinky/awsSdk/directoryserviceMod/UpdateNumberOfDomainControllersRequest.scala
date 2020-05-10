package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNumberOfDomainControllersRequest extends js.Object {
  /**
    * The number of domain controllers desired in the directory.
    */
  var DesiredNumber: DesiredNumberOfDomainControllers = js.native
  /**
    * Identifier of the directory to which the domain controllers will be added or removed.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object UpdateNumberOfDomainControllersRequest {
  @scala.inline
  def apply(DesiredNumber: DesiredNumberOfDomainControllers, DirectoryId: DirectoryId): UpdateNumberOfDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DesiredNumber = DesiredNumber.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
  }
  @scala.inline
  implicit class UpdateNumberOfDomainControllersRequestOps[Self <: UpdateNumberOfDomainControllersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredNumber(value: DesiredNumberOfDomainControllers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

