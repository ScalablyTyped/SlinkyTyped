package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDwValidFlagsMask extends js.Object {
  val dwValidFlagsMask: Double = js.native
  val dwWindowStateFlags: Double = js.native
}

object AnonDwValidFlagsMask {
  @scala.inline
  def apply(dwValidFlagsMask: Double, dwWindowStateFlags: Double): AnonDwValidFlagsMask = {
    val __obj = js.Dynamic.literal(dwValidFlagsMask = dwValidFlagsMask.asInstanceOf[js.Any], dwWindowStateFlags = dwWindowStateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDwValidFlagsMask]
  }
  @scala.inline
  implicit class AnonDwValidFlagsMaskOps[Self <: AnonDwValidFlagsMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDwValidFlagsMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwValidFlagsMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwWindowStateFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwWindowStateFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

