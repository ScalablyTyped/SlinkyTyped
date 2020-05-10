package typingsSlinky.cassandraDriver.metadataMod.metadata

import typingsSlinky.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientState extends js.Object {
  def getConnectedHosts(): js.Array[Host] = js.native
  def getInFlightQueries(host: Host): Double = js.native
  def getOpenConnections(host: Host): Double = js.native
}

object ClientState {
  @scala.inline
  def apply(
    getConnectedHosts: () => js.Array[Host],
    getInFlightQueries: Host => Double,
    getOpenConnections: Host => Double
  ): ClientState = {
    val __obj = js.Dynamic.literal(getConnectedHosts = js.Any.fromFunction0(getConnectedHosts), getInFlightQueries = js.Any.fromFunction1(getInFlightQueries), getOpenConnections = js.Any.fromFunction1(getOpenConnections))
    __obj.asInstanceOf[ClientState]
  }
  @scala.inline
  implicit class ClientStateOps[Self <: ClientState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnectedHosts(value: () => js.Array[Host]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectedHosts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInFlightQueries(value: Host => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInFlightQueries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOpenConnections(value: Host => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenConnections")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

