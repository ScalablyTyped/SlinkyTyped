package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def getCount(filter: QueryFilter, callback: CbCallback): Unit = js.native
  def getEventList(filter: QueryFilter, callback: CbCallback): Unit = js.native
  def getEventTotals(filter: QueryFilter, callback: CbCallback): Unit = js.native
  def getStorage(filter: QueryFilter, callback: CbCallback): Unit = js.native
  def getUserEvents(filter: QueryFilter, callback: CbCallback): Unit = js.native
}

object Analytics {
  @scala.inline
  def apply(
    URI: String,
    getCount: (QueryFilter, CbCallback) => Unit,
    getEventList: (QueryFilter, CbCallback) => Unit,
    getEventTotals: (QueryFilter, CbCallback) => Unit,
    getStorage: (QueryFilter, CbCallback) => Unit,
    getUserEvents: (QueryFilter, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Analytics = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], getCount = js.Any.fromFunction2(getCount), getEventList = js.Any.fromFunction2(getEventList), getEventTotals = js.Any.fromFunction2(getEventTotals), getStorage = js.Any.fromFunction2(getStorage), getUserEvents = js.Any.fromFunction2(getUserEvents), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics]
  }
  @scala.inline
  implicit class AnalyticsOps[Self <: Analytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCount(value: (QueryFilter, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetEventList(value: (QueryFilter, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetEventTotals(value: (QueryFilter, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventTotals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetStorage(value: (QueryFilter, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUserEvents(value: (QueryFilter, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

