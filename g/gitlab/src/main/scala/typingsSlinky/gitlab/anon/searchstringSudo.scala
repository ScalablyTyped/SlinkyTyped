package typingsSlinky.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  search ? :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait searchstringSudo extends js.Object {
  var search: js.UndefOr[String] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object searchstringSudo {
  @scala.inline
  def apply(): searchstringSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[searchstringSudo]
  }
  @scala.inline
  implicit class searchstringSudoOps[Self <: searchstringSudo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
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

