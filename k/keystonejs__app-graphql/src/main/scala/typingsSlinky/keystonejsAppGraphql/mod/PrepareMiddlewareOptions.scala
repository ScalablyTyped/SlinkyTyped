package typingsSlinky.keystonejsAppGraphql.mod

import typingsSlinky.keystonejsKeystone.mod.Keystone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrepareMiddlewareOptions extends js.Object {
  var dev: js.UndefOr[Boolean] = js.native
  var keystone: Keystone[String] = js.native
}

object PrepareMiddlewareOptions {
  @scala.inline
  def apply(keystone: Keystone[String]): PrepareMiddlewareOptions = {
    val __obj = js.Dynamic.literal(keystone = keystone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareMiddlewareOptions]
  }
  @scala.inline
  implicit class PrepareMiddlewareOptionsOps[Self <: PrepareMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeystone(value: Keystone[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
  }
  
}

