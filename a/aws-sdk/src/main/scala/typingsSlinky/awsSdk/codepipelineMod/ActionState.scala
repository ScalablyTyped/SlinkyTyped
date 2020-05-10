package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionState extends js.Object {
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  /**
    * Represents information about the version (or revision) of an action.
    */
  var currentRevision: js.UndefOr[ActionRevision] = js.native
  /**
    * A URL link for more information about the state of the action, such as a deployment group details page.
    */
  var entityUrl: js.UndefOr[Url] = js.native
  /**
    * Represents information about the run of an action.
    */
  var latestExecution: js.UndefOr[ActionExecution] = js.native
  /**
    * A URL link for more information about the revision, such as a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
}

object ActionState {
  @scala.inline
  def apply(): ActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionState]
  }
  @scala.inline
  implicit class ActionStateOps[Self <: ActionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRevision(value: ActionRevision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestExecution(value: ActionExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionUrl")(js.undefined)
        ret
    }
  }
  
}

