package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a file. Similar to the equivalent message in the Remote
  * Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata extends js.Object {
  /**
    * If the file is small enough, its contents may also or alternatively be
    * listed here.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * A pointer to the contents of the file. The method by which a client
    * retrieves the contents from a CAS system is not defined here.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * Properties of the file
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The path of this file. If this message is part of the
    * CommandOutputs.outputs fields, the path is relative to the execution root
    * and must correspond to an entry in CommandTask.outputs.files. If this
    * message is part of a Directory message, then the path is relative to the
    * root of that directory. All paths MUST be delimited by forward slashes.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadataOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withDigest(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = {
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

