package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTriggerExecutionFailure extends js.Object {
  /**
    * Message information about the trigger that did not run.
    */
  var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.native
  /**
    * The name of the trigger that did not run.
    */
  var trigger: js.UndefOr[RepositoryTriggerName] = js.native
}

object RepositoryTriggerExecutionFailure {
  @scala.inline
  def apply(): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
  @scala.inline
  implicit class RepositoryTriggerExecutionFailureOps[Self <: RepositoryTriggerExecutionFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureMessage(value: RepositoryTriggerExecutionFailureMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: RepositoryTriggerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

