package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotEvent extends js.Object {
  var added: js.UndefOr[js.Array[SpecDocument]] = js.native
  var errorCode: js.UndefOr[Double] = js.native
  var fromCache: js.UndefOr[Boolean] = js.native
  var hasPendingWrites: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Array[SpecDocument]] = js.native
  var modified: js.UndefOr[js.Array[SpecDocument]] = js.native
  var query: SpecQuery = js.native
  var removed: js.UndefOr[js.Array[SpecDocument]] = js.native
}

object SnapshotEvent {
  @scala.inline
  def apply(query: SpecQuery): SnapshotEvent = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotEvent]
  }
  @scala.inline
  implicit class SnapshotEventOps[Self <: SnapshotEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: SpecQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdded(value: js.Array[SpecDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFromCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPendingWrites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingWrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPendingWrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingWrites")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[SpecDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: js.Array[SpecDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[SpecDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
  }
  
}

