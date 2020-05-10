package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBIF extends js.Object {
  var BIF: js.Array[String] = js.native
}

object AnonBIF {
  @scala.inline
  def apply(BIF: js.Array[String]): AnonBIF = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBIF]
  }
  @scala.inline
  implicit class AnonBIFOps[Self <: AnonBIF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBIF(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

