package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMainPageSuffix extends js.Object {
  var mainPageSuffix: js.UndefOr[String] = js.native
  var notFoundPage: js.UndefOr[String] = js.native
}

object AnonMainPageSuffix {
  @scala.inline
  def apply(): AnonMainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMainPageSuffix]
  }
  @scala.inline
  implicit class AnonMainPageSuffixOps[Self <: AnonMainPageSuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainPageSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPageSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainPageSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPageSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPage")(js.undefined)
        ret
    }
  }
  
}

