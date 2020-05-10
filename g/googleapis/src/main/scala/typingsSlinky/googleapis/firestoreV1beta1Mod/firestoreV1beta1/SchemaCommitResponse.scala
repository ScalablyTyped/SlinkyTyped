package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.native
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
    def withCommitTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteResults(value: js.Array[SchemaWriteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeResults")(js.undefined)
        ret
    }
  }
  
}

