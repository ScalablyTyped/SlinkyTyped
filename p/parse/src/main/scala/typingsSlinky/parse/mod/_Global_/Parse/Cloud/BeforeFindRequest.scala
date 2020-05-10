package typingsSlinky.parse.mod._Global_.Parse.Cloud

import typingsSlinky.parse.mod._Global_.Parse.Attributes
import typingsSlinky.parse.mod._Global_.Parse.Object
import typingsSlinky.parse.mod._Global_.Parse.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeFindRequest extends TriggerRequest {
  var count: Boolean = js.native
  var isGet: Boolean = js.native
  var query: Query[Object[Attributes]] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.native
}

object BeforeFindRequest {
  @scala.inline
  def apply(
    count: Boolean,
    headers: js.Any,
    ip: String,
    isGet: Boolean,
    log: js.Any,
    `object`: Object[Attributes],
    query: Query[Object[Attributes]],
    triggerName: String
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isGet = isGet.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeFindRequest]
  }
  @scala.inline
  implicit class BeforeFindRequestOps[Self <: BeforeFindRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Query[Object[Attributes]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
  }
  
}

