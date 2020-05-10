package typingsSlinky.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectConfig extends js.Object {
  var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.native
}

object ConnectConfig {
  @scala.inline
  def apply(): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfig]
  }
  @scala.inline
  implicit class ConnectConfigOps[Self <: ConnectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialConnectionHeaders(value: InitialConnectionHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialConnectionHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialConnectionHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialConnectionHeaders")(js.undefined)
        ret
    }
  }
  
}

