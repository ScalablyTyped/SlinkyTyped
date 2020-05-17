package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait HttpServer extends Http_ {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Request] = js.native
}

object HttpServer {
  @scala.inline
  def apply(): HttpServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpServer]
  }
  @scala.inline
  implicit class HttpServerOps[Self <: HttpServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHooks(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
  }
  
}

