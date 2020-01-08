package typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmMod

import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.Percentsign
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ch
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.dashed
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.dotted
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.double
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.em
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ex
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.groove
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.hidden
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.inset
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.none
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.outset
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.px
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.rem
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ridge
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.solid
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vh
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vmin
import typingsSlinky.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vw
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

