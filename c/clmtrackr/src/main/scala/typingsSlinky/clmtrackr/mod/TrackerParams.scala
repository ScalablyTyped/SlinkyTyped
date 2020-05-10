package typingsSlinky.clmtrackr.mod

import typingsSlinky.clmtrackr.AnonUseWebWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackerParams extends js.Object {
  /** whether to use constant velocity model when fitting (default is true) */
  var constantVelocity: js.UndefOr[Boolean] = js.native
  /** object with parameters for facedetection : */
  var faceDetection: js.UndefOr[AnonUseWebWorkers] = js.native
  /** threshold for when to assume we've lost tracking (default is 0.50) */
  var scoreThreshold: js.UndefOr[Double] = js.native
  /** the size of the searchwindow around each point (default is 11) */
  var searchWindow: js.UndefOr[Double] = js.native
  /** whether to stop tracking when the fitting has converged (default is false) */
  var stopOnConvergence: js.UndefOr[Boolean] = js.native
  /** whether to use webGL if it is available (default is true) */
  var useWebGL: js.UndefOr[Boolean] = js.native
}

object TrackerParams {
  @scala.inline
  def apply(): TrackerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackerParams]
  }
  @scala.inline
  implicit class TrackerParamsOps[Self <: TrackerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstantVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceDetection(value: AnonUseWebWorkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnConvergence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnConvergence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnConvergence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnConvergence")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWebGL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebGL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWebGL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWebGL")(js.undefined)
        ret
    }
  }
  
}

