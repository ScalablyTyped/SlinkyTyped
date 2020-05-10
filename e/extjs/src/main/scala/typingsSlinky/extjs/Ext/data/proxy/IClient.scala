package typingsSlinky.extjs.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClient extends IProxy {
  /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
}

object IClient {
  @scala.inline
  def apply(): IClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClient]
  }
  @scala.inline
  implicit class IClientOps[Self <: IClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
  }
  
}

