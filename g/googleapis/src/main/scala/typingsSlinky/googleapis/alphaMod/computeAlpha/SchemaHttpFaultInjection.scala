package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for fault injection introduced into traffic to test the
  * resiliency of clients to backend service failure. As part of fault
  * injection, when clients send requests to a backend service, delays can be
  * introduced by Loadbalancer on a percentage of requests before sending those
  * request to the backend service. Similarly requests from clients can be
  * aborted by the Loadbalancer for a percentage of requests.
  */
@js.native
trait SchemaHttpFaultInjection extends js.Object {
  /**
    * The specification for how client requests are aborted as part of fault
    * injection.
    */
  var abort: js.UndefOr[SchemaHttpFaultAbort] = js.native
  /**
    * The specification for how client requests are delayed as part of fault
    * injection, before being sent to a backend service.
    */
  var delay: js.UndefOr[SchemaHttpFaultDelay] = js.native
}

object SchemaHttpFaultInjection {
  @scala.inline
  def apply(): SchemaHttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultInjection]
  }
  @scala.inline
  implicit class SchemaHttpFaultInjectionOps[Self <: SchemaHttpFaultInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: SchemaHttpFaultAbort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: SchemaHttpFaultDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
  }
  
}

