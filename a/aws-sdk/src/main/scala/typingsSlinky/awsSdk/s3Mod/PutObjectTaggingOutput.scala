package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectTaggingOutput extends js.Object {
  /**
    * The versionId of the object the tag-set was added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectTaggingOutput {
  @scala.inline
  def apply(): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
  @scala.inline
  implicit class PutObjectTaggingOutputOps[Self <: PutObjectTaggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionId(value: ObjectVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

