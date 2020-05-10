package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExamStatus extends js.Object {
  /** The type of the exam. */
  var examType: js.UndefOr[String] = js.native
  /** Date this exam is due to expire. */
  var expiration: js.UndefOr[String] = js.native
  /** The date the user last passed this exam. */
  var lastPassed: js.UndefOr[String] = js.native
  /** Whether this exam has been passed and not expired. */
  var passed: js.UndefOr[Boolean] = js.native
  /** The date the user last taken this exam. */
  var taken: js.UndefOr[String] = js.native
  /** Whether this exam is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.native
}

object ExamStatus {
  @scala.inline
  def apply(): ExamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExamStatus]
  }
  @scala.inline
  implicit class ExamStatusOps[Self <: ExamStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPassed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(js.undefined)
        ret
    }
    @scala.inline
    def withTaken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

