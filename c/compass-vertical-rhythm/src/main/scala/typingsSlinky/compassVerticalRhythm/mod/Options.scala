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

trait Options extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double | String] = js.undefined
  var defaultRhythmBorderStyle: js.UndefOr[
    solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
  ] = js.undefined
  var defaultRhythmBorderWidth: js.UndefOr[String] = js.undefined
  var minLinePadding: js.UndefOr[String] = js.undefined
  var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.undefined
  var roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseFontSize: String = null,
    baseLineHeight: Double | String = null,
    defaultRhythmBorderStyle: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset = null,
    defaultRhythmBorderWidth: String = null,
    minLinePadding: String = null,
    rhythmUnit: Percentsign | em | ex | ch | px | rem | vw | vh | vmin = null,
    roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (defaultRhythmBorderStyle != null) __obj.updateDynamic("defaultRhythmBorderStyle")(defaultRhythmBorderStyle.asInstanceOf[js.Any])
    if (defaultRhythmBorderWidth != null) __obj.updateDynamic("defaultRhythmBorderWidth")(defaultRhythmBorderWidth.asInstanceOf[js.Any])
    if (minLinePadding != null) __obj.updateDynamic("minLinePadding")(minLinePadding.asInstanceOf[js.Any])
    if (rhythmUnit != null) __obj.updateDynamic("rhythmUnit")(rhythmUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToNearestHalfLine)) __obj.updateDynamic("roundToNearestHalfLine")(roundToNearestHalfLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

