package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
  }
  
}

