package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsStartIncluded extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  var iso8601: String = js.native
}

object AnonIsStartIncluded {
  @scala.inline
  def apply(iso8601: String): AnonIsStartIncluded = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsStartIncluded]
  }
  @scala.inline
  implicit class AnonIsStartIncludedOps[Self <: AnonIsStartIncluded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIso8601(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso8601")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStartIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStartIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartIncluded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStopIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStopIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopIncluded")(js.undefined)
        ret
    }
  }
  
}

