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
  def apply(): CreateMicrosoftADResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMicrosoftADResult]
  }
  @scala.inline
  implicit class CreateMicrosoftADResultOps[Self <: CreateMicrosoftADResult] (val x: Self) extends AnyVal {
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

