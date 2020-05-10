package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceProvenance extends js.Object {
  /**
    * Hash(es) of the build source, which can be used to verify that the original
    * source integrity was maintained in the build. Note that FileHashes will
    * only be populated if BuildOptions has requested a SourceProvenanceHash.
    *
    * The keys to this map are file paths used as build source and the values
    * contain the hash values for those files.
    *
    * If the build source came in a single package such as a gzipped tarfile
    * (.tar.gz), the FileHash will be for the single path to that file.
    * @OutputOnly
    */
  var fileHashes: js.UndefOr[Record[String, FileHashes]] = js.native
  /**
    * A copy of the build's source.repo_source, if exists, with any
    * revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[RepoSource] = js.native
  /**
    * A copy of the build's source.storage_source, if exists, with any
    * generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[StorageSource] = js.native
}

object SourceProvenance {
  @scala.inline
  def apply(): SourceProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceProvenance]
  }
  @scala.inline
  implicit class SourceProvenanceOps[Self <: SourceProvenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileHashes(value: Record[String, FileHashes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedRepoSource(value: RepoSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedRepoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedRepoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedRepoSource")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedStorageSource(value: StorageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedStorageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedStorageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedStorageSource")(js.undefined)
        ret
    }
  }
  
}

