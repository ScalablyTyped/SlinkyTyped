package typingsSlinky.jointjs.mod.dia.LinkView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOptions
  extends typingsSlinky.jointjs.mod.dia.Cell.Options {
  var absoluteDistance: js.UndefOr[Boolean] = js.native
  var absoluteOffset: js.UndefOr[Boolean] = js.native
  var ensureLegibility: js.UndefOr[Boolean] = js.native
  var keepGradient: js.UndefOr[Boolean] = js.native
  var reverseDistance: js.UndefOr[Boolean] = js.native
}

object LabelOptions {
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteDistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsoluteOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withEnsureLegibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureLegibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnsureLegibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureLegibility")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseDistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseDistance")(js.undefined)
        ret
    }
  }
  
}

