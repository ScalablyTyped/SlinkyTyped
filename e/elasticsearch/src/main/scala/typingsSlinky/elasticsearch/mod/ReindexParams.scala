package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReindexParams extends GenericParams {
  @JSName("body")
  var body_ReindexParams: typingsSlinky.elasticsearch.anon.Conflicts = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var requestsPerSecond: js.UndefOr[Double] = js.native
  var slices: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var waitForActiveShards: js.UndefOr[String] = js.native
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}

object ReindexParams {
  @scala.inline
  def apply(body: typingsSlinky.elasticsearch.anon.Conflicts): ReindexParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexParams]
  }
  @scala.inline
  implicit class ReindexParamsOps[Self <: ReindexParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: typingsSlinky.elasticsearch.anon.Conflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withSlices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForActiveShards(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForActiveShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForActiveShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForActiveShards")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForCompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCompletion")(js.undefined)
        ret
    }
  }
  
}

