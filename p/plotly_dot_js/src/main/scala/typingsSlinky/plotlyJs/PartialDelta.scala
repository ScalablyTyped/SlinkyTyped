package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
@js.native
trait PartialDelta extends js.Object {
  var decreasing: js.UndefOr[AnonSymbol] = js.native
  var increasing: js.UndefOr[AnonSymbol] = js.native
  var position: js.UndefOr[top | bottom | left | right] = js.native
  var reference: js.UndefOr[Double] = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var valueformat: js.UndefOr[String] = js.native
}

object PartialDelta {
  @scala.inline
  def apply(): PartialDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDelta]
  }
  @scala.inline
  implicit class PartialDeltaOps[Self <: PartialDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecreasing(value: AnonSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecreasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasing")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreasing(value: AnonSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasing")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | bottom | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withValueformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueformat")(js.undefined)
        ret
    }
  }
  
}

