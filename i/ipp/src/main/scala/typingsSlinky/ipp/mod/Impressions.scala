package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impressions extends js.Object {
  var blank: js.UndefOr[Double] = js.native
  var `blank-two-sided`: js.UndefOr[Double] = js.native
  var `full-color`: js.UndefOr[Double] = js.native
  var `full-color-two-sided`: js.UndefOr[Double] = js.native
  var `highlight-color`: js.UndefOr[Double] = js.native
  var `highlight-color-two-sided`: js.UndefOr[Double] = js.native
  var monochrome: js.UndefOr[Double] = js.native
  var `monochrome-two-sided`: js.UndefOr[Double] = js.native
}

object Impressions {
  @scala.inline
  def apply(): Impressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Impressions]
  }
  @scala.inline
  implicit class ImpressionsOps[Self <: Impressions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlank-two-sided`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank-two-sided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlank-two-sided`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank-two-sided")(js.undefined)
        ret
    }
    @scala.inline
    def `withFull-color`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFull-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFull-color-two-sided`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color-two-sided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFull-color-two-sided`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full-color-two-sided")(js.undefined)
        ret
    }
    @scala.inline
    def `withHighlight-color`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHighlight-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withHighlight-color-two-sided`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-color-two-sided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHighlight-color-two-sided`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight-color-two-sided")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
    @scala.inline
    def `withMonochrome-two-sided`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome-two-sided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMonochrome-two-sided`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome-two-sided")(js.undefined)
        ret
    }
  }
  
}

