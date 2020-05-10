package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  var answer: String = js.native
  var answer_code: Double = js.native
  var exhaustive_faceting: js.UndefOr[`false`] = js.native
  var exhaustive_nb_hits: js.UndefOr[`false`] = js.native
  var index: String = js.native
  var ip: String = js.native
  var method: String = js.native
  var nb_api_calls: String = js.native
  var processing_time_ms: String = js.native
  var query_body: String = js.native
  var query_headers: String = js.native
  var query_nb_hits: String = js.native
  var query_params: String = js.native
  var sha1: String = js.native
  var timestamp: String = js.native
  var url: String = js.native
}

object Log {
  @scala.inline
  def apply(
    answer: String,
    answer_code: Double,
    index: String,
    ip: String,
    method: String,
    nb_api_calls: String,
    processing_time_ms: String,
    query_body: String,
    query_headers: String,
    query_nb_hits: String,
    query_params: String,
    sha1: String,
    timestamp: String,
    url: String
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], answer_code = answer_code.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], nb_api_calls = nb_api_calls.asInstanceOf[js.Any], processing_time_ms = processing_time_ms.asInstanceOf[js.Any], query_body = query_body.asInstanceOf[js.Any], query_headers = query_headers.asInstanceOf[js.Any], query_nb_hits = query_nb_hits.asInstanceOf[js.Any], query_params = query_params.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnswer_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNb_api_calls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_api_calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessing_time_ms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing_time_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_body(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_headers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_nb_hits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_nb_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExhaustive_faceting(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustive_faceting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExhaustive_faceting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustive_faceting")(js.undefined)
        ret
    }
    @scala.inline
    def withExhaustive_nb_hits(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustive_nb_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExhaustive_nb_hits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exhaustive_nb_hits")(js.undefined)
        ret
    }
  }
  
}

