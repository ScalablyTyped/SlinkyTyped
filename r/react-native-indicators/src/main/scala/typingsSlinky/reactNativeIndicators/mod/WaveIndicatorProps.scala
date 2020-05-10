package typingsSlinky.reactNativeIndicators.mod

import typingsSlinky.reactNativeIndicators.reactNativeIndicatorsStrings.fill
import typingsSlinky.reactNativeIndicators.reactNativeIndicatorsStrings.outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Component count
    * @default 4
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Minimum component scale
    * @default 0.54
    */
  var waveFactor: js.UndefOr[Double] = js.native
  /**
    * Maximum component scale
    * @default 'fill'
    */
  var waveMode: js.UndefOr[fill | outline] = js.native
}

object WaveIndicatorProps {
  @scala.inline
  def apply(): WaveIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveIndicatorProps]
  }
  @scala.inline
  implicit class WaveIndicatorPropsOps[Self <: WaveIndicatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withWaveFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaveFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withWaveMode(value: fill | outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveMode")(js.undefined)
        ret
    }
  }
  
}

