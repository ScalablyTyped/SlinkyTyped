package typingsSlinky.compassVerticalRhythm.mod

import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.Percentsign
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.ch
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.dashed
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.dotted
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.double
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.em
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.ex
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.groove
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.hidden
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.inset
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.none
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.outset
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.px
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.rem
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.ridge
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.solid
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.vh
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.vmin
import typingsSlinky.compassVerticalRhythm.compassVerticalRhythmStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.native
  var baseLineHeight: js.UndefOr[Double | String] = js.native
  var defaultRhythmBorderStyle: js.UndefOr[
    solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
  ] = js.native
  var defaultRhythmBorderWidth: js.UndefOr[String] = js.native
  var minLinePadding: js.UndefOr[String] = js.native
  var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.native
  var roundToNearestHalfLine: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseLineHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRhythmBorderStyle(value: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRhythmBorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRhythmBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRhythmBorderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRhythmBorderWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRhythmBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRhythmBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRhythmBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLinePadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLinePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLinePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLinePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withRhythmUnit(value: Percentsign | em | ex | ch | px | rem | vw | vh | vmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhythmUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRhythmUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhythmUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundToNearestHalfLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundToNearestHalfLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundToNearestHalfLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundToNearestHalfLine")(js.undefined)
        ret
    }
  }
  
}

