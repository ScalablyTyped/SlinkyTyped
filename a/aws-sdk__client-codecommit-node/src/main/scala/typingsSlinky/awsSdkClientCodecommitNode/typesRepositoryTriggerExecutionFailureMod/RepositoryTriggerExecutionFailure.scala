package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTriggerExecutionFailure extends js.Object {
  /**
    * <p>Additional message information about the trigger that did not run.</p>
    */
  var failureMessage: js.UndefOr[String] = js.native
  /**
    * <p>The name of the trigger that did not run.</p>
    */
  var trigger: js.UndefOr[String] = js.native
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
    def withFailureMessage(value: String): Self = {
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
    def withTrigger(value: String): Self = {
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

