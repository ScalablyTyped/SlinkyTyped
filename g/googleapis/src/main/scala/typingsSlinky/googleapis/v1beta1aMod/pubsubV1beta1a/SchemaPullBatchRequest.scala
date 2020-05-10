package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the PullBatch method.
  */
@js.native
trait SchemaPullBatchRequest extends js.Object {
  /**
    * The maximum number of PubsubEvents returned for this request. The Pub/Sub
    * system may return fewer than the number of events specified.
    */
  var maxEvents: js.UndefOr[Double] = js.native
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning no messages. The client may cancel the request if it does
    * not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The subscription from which messages should be pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaPullBatchRequest {
  @scala.inline
  def apply(): SchemaPullBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullBatchRequest]
  }
  @scala.inline
  implicit class SchemaPullBatchRequestOps[Self <: SchemaPullBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

