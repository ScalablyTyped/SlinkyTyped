package typingsSlinky.ganacheCore.mod.Ganache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerOptions extends IProviderOptions {
  var keepAliveTimeout: js.UndefOr[Double] = js.native
}

object IServerOptions {
  @scala.inline
  def apply(): IServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerOptions]
  }
  @scala.inline
  implicit class IServerOptionsOps[Self <: IServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepAliveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveTimeout")(js.undefined)
        ret
    }
  }
  
}

