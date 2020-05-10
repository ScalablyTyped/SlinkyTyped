package typingsSlinky.rcMentions.mentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionsState extends js.Object {
  var activeIndex: Double = js.native
  var isFocus: Boolean = js.native
  var measureLocation: Double = js.native
  var measurePrefix: String = js.native
  var measureText: String | Null = js.native
  var measuring: Boolean = js.native
  var value: String = js.native
}

object MentionsState {
  @scala.inline
  def apply(
    activeIndex: Double,
    isFocus: Boolean,
    measureLocation: Double,
    measurePrefix: String,
    measuring: Boolean,
    value: String
  ): MentionsState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], measureLocation = measureLocation.asInstanceOf[js.Any], measurePrefix = measurePrefix.asInstanceOf[js.Any], measuring = measuring.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsState]
  }
  @scala.inline
  implicit class MentionsStateOps[Self <: MentionsState] (val x: Self) extends AnyVal {
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
    def withIsFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureText")(null)
        ret
    }
  }
  
}

