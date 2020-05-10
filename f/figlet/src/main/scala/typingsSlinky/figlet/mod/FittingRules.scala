package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FittingRules extends js.Object {
  var hLayout: Double = js.native
  var hRule1: Boolean = js.native
  var hRule2: Boolean = js.native
  var hRule3: Boolean = js.native
  var hRule4: Boolean = js.native
  var hRule5: Boolean = js.native
  var hRule6: Boolean = js.native
  var vLayout: Double = js.native
  var vRule1: Boolean = js.native
  var vRule2: Boolean = js.native
  var vRule3: Boolean = js.native
  var vRule4: Boolean = js.native
  var vRule5: Boolean = js.native
}

object FittingRules {
  @scala.inline
  def apply(
    hLayout: Double,
    hRule1: Boolean,
    hRule2: Boolean,
    hRule3: Boolean,
    hRule4: Boolean,
    hRule5: Boolean,
    hRule6: Boolean,
    vLayout: Double,
    vRule1: Boolean,
    vRule2: Boolean,
    vRule3: Boolean,
    vRule4: Boolean,
    vRule5: Boolean
  ): FittingRules = {
    val __obj = js.Dynamic.literal(hLayout = hLayout.asInstanceOf[js.Any], hRule1 = hRule1.asInstanceOf[js.Any], hRule2 = hRule2.asInstanceOf[js.Any], hRule3 = hRule3.asInstanceOf[js.Any], hRule4 = hRule4.asInstanceOf[js.Any], hRule5 = hRule5.asInstanceOf[js.Any], hRule6 = hRule6.asInstanceOf[js.Any], vLayout = vLayout.asInstanceOf[js.Any], vRule1 = vRule1.asInstanceOf[js.Any], vRule2 = vRule2.asInstanceOf[js.Any], vRule3 = vRule3.asInstanceOf[js.Any], vRule4 = vRule4.asInstanceOf[js.Any], vRule5 = vRule5.asInstanceOf[js.Any])
    __obj.asInstanceOf[FittingRules]
  }
  @scala.inline
  implicit class FittingRulesOps[Self <: FittingRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRule6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hRule6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVRule1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vRule1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVRule2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vRule2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVRule3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vRule3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVRule4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vRule4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVRule5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vRule5")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

