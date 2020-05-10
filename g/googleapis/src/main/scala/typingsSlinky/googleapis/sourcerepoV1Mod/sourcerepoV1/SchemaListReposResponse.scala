package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListRepos.  The size is not set in the returned repositories.
  */
@js.native
trait SchemaListReposResponse extends js.Object {
  /**
    * If non-empty, additional repositories exist within the project. These can
    * be retrieved by including this value in the next ListReposRequest&#39;s
    * page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed repos.
    */
  var repos: js.UndefOr[js.Array[SchemaRepo]] = js.native
}

object SchemaListReposResponse {
  @scala.inline
  def apply(): SchemaListReposResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReposResponse]
  }
  @scala.inline
  implicit class SchemaListReposResponseOps[Self <: SchemaListReposResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRepos(value: js.Array[SchemaRepo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(js.undefined)
        ret
    }
  }
  
}

