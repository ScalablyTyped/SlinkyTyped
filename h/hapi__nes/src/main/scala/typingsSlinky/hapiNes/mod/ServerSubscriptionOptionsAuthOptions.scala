package typingsSlinky.hapiNes.mod

import typingsSlinky.hapiNes.hapiNesStrings.any
import typingsSlinky.hapiNes.hapiNesStrings.app
import typingsSlinky.hapiNes.hapiNesStrings.optional
import typingsSlinky.hapiNes.hapiNesStrings.required
import typingsSlinky.hapiNes.hapiNesStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSubscriptionOptionsAuthOptions extends js.Object {
  var entity: js.UndefOr[user | app | any] = js.native
  var index: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[required | optional] = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}

object ServerSubscriptionOptionsAuthOptions {
  @scala.inline
  def apply(): ServerSubscriptionOptionsAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
  }
  @scala.inline
  implicit class ServerSubscriptionOptionsAuthOptionsOps[Self <: ServerSubscriptionOptionsAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: user | app | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: required | optional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

