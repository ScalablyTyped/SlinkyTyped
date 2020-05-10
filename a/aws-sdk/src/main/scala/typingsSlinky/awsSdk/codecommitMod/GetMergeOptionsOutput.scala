package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeOptionsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object GetMergeOptionsOutput {
  @scala.inline
  def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
  @scala.inline
  implicit class GetMergeOptionsOutputOps[Self <: GetMergeOptionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOptions(value: MergeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

