package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestTargetMod

import typingsSlinky.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequestTarget extends PullRequestTarget {
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestTarget: js.UndefOr[UnmarshalledMergeMetadata] = js.native
}

object UnmarshalledPullRequestTarget {
  @scala.inline
  def apply(): UnmarshalledPullRequestTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequestTarget]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestTargetOps[Self <: UnmarshalledPullRequestTarget] (val x: Self) extends AnyVal {
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

