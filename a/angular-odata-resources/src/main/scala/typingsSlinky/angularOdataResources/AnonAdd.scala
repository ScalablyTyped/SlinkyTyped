package typingsSlinky.angularOdataResources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  var add: js.Array[String] = js.native
  var and: js.Array[String] = js.native
  var div: js.Array[String] = js.native
  @JSName("eq")
  var eq_FAnonAdd: js.Array[String] = js.native
  var ge: js.Array[String] = js.native
  var gt: js.Array[String] = js.native
  var le: js.Array[String] = js.native
  var lt: js.Array[String] = js.native
  var mod: js.Array[String] = js.native
  var mul: js.Array[String] = js.native
  @JSName("ne")
  var ne_FAnonAdd: js.Array[String] = js.native
  var not: js.Array[String] = js.native
  var or: js.Array[String] = js.native
  var sub: js.Array[String] = js.native
}

object AnonAdd {
  @scala.inline
  def apply(
    add: js.Array[String],
    and: js.Array[String],
    div: js.Array[String],
    eq: js.Array[String],
    ge: js.Array[String],
    gt: js.Array[String],
    le: js.Array[String],
    lt: js.Array[String],
    mod: js.Array[String],
    mul: js.Array[String],
    ne: js.Array[String],
    not: js.Array[String],
    or: js.Array[String],
    sub: js.Array[String]
  ): AnonAdd = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], eq = eq.asInstanceOf[js.Any], ge = ge.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], le = le.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], mul = mul.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdd]
  }
  @scala.inline
  implicit class AnonAddOps[Self <: AnonAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEq(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGe(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLe(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("le")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMod(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMul(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNe(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

