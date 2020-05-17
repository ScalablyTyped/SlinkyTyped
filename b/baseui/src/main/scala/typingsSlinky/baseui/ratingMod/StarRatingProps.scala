package typingsSlinky.baseui.ratingMod

import typingsSlinky.baseui.anon.ValueNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarRatingProps extends js.Object {
  var numItems: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ValueNumber, _]] = js.native
  var overrides: js.UndefOr[RatingOverrides] = js.native
  var value: js.UndefOr[Double] = js.native
}

object StarRatingProps {
  @scala.inline
  def apply(): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingProps]
  }
  @scala.inline
  implicit class StarRatingPropsOps[Self <: StarRatingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* args */ ValueNumber => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: RatingOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

