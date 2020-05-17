package typingsSlinky.rabbitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationId extends js.Object {
  var correlationId: Double = js.native
}

object CorrelationId {
  @scala.inline
  def apply(correlationId: Double): CorrelationId = {
    val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationId]
  }
  @scala.inline
  implicit class CorrelationIdOps[Self <: CorrelationId] (val x: Self) extends AnyVal {
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

