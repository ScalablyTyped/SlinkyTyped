package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReposLegacyResponse extends js.Object {
  var repositories: js.Array[SearchReposLegacyResponseRepositoriesItem] = js.native
}

object SearchReposLegacyResponse {
  @scala.inline
  def apply(repositories: js.Array[SearchReposLegacyResponseRepositoriesItem]): SearchReposLegacyResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposLegacyResponse]
  }
  @scala.inline
  implicit class SearchReposLegacyResponseOps[Self <: SearchReposLegacyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositories(value: js.Array[SearchReposLegacyResponseRepositoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

