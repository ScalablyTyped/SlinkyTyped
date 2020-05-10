package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes SourceRepository, used to represent parameters related to source
  * repository where a function is hosted.
  */
@js.native
trait SchemaSourceRepository extends js.Object {
  /**
    * Output only. The URL pointing to the hosted repository where the function
    * were defined at the time of deployment. It always points to a specific
    * commit in the format described above.
    */
  var deployedUrl: js.UndefOr[String] = js.native
  /**
    * The URL pointing to the hosted repository where the function is defined.
    * There are supported Cloud Source Repository URLs in the following
    * formats:  To refer to a specific commit:
    * `https://source.developers.google.com/projects/x/repos/x/revisions/x/paths/x
    * To refer to a moveable alias (branch):
    * `https://source.developers.google.com/projects/x/repos/x/moveable-aliases/x/paths/x
    * In particular, to refer to HEAD use `master` moveable alias. To refer to
    * a specific fixed alias (tag):
    * `https://source.developers.google.com/projects/x/repos/x/fixed-aliases/x/paths/x
    * You may omit `paths/x if you want to use the main directory.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSourceRepository {
  @scala.inline
  def apply(): SchemaSourceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceRepository]
  }
  @scala.inline
  implicit class SchemaSourceRepositoryOps[Self <: SchemaSourceRepository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

