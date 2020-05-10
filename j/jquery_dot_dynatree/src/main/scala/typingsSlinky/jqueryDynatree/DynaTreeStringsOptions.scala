package typingsSlinky.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeStringsOptions extends js.Object {
  var loadError: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
}

object DynaTreeStringsOptions {
  @scala.inline
  def apply(): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
  @scala.inline
  implicit class DynaTreeStringsOptionsOps[Self <: DynaTreeStringsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
  }
  
}

