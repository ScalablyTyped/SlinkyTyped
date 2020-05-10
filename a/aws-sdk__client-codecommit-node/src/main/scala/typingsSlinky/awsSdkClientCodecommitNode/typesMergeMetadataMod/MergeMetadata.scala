package typingsSlinky.awsSdkClientCodecommitNode.typesMergeMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeMetadata extends js.Object {
  /**
    * <p>A Boolean value indicating whether the merge has been made.</p>
    */
  var isMerged: js.UndefOr[Boolean] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the user who merged the branches.</p>
    */
  var mergedBy: js.UndefOr[String] = js.native
}

object MergeMetadata {
  @scala.inline
  def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  @scala.inline
  implicit class MergeMetadataOps[Self <: MergeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedBy")(js.undefined)
        ret
    }
  }
  
}

