package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAnnotations extends js.Object {
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.native
  var datum: js.UndefOr[ChartStemAndStyle] = js.native
  var domain: js.UndefOr[ChartStemAndStyle] = js.native
  var highContrast: js.UndefOr[Boolean] = js.native
  var stem: js.UndefOr[ChartStem] = js.native
  var style: js.UndefOr[String] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
}

object ChartAnnotations {
  @scala.inline
  def apply(): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnnotations]
  }
  @scala.inline
  implicit class ChartAnnotationsOps[Self <: ChartAnnotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxStyle(value: ChartBoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDatum(value: ChartStemAndStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: ChartStemAndStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withHighContrast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(js.undefined)
        ret
    }
    @scala.inline
    def withStem(value: ChartStem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

