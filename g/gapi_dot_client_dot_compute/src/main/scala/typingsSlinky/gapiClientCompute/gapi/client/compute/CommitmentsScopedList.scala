package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitmentsScopedList extends js.Object {
  /** [Output Only] List of commitments contained in this scope. */
  var commitments: js.UndefOr[js.Array[Commitment]] = js.native
  /** [Output Only] Informational warning which replaces the list of commitments when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.native
}

object CommitmentsScopedList {
  @scala.inline
  def apply(): CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentsScopedList]
  }
  @scala.inline
  implicit class CommitmentsScopedListOps[Self <: CommitmentsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitments(value: js.Array[Commitment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitments")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

