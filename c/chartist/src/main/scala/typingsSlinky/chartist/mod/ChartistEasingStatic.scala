package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartistEasingStatic extends js.Object {
  var easeInBack: IChartistEasingDefinition = js.native
  var easeInCirc: IChartistEasingDefinition = js.native
  var easeInCubic: IChartistEasingDefinition = js.native
  var easeInExpo: IChartistEasingDefinition = js.native
  var easeInOutBack: IChartistEasingDefinition = js.native
  var easeInOutCirc: IChartistEasingDefinition = js.native
  var easeInOutCubic: IChartistEasingDefinition = js.native
  var easeInOutExpo: IChartistEasingDefinition = js.native
  var easeInOutQuad: IChartistEasingDefinition = js.native
  var easeInOutQuart: IChartistEasingDefinition = js.native
  var easeInOutQuint: IChartistEasingDefinition = js.native
  var easeInOutSine: IChartistEasingDefinition = js.native
  var easeInQuad: IChartistEasingDefinition = js.native
  var easeInQuart: IChartistEasingDefinition = js.native
  var easeInQuint: IChartistEasingDefinition = js.native
  var easeInSine: IChartistEasingDefinition = js.native
  var easeOutBack: IChartistEasingDefinition = js.native
  var easeOutCirc: IChartistEasingDefinition = js.native
  var easeOutCubic: IChartistEasingDefinition = js.native
  var easeOutExpo: IChartistEasingDefinition = js.native
  var easeOutQuad: IChartistEasingDefinition = js.native
  var easeOutQuart: IChartistEasingDefinition = js.native
  var easeOutQuint: IChartistEasingDefinition = js.native
  var easeOutSine: IChartistEasingDefinition = js.native
}

object ChartistEasingStatic {
  @scala.inline
  def apply(
    easeInBack: IChartistEasingDefinition,
    easeInCirc: IChartistEasingDefinition,
    easeInCubic: IChartistEasingDefinition,
    easeInExpo: IChartistEasingDefinition,
    easeInOutBack: IChartistEasingDefinition,
    easeInOutCirc: IChartistEasingDefinition,
    easeInOutCubic: IChartistEasingDefinition,
    easeInOutExpo: IChartistEasingDefinition,
    easeInOutQuad: IChartistEasingDefinition,
    easeInOutQuart: IChartistEasingDefinition,
    easeInOutQuint: IChartistEasingDefinition,
    easeInOutSine: IChartistEasingDefinition,
    easeInQuad: IChartistEasingDefinition,
    easeInQuart: IChartistEasingDefinition,
    easeInQuint: IChartistEasingDefinition,
    easeInSine: IChartistEasingDefinition,
    easeOutBack: IChartistEasingDefinition,
    easeOutCirc: IChartistEasingDefinition,
    easeOutCubic: IChartistEasingDefinition,
    easeOutExpo: IChartistEasingDefinition,
    easeOutQuad: IChartistEasingDefinition,
    easeOutQuart: IChartistEasingDefinition,
    easeOutQuint: IChartistEasingDefinition,
    easeOutSine: IChartistEasingDefinition
  ): ChartistEasingStatic = {
    val __obj = js.Dynamic.literal(easeInBack = easeInBack.asInstanceOf[js.Any], easeInCirc = easeInCirc.asInstanceOf[js.Any], easeInCubic = easeInCubic.asInstanceOf[js.Any], easeInExpo = easeInExpo.asInstanceOf[js.Any], easeInOutBack = easeInOutBack.asInstanceOf[js.Any], easeInOutCirc = easeInOutCirc.asInstanceOf[js.Any], easeInOutCubic = easeInOutCubic.asInstanceOf[js.Any], easeInOutExpo = easeInOutExpo.asInstanceOf[js.Any], easeInOutQuad = easeInOutQuad.asInstanceOf[js.Any], easeInOutQuart = easeInOutQuart.asInstanceOf[js.Any], easeInOutQuint = easeInOutQuint.asInstanceOf[js.Any], easeInOutSine = easeInOutSine.asInstanceOf[js.Any], easeInQuad = easeInQuad.asInstanceOf[js.Any], easeInQuart = easeInQuart.asInstanceOf[js.Any], easeInQuint = easeInQuint.asInstanceOf[js.Any], easeInSine = easeInSine.asInstanceOf[js.Any], easeOutBack = easeOutBack.asInstanceOf[js.Any], easeOutCirc = easeOutCirc.asInstanceOf[js.Any], easeOutCubic = easeOutCubic.asInstanceOf[js.Any], easeOutExpo = easeOutExpo.asInstanceOf[js.Any], easeOutQuad = easeOutQuad.asInstanceOf[js.Any], easeOutQuart = easeOutQuart.asInstanceOf[js.Any], easeOutQuint = easeOutQuint.asInstanceOf[js.Any], easeOutSine = easeOutSine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartistEasingStatic]
  }
  @scala.inline
  implicit class ChartistEasingStaticOps[Self <: ChartistEasingStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseInBack(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInCirc(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInCirc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInCubic(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInCubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInExpo(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInExpo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutBack(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutCirc(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCirc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutCubic(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutExpo(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutExpo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutQuad(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutQuart(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutQuint(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOutSine(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOutSine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInQuad(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInQuad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInQuart(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInQuart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInQuint(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInQuint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInSine(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInSine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutBack(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutCirc(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutCirc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutCubic(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutCubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutExpo(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutExpo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutQuad(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutQuart(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutQuint(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOutSine(value: IChartistEasingDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOutSine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

