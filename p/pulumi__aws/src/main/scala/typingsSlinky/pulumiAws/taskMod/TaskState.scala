package typingsSlinky.pulumiAws.taskMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.datasync.TaskOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Name of the DataSync Task.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: js.UndefOr[Input[TaskOptions]] = js.native
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object TaskState {
  @scala.inline
  def apply(): TaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskState]
  }
  @scala.inline
  implicit class TaskStateOps[Self <: TaskState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogGroupArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationLocationArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationLocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Input[TaskOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLocationArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

