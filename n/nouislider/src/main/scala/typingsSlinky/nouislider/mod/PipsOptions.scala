package typingsSlinky.nouislider.mod

import typingsSlinky.nouislider.nouisliderStrings.count
import typingsSlinky.nouislider.nouisliderStrings.positions
import typingsSlinky.nouislider.nouisliderStrings.range
import typingsSlinky.nouislider.nouisliderStrings.steps
import typingsSlinky.nouislider.nouisliderStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipsOptions extends js.Object {
  /**
    * Range Mode: percentage for range mode
    * Step Mode: step number for steps
    * Positions Mode: percentage-based positions on the slider
    * Count Mode: positions between pips
    */
  var density: js.UndefOr[Double] = js.native
  /**
    * Step Mode: The filter option can be used to filter the generated pips.
    * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
    */
  var filter: js.UndefOr[js.Function1[/* repeated */ js.Any, PipFilterResult]] = js.native
  /**
    * format for step mode
    * see noUiSlider format
    */
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.native
  /**
    * The 'range' mode uses the slider range to determine where the pips should be. A pip is generated for every percentage specified.
    *
    * The 'steps', like 'range', uses the slider range. In steps mode, a pip is generated for every step.
    * The 'filter' option can be used to filter the generated pips from the 'steps' options'
    * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
    *
    * In 'positions' mode, pips are generated at percentage-based positions on the slider.
    * Optionally, the stepped option can be set to true to match the pips to the slider steps.
    *
    * The 'count' mode can be used to generate a fixed number of pips. As with positions mode, the stepped option can be used.
    *
    * The 'values' mode is similar to positions, but it accepts values instead of percentages. The stepped option can be used for this mode.
    *
    */
  var mode: range | steps | positions | count | values = js.native
  /**
    * stepped option for positions, values and count mode
    */
  var stepped: js.UndefOr[Boolean] = js.native
  /**
    *
    * values for positions and values mode
    * number pips for count mode
    */
  var values: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PipsOptions {
  @scala.inline
  def apply(mode: range | steps | positions | count | values): PipsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipsOptions]
  }
  @scala.inline
  implicit class PipsOptionsOps[Self <: PipsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: range | steps | positions | count | values): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* repeated */ js.Any => PipFilterResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withStepped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepped")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

