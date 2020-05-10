package typingsSlinky.ionic.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectFromDirectoryOptions extends js.Object {
  var logErrors: js.UndefOr[Boolean] = js.native
}

object CreateProjectFromDirectoryOptions {
  @scala.inline
  def apply(): CreateProjectFromDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectFromDirectoryOptions]
  }
  @scala.inline
  implicit class CreateProjectFromDirectoryOptionsOps[Self <: CreateProjectFromDirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(js.undefined)
        ret
    }
  }
  
}

