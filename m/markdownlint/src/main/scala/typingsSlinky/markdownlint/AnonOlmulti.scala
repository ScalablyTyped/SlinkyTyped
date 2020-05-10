package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOlmulti extends js.Object {
  var ol_multi: js.UndefOr[Double] = js.native
  var ol_single: js.UndefOr[Double] = js.native
  var ul_multi: js.UndefOr[Double] = js.native
  var ul_single: js.UndefOr[Double] = js.native
}

object AnonOlmulti {
  @scala.inline
  def apply(): AnonOlmulti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOlmulti]
  }
  @scala.inline
  implicit class AnonOlmultiOps[Self <: AnonOlmulti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOl_multi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol_multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOl_multi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol_multi")(js.undefined)
        ret
    }
    @scala.inline
    def withOl_single(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol_single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOl_single: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol_single")(js.undefined)
        ret
    }
    @scala.inline
    def withUl_multi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul_multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl_multi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul_multi")(js.undefined)
        ret
    }
    @scala.inline
    def withUl_single(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul_single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl_single: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul_single")(js.undefined)
        ret
    }
  }
  
}

