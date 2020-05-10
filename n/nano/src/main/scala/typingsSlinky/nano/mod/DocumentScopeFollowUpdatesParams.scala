package typingsSlinky.nano.mod

import typingsSlinky.nano.nanoStrings.continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScopeFollowUpdatesParams extends js.Object {
  var feed: js.UndefOr[continuous] = js.native
  var filter: js.UndefOr[String | FollowUpdatesParamsFilterFunction] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var heartbeat: js.UndefOr[Double] = js.native
  var inactivity_ms: js.UndefOr[Double] = js.native
  var include_docs: js.UndefOr[Boolean] = js.native
  var initial_retry_delay: js.UndefOr[Double] = js.native
  var max_retry_seconds: js.UndefOr[Double] = js.native
  var query_params: js.UndefOr[js.Any] = js.native
  var response_grace_time: js.UndefOr[Double] = js.native
  var since: js.UndefOr[String] = js.native
}

object DocumentScopeFollowUpdatesParams {
  @scala.inline
  def apply(): DocumentScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentScopeFollowUpdatesParams]
  }
  @scala.inline
  implicit class DocumentScopeFollowUpdatesParamsOps[Self <: DocumentScopeFollowUpdatesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeed(value: continuous): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction2(value: (/* doc */ js.Any, /* req */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(value: String | FollowUpdatesParamsFilterFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(js.undefined)
        ret
    }
    @scala.inline
    def withInactivity_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivity_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactivity_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivity_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial_retry_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_retry_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_retry_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_retry_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_retry_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retry_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_retry_seconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retry_seconds")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_params(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_params")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_grace_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_grace_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_grace_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_grace_time")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
  }
  
}

