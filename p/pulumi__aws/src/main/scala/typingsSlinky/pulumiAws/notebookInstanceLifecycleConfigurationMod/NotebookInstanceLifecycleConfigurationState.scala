package typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceLifecycleConfigurationState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
    */
  val onCreate: js.UndefOr[Input[String]] = js.native
  /**
    * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
    */
  val onStart: js.UndefOr[Input[String]] = js.native
}

object NotebookInstanceLifecycleConfigurationState {
  @scala.inline
  def apply(): NotebookInstanceLifecycleConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigurationState]
  }
  @scala.inline
  implicit class NotebookInstanceLifecycleConfigurationStateOps[Self <: NotebookInstanceLifecycleConfigurationState] (val x: Self) extends AnyVal {
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
    def withOnCreate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

