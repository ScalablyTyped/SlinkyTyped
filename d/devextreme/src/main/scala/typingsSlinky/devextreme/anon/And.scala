package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait And extends js.Object {
  var and: js.UndefOr[String] = js.native
  var notAnd: js.UndefOr[String] = js.native
  var notOr: js.UndefOr[String] = js.native
  var or: js.UndefOr[String] = js.native
}

object And {
  @scala.inline
  def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAnd")(js.undefined)
        ret
    }
    @scala.inline
    def withNotOr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notOr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notOr")(js.undefined)
        ret
    }
    @scala.inline
    def withOr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.undefined)
        ret
    }
  }
  
}

