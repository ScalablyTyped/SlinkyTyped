package typingsSlinky.fastifyAccepts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyAcceptsOptions extends js.Object {
  var decorateReplyToo: js.UndefOr[Boolean] = js.native
}

object FastifyAcceptsOptions {
  @scala.inline
  def apply(): FastifyAcceptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyAcceptsOptions]
  }
  @scala.inline
  implicit class FastifyAcceptsOptionsOps[Self <: FastifyAcceptsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecorateReplyToo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateReplyToo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorateReplyToo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateReplyToo")(js.undefined)
        ret
    }
  }
  
}

