package typingsSlinky.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketQuery extends js.Object {
  var project: String = js.native
  var userProject: String = js.native
}

object CreateBucketQuery {
  @scala.inline
  def apply(project: String, userProject: String): CreateBucketQuery = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], userProject = userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketQuery]
  }
  @scala.inline
  implicit class CreateBucketQueryOps[Self <: CreateBucketQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

