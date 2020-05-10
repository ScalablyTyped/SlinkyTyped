package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingStats extends js.Object {
  var URI: String = js.native
  var endpoint: String = js.native
  var systemKey: String = js.native
  var user: APIUser = js.native
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit = js.native
  def getOpenConnections(callback: CbCallback): Unit = js.native
}

object MessagingStats {
  @scala.inline
  def apply(
    URI: String,
    endpoint: String,
    getAveragePayloadSize: (String, Double, Double, CbCallback) => Unit,
    getCurrentSubscribers: (String, CbCallback) => Unit,
    getOpenConnections: CbCallback => Unit,
    systemKey: String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], getAveragePayloadSize = js.Any.fromFunction4(getAveragePayloadSize), getCurrentSubscribers = js.Any.fromFunction2(getCurrentSubscribers), getOpenConnections = js.Any.fromFunction1(getOpenConnections), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingStats]
  }
  @scala.inline
  implicit class MessagingStatsOps[Self <: MessagingStats] (val x: Self) extends AnyVal {
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
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAveragePayloadSize(value: (String, Double, Double, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAveragePayloadSize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetCurrentSubscribers(value: (String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSubscribers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetOpenConnections(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenConnections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
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

