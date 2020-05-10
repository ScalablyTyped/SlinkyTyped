package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a shell-style task to execute, suitable for providing as the Bots
  * interface&#39;s `Lease.payload` field.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask extends js.Object {
  /**
    * The expected outputs from the task.
    */
  var expectedOutputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] = js.native
  /**
    * The inputs to the task.
    */
  var inputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] = js.native
  /**
    * The timeouts of this task.
    */
  var timeouts: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectedOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedOutputs")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeouts(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(js.undefined)
        ret
    }
  }
  
}

