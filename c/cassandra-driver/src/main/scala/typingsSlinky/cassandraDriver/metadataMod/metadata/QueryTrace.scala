package typingsSlinky.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.AnonActivity
import typingsSlinky.cassandraDriver.typesMod.types.InetAddress
import typingsSlinky.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTrace extends js.Object {
  var clientAddress: String = js.native
  var coordinator: InetAddress = js.native
  var duration: Double = js.native
  var events: js.Array[AnonActivity] = js.native
  var parameters: StringDictionary[js.Any] = js.native
  var requestType: String = js.native
  var startedAt: Double | Long = js.native
}

object QueryTrace {
  @scala.inline
  def apply(
    clientAddress: String,
    coordinator: InetAddress,
    duration: Double,
    events: js.Array[AnonActivity],
    parameters: StringDictionary[js.Any],
    requestType: String,
    startedAt: Double | Long
  ): QueryTrace = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], coordinator = coordinator.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTrace]
  }
  @scala.inline
  implicit class QueryTraceOps[Self <: QueryTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinator(value: InetAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[AnonActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedAt(value: Double | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

