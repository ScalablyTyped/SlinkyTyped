package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptionsCompression extends js.Object {
  var minBytes: Double = js.native
}

object ServerOptionsCompression {
  @scala.inline
  def apply(minBytes: Double): ServerOptionsCompression = {
    val __obj = js.Dynamic.literal(minBytes = minBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptionsCompression]
  }
  @scala.inline
  implicit class ServerOptionsCompressionOps[Self <: ServerOptionsCompression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

