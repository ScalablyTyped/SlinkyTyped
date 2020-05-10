package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a blob of binary content with its digest.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2Blob extends js.Object {
  /**
    * The contents of the blob.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * The digest of the blob. This should be verified by the receiver.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2Blob {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Blob]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2BlobOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Blob] (val x: Self) extends AnyVal {
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
  }
  
}

