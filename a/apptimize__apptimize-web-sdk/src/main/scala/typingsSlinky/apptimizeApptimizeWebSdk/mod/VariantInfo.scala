package typingsSlinky.apptimizeApptimizeWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantInfo extends js.Object {
  def getAnonymousUserId(): String = js.native
  def getCurrentPhase(): Double = js.native
  def getCycle(): Double = js.native
  def getExperimentId(): Double = js.native
  def getExperimentName(): String = js.native
  def getExperimentType(): Double = js.native
  def getExperimentTypeName(): String = js.native
  def getParticipationPhase(): Double = js.native
  def getUserHasParticipated(): Boolean = js.native
  def getUserId(): String = js.native
  def getVariantId(): Double = js.native
  def getVariantName(): String = js.native
}

object VariantInfo {
  @scala.inline
  def apply(
    getAnonymousUserId: () => String,
    getCurrentPhase: () => Double,
    getCycle: () => Double,
    getExperimentId: () => Double,
    getExperimentName: () => String,
    getExperimentType: () => Double,
    getExperimentTypeName: () => String,
    getParticipationPhase: () => Double,
    getUserHasParticipated: () => Boolean,
    getUserId: () => String,
    getVariantId: () => Double,
    getVariantName: () => String
  ): VariantInfo = {
    val __obj = js.Dynamic.literal(getAnonymousUserId = js.Any.fromFunction0(getAnonymousUserId), getCurrentPhase = js.Any.fromFunction0(getCurrentPhase), getCycle = js.Any.fromFunction0(getCycle), getExperimentId = js.Any.fromFunction0(getExperimentId), getExperimentName = js.Any.fromFunction0(getExperimentName), getExperimentType = js.Any.fromFunction0(getExperimentType), getExperimentTypeName = js.Any.fromFunction0(getExperimentTypeName), getParticipationPhase = js.Any.fromFunction0(getParticipationPhase), getUserHasParticipated = js.Any.fromFunction0(getUserHasParticipated), getUserId = js.Any.fromFunction0(getUserId), getVariantId = js.Any.fromFunction0(getVariantId), getVariantName = js.Any.fromFunction0(getVariantName))
    __obj.asInstanceOf[VariantInfo]
  }
  @scala.inline
  implicit class VariantInfoOps[Self <: VariantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnonymousUserId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnonymousUserId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentPhase(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPhase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCycle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExperimentId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExperimentId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExperimentName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExperimentName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExperimentType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExperimentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExperimentTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExperimentTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParticipationPhase(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParticipationPhase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserHasParticipated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserHasParticipated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariantId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariantId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariantName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariantName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

