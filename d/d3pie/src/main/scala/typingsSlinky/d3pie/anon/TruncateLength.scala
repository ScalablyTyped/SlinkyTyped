package typingsSlinky.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateLength extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var truncateLength: js.UndefOr[Double] = js.native
}

object TruncateLength {
  @scala.inline
  def apply(): TruncateLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLength]
  }
  @scala.inline
  implicit class TruncateLengthOps[Self <: TruncateLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLength")(js.undefined)
        ret
    }
  }
  
}

