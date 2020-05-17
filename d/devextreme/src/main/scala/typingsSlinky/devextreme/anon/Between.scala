package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Between extends js.Object {
  var between: js.UndefOr[String] = js.native
  var contains: js.UndefOr[String] = js.native
  var endsWith: js.UndefOr[String] = js.native
  var equal: js.UndefOr[String] = js.native
  var greaterThan: js.UndefOr[String] = js.native
  var greaterThanOrEqual: js.UndefOr[String] = js.native
  var lessThan: js.UndefOr[String] = js.native
  var lessThanOrEqual: js.UndefOr[String] = js.native
  var notContains: js.UndefOr[String] = js.native
  var notEqual: js.UndefOr[String] = js.native
  var startsWith: js.UndefOr[String] = js.native
}

object Between {
  @scala.inline
  def apply(): Between = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Between]
  }
  @scala.inline
  implicit class BetweenOps[Self <: Between] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetween(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withEqual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThanOrEqual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThanOrEqual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withNotContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.undefined)
        ret
    }
    @scala.inline
    def withNotEqual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(js.undefined)
        ret
    }
  }
  
}

