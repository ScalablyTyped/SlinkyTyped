package typingsSlinky.ionic.libProjectMod

import typingsSlinky.ionic.ionicStrings.multiapp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetailsMultiAppResult extends ProjectDetailsResultBase {
  val context: multiapp = js.native
  val id: js.UndefOr[String] = js.native
}

object ProjectDetailsMultiAppResult {
  @scala.inline
  def apply(context: multiapp, errors: js.Array[ProjectDetailsError]): ProjectDetailsMultiAppResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsMultiAppResult]
  }
  @scala.inline
  implicit class ProjectDetailsMultiAppResultOps[Self <: ProjectDetailsMultiAppResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: multiapp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

