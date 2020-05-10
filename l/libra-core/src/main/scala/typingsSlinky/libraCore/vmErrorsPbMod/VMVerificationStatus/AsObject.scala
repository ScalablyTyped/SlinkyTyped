package typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatus

import typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationErrorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var dependencyId: js.UndefOr[typingsSlinky.libraCore.languageStoragePbMod.ModuleId.AsObject] = js.native
  var errorKind: VMVerificationErrorKind = js.native
  var message: String = js.native
  var moduleIdx: Double = js.native
  var statusKind: StatusKind = js.native
}

object AsObject {
  @scala.inline
  def apply(errorKind: VMVerificationErrorKind, message: String, moduleIdx: Double, statusKind: StatusKind): AsObject = {
    val __obj = js.Dynamic.literal(errorKind = errorKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moduleIdx = moduleIdx.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorKind(value: VMVerificationErrorKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusKind(value: StatusKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyId(value: typingsSlinky.libraCore.languageStoragePbMod.ModuleId.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyId")(js.undefined)
        ret
    }
  }
  
}

