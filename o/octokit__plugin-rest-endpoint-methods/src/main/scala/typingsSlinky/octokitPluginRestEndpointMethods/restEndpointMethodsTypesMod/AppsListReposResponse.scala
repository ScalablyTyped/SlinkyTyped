package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListReposResponse extends js.Object {
  var repositories: js.Array[AppsListReposResponseRepositoriesItem] = js.native
  var total_count: Double = js.native
}

object AppsListReposResponse {
  @scala.inline
  def apply(repositories: js.Array[AppsListReposResponseRepositoriesItem], total_count: Double): AppsListReposResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListReposResponse]
  }
  @scala.inline
  implicit class AppsListReposResponseOps[Self <: AppsListReposResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositories(value: js.Array[AppsListReposResponseRepositoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

