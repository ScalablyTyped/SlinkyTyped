package typingsSlinky.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  sha  :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait shastringSudo extends js.Object {
  var sha: String = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object shastringSudo {
  @scala.inline
  def apply(sha: String): shastringSudo = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[shastringSudo]
  }
  @scala.inline
  implicit class shastringSudoOps[Self <: shastringSudo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
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

