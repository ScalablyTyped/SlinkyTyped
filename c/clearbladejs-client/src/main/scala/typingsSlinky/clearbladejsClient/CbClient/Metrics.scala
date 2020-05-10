package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var user: APIUser = js.native
  def getDBConnections(callback: CbCallback): Unit = js.native
  def getLogs(callback: CbCallback): Unit = js.native
  def getStatistics(callback: CbCallback): Unit = js.native
  def getStatisticsHistory(callback: CbCallback): Unit = js.native
  def setQuery(query: Query): Unit = js.native
}

object Metrics {
  @scala.inline
  def apply(
    URI: String,
    getDBConnections: CbCallback => Unit,
    getLogs: CbCallback => Unit,
    getStatistics: CbCallback => Unit,
    getStatisticsHistory: CbCallback => Unit,
    setQuery: Query => Unit,
    systemKey: String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], getDBConnections = js.Any.fromFunction1(getDBConnections), getLogs = js.Any.fromFunction1(getLogs), getStatistics = js.Any.fromFunction1(getStatistics), getStatisticsHistory = js.Any.fromFunction1(getStatisticsHistory), setQuery = js.Any.fromFunction1(setQuery), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
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
    def withGetDBConnections(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDBConnections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLogs(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLogs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStatistics(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatistics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStatisticsHistory(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatisticsHistory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQuery(value: Query => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuery")(js.Any.fromFunction1(value))
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

