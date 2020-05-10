package typingsSlinky.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectBinding extends Binding {
  @JSName("routingPattern")
  var routingPattern_DirectBinding: String = js.native
}

object DirectBinding {
  @scala.inline
  def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): DirectBinding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectBinding]
  }
  @scala.inline
  implicit class DirectBindingOps[Self <: DirectBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutingPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

