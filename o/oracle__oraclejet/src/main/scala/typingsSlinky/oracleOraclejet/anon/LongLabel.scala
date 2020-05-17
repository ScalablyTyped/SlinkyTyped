package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongLabel extends js.Object {
  var id: String = js.native
  var longLabel: js.UndefOr[String] = js.native
  var shortLabel: js.UndefOr[String] = js.native
}

object LongLabel {
  @scala.inline
  def apply(id: String): LongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongLabel]
  }
  @scala.inline
  implicit class LongLabelOps[Self <: LongLabel] (val x: Self) extends AnyVal {
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

