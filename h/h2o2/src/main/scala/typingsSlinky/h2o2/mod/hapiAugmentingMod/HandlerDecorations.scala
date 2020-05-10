package typingsSlinky.h2o2.mod.hapiAugmentingMod

import typingsSlinky.h2o2.mod.ProxyHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerDecorations extends js.Object {
  /**
    * Proxies the request to an upstream endpoint.
    */
  var proxy: js.UndefOr[ProxyHandlerOptions] = js.native
}

object HandlerDecorations {
  @scala.inline
  def apply(): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerDecorations]
  }
  @scala.inline
  implicit class HandlerDecorationsOps[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxy(value: ProxyHandlerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

