package typingsSlinky.rabbitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCorrelationId extends js.Object {
  var correlationId: Double = js.native
}

object AnonCorrelationId {
  @scala.inline
  def apply(correlationId: Double): AnonCorrelationId = {
    val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorrelationId]
  }
  @scala.inline
  implicit class AnonCorrelationIdOps[Self <: AnonCorrelationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

