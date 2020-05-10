package typingsSlinky.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asana.asana.resources.Tasks.CreateParams & {  workspace  :string} */
@js.native
trait CreateParamsworkspacestri extends js.Object {
  var completed: js.UndefOr[Boolean] = js.native
  var hearted: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var notes: js.UndefOr[String] = js.native
  var workspace: String = js.native
}

object CreateParamsworkspacestri {
  @scala.inline
  def apply(name: String, workspace: String): CreateParamsworkspacestri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacestri]
  }
  @scala.inline
  implicit class CreateParamsworkspacestriOps[Self <: CreateParamsworkspacestri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.undefined)
        ret
    }
    @scala.inline
    def withHearted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hearted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHearted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hearted")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
  }
  
}

