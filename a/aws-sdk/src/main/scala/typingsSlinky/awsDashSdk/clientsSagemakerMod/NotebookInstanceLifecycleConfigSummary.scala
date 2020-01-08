package typingsSlinky.awsDashSdk.clientsSagemakerMod

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
  var NotebookInstanceLifecycleConfigArn: typingsSlinky.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigArn = js.native
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typingsSlinky.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}

object NotebookInstanceLifecycleConfigSummary {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    CreationTime: js.Date = null,
    LastModifiedTime: js.Date = null
  ): NotebookInstanceLifecycleConfigSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigArn = NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any], NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
  }
}

