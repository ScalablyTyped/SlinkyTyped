package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceLifecycleConfigSummary extends js.Object {
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
  var NotebookInstanceLifecycleConfigArn: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn = js.native
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}

object NotebookInstanceLifecycleConfigSummary {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  ): NotebookInstanceLifecycleConfigSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigArn = NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any], NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
  }
  @scala.inline
  implicit class NotebookInstanceLifecycleConfigSummaryOps[Self <: NotebookInstanceLifecycleConfigSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

