package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsBinary extends js.Object {
  var isBinary: Boolean = js.native
}

object AnonIsBinary {
  @scala.inline
  def apply(isBinary: Boolean): AnonIsBinary = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsBinary]
  }
  @scala.inline
  implicit class AnonIsBinaryOps[Self <: AnonIsBinary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

