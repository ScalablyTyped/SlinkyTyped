package typingsSlinky.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataSize extends js.Object {
  var dataSize: Double = js.native
}

object AnonDataSize {
  @scala.inline
  def apply(dataSize: Double): AnonDataSize = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataSize]
  }
  @scala.inline
  implicit class AnonDataSizeOps[Self <: AnonDataSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

