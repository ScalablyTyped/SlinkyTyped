package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputFile` is similar to a FileNode, but it is tailored for output as
  * part of an `ActionResult`. It allows a full file path rather than only a
  * name, and allows the server to include content inline.  `OutputFile` is
  * binary-compatible with `FileNode`.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile extends js.Object {
  /**
    * The raw content of the file.  This field may be used by the server to
    * provide the content of a file inline in an ActionResult and avoid
    * requiring that the client make a separate call to
    * [ContentAddressableStorage.GetBlob] to retrieve it.  The client SHOULD
    * NOT assume that it will get raw content with any request, and always be
    * prepared to retrieve it via `digest`.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The full path of the file relative to the input root, including the
    * filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testOutputFileOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
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
    def withIsExecutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExecutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExecutable")(js.undefined)
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
  }
  
}

