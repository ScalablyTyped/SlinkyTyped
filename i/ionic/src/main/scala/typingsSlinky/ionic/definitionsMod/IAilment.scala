package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAilment extends js.Object {
  val id: String = js.native
  var `implicit`: Boolean = js.native
  var projects: js.UndefOr[js.Array[ProjectType]] = js.native
  def detected(): js.Promise[Boolean] = js.native
  def getMessage(): js.Promise[String] = js.native
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]] = js.native
}

object IAilment {
  @scala.inline
  def apply(
    detected: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getTreatmentSteps: () => js.Promise[js.Array[PatientTreatmentStep]],
    id: String,
    `implicit`: Boolean
  ): IAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAilment]
  }
  @scala.inline
  implicit class IAilmentOps[Self <: IAilment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetected(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMessage(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTreatmentSteps(value: () => js.Promise[js.Array[PatientTreatmentStep]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTreatmentSteps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: js.Array[ProjectType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
  }
  
}

