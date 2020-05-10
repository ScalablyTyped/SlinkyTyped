package typingsSlinky.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-mentions.rc-mentions/lib/Mentions.MentionsState> */
@js.native
trait PartialMentionsState extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var isFocus: js.UndefOr[Boolean] = js.native
  var measureLocation: js.UndefOr[Double] = js.native
  var measurePrefix: js.UndefOr[String] = js.native
  var measureText: js.UndefOr[String] = js.native
  var measuring: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object PartialMentionsState {
  @scala.inline
  def apply(): PartialMentionsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMentionsState]
  }
  @scala.inline
  implicit class PartialMentionsStateOps[Self <: PartialMentionsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasuring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuring")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

