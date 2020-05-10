package typingsSlinky.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopSetup extends js.Object {
  var busytone: js.UndefOr[String] = js.native
}

object StopSetup {
  @scala.inline
  def apply(): StopSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopSetup]
  }
  @scala.inline
  implicit class StopSetupOps[Self <: StopSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusytone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busytone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusytone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busytone")(js.undefined)
        ret
    }
  }
  
}

