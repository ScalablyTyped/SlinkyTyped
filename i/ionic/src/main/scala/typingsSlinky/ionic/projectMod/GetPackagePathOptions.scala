package typingsSlinky.ionic.projectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPackagePathOptions extends js.Object {
  var emulator: js.UndefOr[Boolean] = js.native
  var release: js.UndefOr[Boolean] = js.native
}

object GetPackagePathOptions {
  @scala.inline
  def apply(): GetPackagePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackagePathOptions]
  }
  @scala.inline
  implicit class GetPackagePathOptionsOps[Self <: GetPackagePathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmulator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulator")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
        ret
    }
  }
  
}

