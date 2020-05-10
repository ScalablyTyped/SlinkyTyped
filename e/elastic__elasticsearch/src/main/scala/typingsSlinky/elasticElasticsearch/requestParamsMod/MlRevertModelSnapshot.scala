package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlRevertModelSnapshot[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var delete_intervening_results: js.UndefOr[Boolean] = js.native
  var job_id: String = js.native
  var snapshot_id: String = js.native
}

object MlRevertModelSnapshot {
  @scala.inline
  def apply[T](job_id: String, snapshot_id: String): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
  @scala.inline
  implicit class MlRevertModelSnapshotOps[Self[t] <: MlRevertModelSnapshot[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withJob_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete_intervening_results(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_intervening_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete_intervening_results: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_intervening_results")(js.undefined)
        ret
    }
  }
  
}

