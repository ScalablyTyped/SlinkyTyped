package typingsSlinky.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumCount extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var maximumCount: js.UndefOr[Double] = js.native
  var maximumValue: js.UndefOr[Double] = js.native
  var minimumValue: js.UndefOr[Double] = js.native
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.native
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.native
}

object MaximumCount {
  @scala.inline
  def apply(): MaximumCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumCount]
  }
  @scala.inline
  implicit class MaximumCountOps[Self <: MaximumCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

