package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradeHistory extends js.Object {
  /** The teacher who made the grade change. */
  var actorUserId: js.UndefOr[String] = js.native
  /** The type of grade change at this time in the submission grade history. */
  var gradeChangeType: js.UndefOr[String] = js.native
  /** When the grade of the submission was changed. */
  var gradeTimestamp: js.UndefOr[String] = js.native
  /**
    * The denominator of the grade at this time in the submission grade
    * history.
    */
  var maxPoints: js.UndefOr[Double] = js.native
  /** The numerator of the grade at this time in the submission grade history. */
  var pointsEarned: js.UndefOr[Double] = js.native
}

object GradeHistory {
  @scala.inline
  def apply(): GradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradeHistory]
  }
  @scala.inline
  implicit class GradeHistoryOps[Self <: GradeHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActorUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActorUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withGradeChangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeChangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradeChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeChangeType")(js.undefined)
        ret
    }
    @scala.inline
    def withGradeTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradeTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsEarned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsEarned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsEarned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsEarned")(js.undefined)
        ret
    }
  }
  
}

