package typingsSlinky.firebaseMessaging

import typingsSlinky.std.ClientTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientQueryOptions extends js.Object {
  var includeReserved: js.UndefOr[Boolean] = js.native
  var includeUncontrolled: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[ClientTypes] = js.native
}

object ClientQueryOptions {
  @scala.inline
  def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  @scala.inline
  implicit class ClientQueryOptionsOps[Self <: ClientQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReserved")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUncontrolled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUncontrolled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUncontrolled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUncontrolled")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ClientTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

