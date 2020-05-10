package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyListenerOutput extends js.Object {
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Listeners] = js.native
}

object ModifyListenerOutput {
  @scala.inline
  def apply(): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyListenerOutput]
  }
  @scala.inline
  implicit class ModifyListenerOutputOps[Self <: ModifyListenerOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListeners(value: Listeners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listeners")(js.undefined)
        ret
    }
  }
  
}

