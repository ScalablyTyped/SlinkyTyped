package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListTagsResponseItem extends js.Object {
  var commit: ReposListTagsResponseItemCommit = js.native
  var name: String = js.native
  var tarball_url: String = js.native
  var zipball_url: String = js.native
}

object ReposListTagsResponseItem {
  @scala.inline
  def apply(commit: ReposListTagsResponseItemCommit, name: String, tarball_url: String, zipball_url: String): ReposListTagsResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListTagsResponseItem]
  }
  @scala.inline
  implicit class ReposListTagsResponseItemOps[Self <: ReposListTagsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: ReposListTagsResponseItemCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarball_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarball_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipball_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipball_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

