package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputDirectory` is the output in an `ActionResult` corresponding to a
  * directory&#39;s full contents rather than a single file.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2OutputDirectory extends js.Object {
  /**
    * The full path of the directory relative to the working directory. The
    * path separator is a forward slash `/`. Since this is a relative path, it
    * MUST NOT begin with a leading forward slash. The empty string value is
    * allowed, and it denotes the entire working directory.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The digest of the encoded Tree proto containing the directory&#39;s
    * contents.
    */
  var treeDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
}

object SchemaBuildBazelRemoteExecutionV2OutputDirectory {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputDirectory]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputDirectoryOps[Self <: SchemaBuildBazelRemoteExecutionV2OutputDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDigest")(js.undefined)
        ret
    }
  }
  
}

