package typingsSlinky.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  gfm ? :string,   project ? :string | number} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait gfmstringprojectstringnum extends js.Object {
  var gfm: js.UndefOr[String] = js.native
  var project: js.UndefOr[String | Double] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object gfmstringprojectstringnum {
  @scala.inline
  def apply(): gfmstringprojectstringnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gfmstringprojectstringnum]
  }
  @scala.inline
  implicit class gfmstringprojectstringnumOps[Self <: gfmstringprojectstringnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGfm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

