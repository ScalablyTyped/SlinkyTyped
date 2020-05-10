package typingsSlinky.engineIo.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachOptions extends js.Object {
  /**
  		 * destroy unhandled upgrade requests (true)
  		 */
  var destroyUpgrade: js.UndefOr[Boolean] = js.native
  /**
  		 * milliseconds after which unhandled requests are ended (1000)
  		 */
  var destroyUpgradeTimeout: js.UndefOr[Double] = js.native
  /**
  		 * whether to let engine.io handle the OPTIONS requests. You can also pass a custom function to handle the requests (true)
  		 */
  var handlePreflightRequest: js.UndefOr[
    Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
  ] = js.native
  /**
  		 * name of the path to capture (/engine.io).
  		 */
  var path: js.UndefOr[String] = js.native
}

object AttachOptions {
  @scala.inline
  def apply(): AttachOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachOptions]
  }
  @scala.inline
  implicit class AttachOptionsOps[Self <: AttachOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroyUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyUpgradeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyUpgradeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyUpgradeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyUpgradeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePreflightRequestFunction3(value: (/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandlePreflightRequest(
      value: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlePreflightRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePreflightRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

