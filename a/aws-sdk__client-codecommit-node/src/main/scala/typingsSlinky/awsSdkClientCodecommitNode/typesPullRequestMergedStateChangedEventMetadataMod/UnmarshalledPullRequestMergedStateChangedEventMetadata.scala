package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod

import typingsSlinky.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequestMergedStateChangedEventMetadata extends PullRequestMergedStateChangedEventMetadata {
  /**
    * <p>Information about the merge state change event.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[UnmarshalledMergeMetadata] = js.native
}

object UnmarshalledPullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(): UnmarshalledPullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequestMergedStateChangedEventMetadata]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestMergedStateChangedEventMetadataOps[Self <: UnmarshalledPullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeMetadata(value: UnmarshalledMergeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMetadata")(js.undefined)
        ret
    }
  }
  
}

