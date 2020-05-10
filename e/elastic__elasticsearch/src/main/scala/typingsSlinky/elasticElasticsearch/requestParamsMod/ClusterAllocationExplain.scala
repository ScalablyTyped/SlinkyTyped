package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterAllocationExplain[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var include_disk_info: js.UndefOr[Boolean] = js.native
  var include_yes_decisions: js.UndefOr[Boolean] = js.native
}

object ClusterAllocationExplain {
  @scala.inline
  def apply[T](): ClusterAllocationExplain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplain[T]]
  }
  @scala.inline
  implicit class ClusterAllocationExplainOps[Self[t] <: ClusterAllocationExplain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
    def withInclude_disk_info(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_disk_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_disk_info: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_disk_info")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_yes_decisions(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_yes_decisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_yes_decisions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_yes_decisions")(js.undefined)
        ret
    }
  }
  
}

