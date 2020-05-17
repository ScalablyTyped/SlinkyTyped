package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  mergerequestIId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait mergerequestIIdnumberBase
  extends /* key */ StringDictionary[js.Any] {
  var mergerequestIId: js.UndefOr[Double] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object mergerequestIIdnumberBase {
  @scala.inline
  def apply(): mergerequestIIdnumberBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mergerequestIIdnumberBase]
  }
  @scala.inline
  implicit class mergerequestIIdnumberBaseOps[Self <: mergerequestIIdnumberBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergerequestIId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergerequestIId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergerequestIId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergerequestIId")(js.undefined)
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

