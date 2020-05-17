package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  sha ? :string} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait shastringBaseRequestOptio
  extends /* key */ StringDictionary[js.Any] {
  var sha: js.UndefOr[String] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object shastringBaseRequestOptio {
  @scala.inline
  def apply(): shastringBaseRequestOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shastringBaseRequestOptio]
  }
  @scala.inline
  implicit class shastringBaseRequestOptioOps[Self <: shastringBaseRequestOptio] (val x: Self) extends AnyVal {
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
    def withoutSha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(js.undefined)
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

