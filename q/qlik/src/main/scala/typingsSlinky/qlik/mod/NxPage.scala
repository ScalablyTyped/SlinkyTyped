package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxPage extends js.Object {
  var qHeight: js.UndefOr[Double] = js.native
  var qLeft: js.UndefOr[Double] = js.native
  var qTop: js.UndefOr[Double] = js.native
  var qWidth: js.UndefOr[Double] = js.native
}

object NxPage {
  @scala.inline
  def apply(): NxPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NxPage]
  }
  @scala.inline
  implicit class NxPageOps[Self <: NxPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withQLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withQTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTop")(js.undefined)
        ret
    }
    @scala.inline
    def withQWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qWidth")(js.undefined)
        ret
    }
  }
  
}

