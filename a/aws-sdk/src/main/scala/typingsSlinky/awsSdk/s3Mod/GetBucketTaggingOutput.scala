package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketTaggingOutput extends js.Object {
  /**
    * Contains the tag set.
    */
  var TagSet: typingsSlinky.awsSdk.s3Mod.TagSet = js.native
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
  @scala.inline
  implicit class GetBucketTaggingOutputOps[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagSet(value: TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

