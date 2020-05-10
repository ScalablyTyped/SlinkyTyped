package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /** If provided, get source from this location in a Cloud Repo. */
  var repoSource: js.UndefOr[RepoSource] = js.native
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[StorageSource] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepoSource(value: RepoSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageSource(value: StorageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(js.undefined)
        ret
    }
  }
  
}

