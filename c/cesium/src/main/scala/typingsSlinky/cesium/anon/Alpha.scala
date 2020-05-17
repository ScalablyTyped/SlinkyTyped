package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  var blue: js.UndefOr[Double] = js.native
  var green: js.UndefOr[Double] = js.native
  var maximumAlpha: js.UndefOr[Double] = js.native
  var maximumBlue: js.UndefOr[Double] = js.native
  var maximumGreen: js.UndefOr[Double] = js.native
  var maximumRed: js.UndefOr[Double] = js.native
  var minimumAlpha: js.UndefOr[Double] = js.native
  var minimumBlue: js.UndefOr[Double] = js.native
  var minimumGreen: js.UndefOr[Double] = js.native
  var minimumRed: js.UndefOr[Double] = js.native
  var red: js.UndefOr[Double] = js.native
}

object Alpha {
  @scala.inline
  def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBlue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumGreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRed")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBlue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumGreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRed")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
  }
  
}

