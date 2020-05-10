package typingsSlinky.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  forkedFromId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait forkedFromIdnumberBaseReq
  extends /* key */ StringDictionary[js.Any] {
  var forkedFromId: js.UndefOr[Double] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object forkedFromIdnumberBaseReq {
  @scala.inline
  def apply(): forkedFromIdnumberBaseReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[forkedFromIdnumberBaseReq]
  }
  @scala.inline
  implicit class forkedFromIdnumberBaseReqOps[Self <: forkedFromIdnumberBaseReq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForkedFromId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkedFromId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForkedFromId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkedFromId")(js.undefined)
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

