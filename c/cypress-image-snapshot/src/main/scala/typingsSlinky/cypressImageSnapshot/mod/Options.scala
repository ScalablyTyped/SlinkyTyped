package typingsSlinky.cypressImageSnapshot.mod

import org.scalajs.dom.raw.Document
import typingsSlinky.cypressImageSnapshot.anon.Counter
import typingsSlinky.cypressImageSnapshot.anon.Height
import typingsSlinky.cypressImageSnapshot.anon.IncludeAA
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.fullPage
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.horizontal
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.percent
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.pixel
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.runner
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.vertical
import typingsSlinky.cypressImageSnapshot.cypressImageSnapshotStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<{  blackout  :std.Array<string>,   capture  :'runner' | 'viewport' | 'fullPage',   clip  :{  x  :number,   y  :number,   width  :number,   height  :number},   disableTimersAndAnimations  :boolean,   padding  :number | [number] | [number, number] | [number, number, number] | [number, number, number, number],   scale  :boolean, beforeScreenshot (doc : std.Document): void, afterScreenshot (doc : std.Document): void,   customDiffConfig ? :{ readonly threshold ? :number,  readonly includeAA ? :boolean},   customSnapshotsDir ? :string,   customDiffDir ? :string,   customSnapshotIdentifier ? :(parameters : {  testPath  :string,   currentTestName  :string,   counter  :number,   defaultIdentifier  :string}): string | string,   diffDirection ? :'horizontal' | 'vertical',   noColors ? :boolean,   failureThreshold ? :number,   failureThresholdType ? :'pixel' | 'percent',   updatePassedSnapshot ? :boolean,   blur ? :number,   runInProcess ? :boolean}> */
@js.native
trait Options extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.native
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.native
  var blackout: js.UndefOr[js.Array[String]] = js.native
  var blur: js.UndefOr[Double] = js.native
  var capture: js.UndefOr[runner | viewport | fullPage] = js.native
  var clip: js.UndefOr[Height] = js.native
  var customDiffConfig: js.UndefOr[IncludeAA] = js.native
  var customDiffDir: js.UndefOr[String] = js.native
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.native
  var customSnapshotsDir: js.UndefOr[String] = js.native
  var diffDirection: js.UndefOr[horizontal | vertical] = js.native
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.native
  var failureThreshold: js.UndefOr[Double] = js.native
  var failureThresholdType: js.UndefOr[pixel | percent] = js.native
  var noColors: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[
    Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  ] = js.native
  var runInProcess: js.UndefOr[Boolean] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.native
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
    def withAfterScreenshot(value: /* doc */ Document => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeScreenshot(value: /* doc */ Document => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackout(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackout")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: runner | viewport | fullPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDiffConfig(value: IncludeAA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDiffConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDiffConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDiffConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDiffDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDiffDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDiffDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDiffDir")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSnapshotsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSnapshotsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotsDir")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTimersAndAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimersAndAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTimersAndAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimersAndAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureThresholdType(value: pixel | percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThresholdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThresholdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThresholdType")(js.undefined)
        ret
    }
    @scala.inline
    def withNoColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColors")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(
      value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRunInProcess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunInProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePassedSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePassedSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePassedSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePassedSnapshot")(js.undefined)
        ret
    }
  }
  
}

