package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotStatus extends Generic {
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var repository: js.UndefOr[String] = js.native
  var snapshot: js.UndefOr[String | js.Array[String]] = js.native
}

object SnapshotStatus {
  @scala.inline
  def apply(): SnapshotStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotStatus]
  }
  @scala.inline
  implicit class SnapshotStatusOps[Self <: SnapshotStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore_unavailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_unavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster_timeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshot(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
  }
  
}

