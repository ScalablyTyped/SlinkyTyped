package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinHeightNumber extends js.Object {
  var minHeight: Double = js.native
}

object MinHeightNumber {
  @scala.inline
  def apply(minHeight: Double): MinHeightNumber = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightNumber]
  }
  @scala.inline
  implicit class MinHeightNumberOps[Self <: MinHeightNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

