package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The shell script that runs only once, when you create a notebook instance.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}

object DescribeNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(): DescribeNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
  }
  @scala.inline
  implicit class DescribeNotebookInstanceLifecycleConfigOutputOps[Self <: DescribeNotebookInstanceLifecycleConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceLifecycleConfigArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceLifecycleConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreate(value: NotebookInstanceLifecycleConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: NotebookInstanceLifecycleConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStart")(js.undefined)
        ret
    }
  }
  
}

