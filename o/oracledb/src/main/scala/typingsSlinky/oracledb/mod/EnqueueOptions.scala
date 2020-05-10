package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to use when enqueuing messages. Attributes can be set before each queue.enqOne() or queue.enqMany().
  */
@js.native
trait EnqueueOptions extends js.Object {
  /** Celivery mode when enqueuing messages. It can be any one of the AQ_MSG_DELIV constants. */
  var deliveryMode: Double = js.native
  /** Transformation that will take place on messages when they are enqueued. */
  var transformation: String = js.native
  /** Defines whether the enqueue occurs in the current transaction or as a separate transaction. It can be any one of the AQ_VISIBILITY constants. */
  var visibility: Double = js.native
}

object EnqueueOptions {
  @scala.inline
  def apply(deliveryMode: Double, transformation: String, visibility: Double): EnqueueOptions = {
    val __obj = js.Dynamic.literal(deliveryMode = deliveryMode.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueueOptions]
  }
  @scala.inline
  implicit class EnqueueOptionsOps[Self <: EnqueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

