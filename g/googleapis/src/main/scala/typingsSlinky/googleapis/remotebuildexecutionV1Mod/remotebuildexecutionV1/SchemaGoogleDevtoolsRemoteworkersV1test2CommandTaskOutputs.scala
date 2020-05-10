package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the expected outputs of the command.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends js.Object {
  /**
    * A list of expected directories, relative to the execution root. All paths
    * MUST be delimited by forward slashes.
    */
  var directories: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of expected files, relative to the execution root. All paths MUST
    * be delimited by forward slashes.
    */
  var files: js.UndefOr[js.Array[String]] = js.native
  /**
    * The destination to which any stderr should be sent. The method by which
    * the bot should send the stream contents to that destination is not
    * defined in this API. As examples, the destination could be a file
    * referenced in the `files` field in this message, or it could be a URI
    * that must be written via the ByteStream API.
    */
  var stderrDestination: js.UndefOr[String] = js.native
  /**
    * The destination to which any stdout should be sent. The method by which
    * the bot should send the stream contents to that destination is not
    * defined in this API. As examples, the destination could be a file
    * referenced in the `files` field in this message, or it could be a URI
    * that must be written via the ByteStream API.
    */
  var stdoutDestination: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputsOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withStderrDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderrDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withStdoutDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutDestination")(js.undefined)
        ret
    }
  }
  
}

