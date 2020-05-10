package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitoring extends js.Object {
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.native
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.native
}

object Monitoring {
  @scala.inline
  def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  @scala.inline
  implicit class MonitoringOps[Self <: Monitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerDestinations(value: js.Array[MonitoringDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerDestinations(value: js.Array[MonitoringDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerDestinations")(js.undefined)
        ret
    }
  }
  
}

