package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
  /**
    * The shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}

object UpdateNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): UpdateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInstanceLifecycleConfigInput]
  }
  @scala.inline
  implicit class UpdateNotebookInstanceLifecycleConfigInputOps[Self <: UpdateNotebookInstanceLifecycleConfigInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(value.asInstanceOf[js.Any])
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

