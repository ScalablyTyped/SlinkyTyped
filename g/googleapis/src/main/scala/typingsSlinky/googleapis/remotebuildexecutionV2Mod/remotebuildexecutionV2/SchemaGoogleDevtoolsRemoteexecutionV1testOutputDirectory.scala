package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputDirectory` is the output in an `ActionResult` corresponding to a
  * directory&#39;s full contents rather than a single file.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory extends js.Object {
  /**
    * DEPRECATED: This field is deprecated and should no longer be used.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
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
  var treeDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectoryOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
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
    def withTreeDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = {
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

