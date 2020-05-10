package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLongLabel extends js.Object {
  var id: String = js.native
  var longLabel: js.UndefOr[String] = js.native
  var shortLabel: js.UndefOr[String] = js.native
}

object AnonLongLabel {
  @scala.inline
  def apply(id: String): AnonLongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLongLabel]
  }
  @scala.inline
  implicit class AnonLongLabelOps[Self <: AnonLongLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShortLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLabel")(js.undefined)
        ret
    }
  }
  
}

