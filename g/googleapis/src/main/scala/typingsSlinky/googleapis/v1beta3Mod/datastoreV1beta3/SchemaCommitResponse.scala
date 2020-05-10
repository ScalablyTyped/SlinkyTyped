package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The number of index entries updated during the commit, or zero if none
    * were updated.
    */
  var indexUpdates: js.UndefOr[Double] = js.native
  /**
    * The result of performing the mutations. The i-th mutation result
    * corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[SchemaMutationResult]] = js.native
}

object SchemaCommitResponse {
  @scala.inline
  def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  @scala.inline
  implicit class SchemaCommitResponseOps[Self <: SchemaCommitResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexUpdates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withMutationResults(value: js.Array[SchemaMutationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationResults")(js.undefined)
        ret
    }
  }
  
}

