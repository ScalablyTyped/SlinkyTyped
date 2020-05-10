package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBearingSnap extends js.Object {
  var bearingSnap: js.UndefOr[Double] = js.native
  var pitchWithRotate: js.UndefOr[Boolean] = js.native
}

object AnonBearingSnap {
  @scala.inline
  def apply(): AnonBearingSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBearingSnap]
  }
  @scala.inline
  implicit class AnonBearingSnapOps[Self <: AnonBearingSnap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearingSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearingSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearingSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearingSnap")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchWithRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchWithRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchWithRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchWithRotate")(js.undefined)
        ret
    }
  }
  
}

