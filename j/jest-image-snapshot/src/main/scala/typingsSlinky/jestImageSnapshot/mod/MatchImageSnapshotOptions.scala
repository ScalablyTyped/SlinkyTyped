package typingsSlinky.jestImageSnapshot.mod

import typingsSlinky.jestImageSnapshot.AnonCounter
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.horizontal
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.percent
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.pixel
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchImageSnapshotOptions extends js.Object {
  /**
    * Applies Gaussian Blur on compared images, accepts radius in pixels as value. Useful when you have noise after
    * scaling images per different resolutions on your target website, usually setting it's value to 1-2 should be
    * enough to solve that problem.
    * Defaults to 0.
    */
  var blur: js.UndefOr[Double] = js.native
  /**
    * Custom config passed to 'pixelmatch'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions] = js.native
  /**
    * A custom absolute path of a directory to keep this diff in
    */
  var customDiffDir: js.UndefOr[String] = js.native
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically. When a function is provided
    * it is called with an object containing testPath, currentTestName, counter and defaultIdentifier as its first
    * argument. The function must return an identifier to use for the snapshot.
    */
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ AnonCounter, String]) | String] = js.native
  /**
    * Custom snapshots directory.
    * Absolute path of a directory to keep the snapshot in.
    */
  var customSnapshotsDir: js.UndefOr[String] = js.native
  /**
    * Changes diff image layout direction, default is horizontal.
    */
  var diffDirection: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Will output base64 string of a diff image to console in case of failed tests (in addition to creating a diff image).
    * This string can be copy-pasted to a browser address string to preview the diff for a failed test.
    */
  var dumpDiffToConsole: js.UndefOr[Boolean] = js.native
  /**
    * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
    * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
    * this is the failure threshold for the entire comparison.
    * Defaults to 0.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * Sets the type of threshold that would trigger a failure.
    * Defaults to 'pixel'.
    */
  var failureThresholdType: js.UndefOr[pixel | percent] = js.native
  /**
    * Removes coloring from the console output, useful if storing the results to a file.
    * Defaults to false.
    */
  var noColors: js.UndefOr[Boolean] = js.native
  /**
    * Runs the diff in process without spawning a child process.
    * Defaults to false.
    */
  var runInProcess: js.UndefOr[Boolean] = js.native
  /**
    * Updates a snapshot even if it passed the threshold against the existing one.
    * Defaults to false.
    */
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.native
}

object MatchImageSnapshotOptions {
  @scala.inline
  def apply(): MatchImageSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchImageSnapshotOptions]
  }
  @scala.inline
  implicit class MatchImageSnapshotOptionsOps[Self <: MatchImageSnapshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCustomDiffConfig(value: PixelmatchOptions): Self = {
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
    def withCustomSnapshotIdentifierFunction1(value: /* parameters */ AnonCounter => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSnapshotIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ AnonCounter, String]) | String): Self = {
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
    def withDumpDiffToConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpDiffToConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpDiffToConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpDiffToConsole")(js.undefined)
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

