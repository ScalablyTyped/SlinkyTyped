package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxWidth[K2, D2] extends js.Object {
  var label: js.UndefOr[`6`[K2, D2]] = js.native
  var maxWidth: js.UndefOr[String] = js.native
  var rendered: js.UndefOr[on | off] = js.native
  var width: js.UndefOr[String] = js.native
}

object MaxWidth {
  @scala.inline
  def apply[K2, D2](): MaxWidth[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth[K2, D2]]
  }
  @scala.inline
  implicit class MaxWidthOps[Self[k2, d2] <: MaxWidth[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withLabel(value: `6`[K2, D2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: on | off): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendered: Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

