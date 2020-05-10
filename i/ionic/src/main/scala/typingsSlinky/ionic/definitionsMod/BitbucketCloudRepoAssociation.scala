package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.bitbucket_cloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitbucketCloudRepoAssociation
  extends RepoAssociationBase
     with RepoAssociation {
  var id: String = js.native
  var `type`: bitbucket_cloud = js.native
}

object BitbucketCloudRepoAssociation {
  @scala.inline
  def apply(clone_url: String, full_name: String, html_url: String, id: String, `type`: bitbucket_cloud): BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
  @scala.inline
  implicit class BitbucketCloudRepoAssociationOps[Self <: BitbucketCloudRepoAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: bitbucket_cloud): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

