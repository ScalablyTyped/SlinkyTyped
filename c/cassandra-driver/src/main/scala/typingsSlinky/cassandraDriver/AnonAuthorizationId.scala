package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizationId extends js.Object {
  var authorizationId: js.UndefOr[String] = js.native
  var hostNameResolver: js.UndefOr[js.Function] = js.native
  var service: js.UndefOr[String] = js.native
}

object AnonAuthorizationId {
  @scala.inline
  def apply(): AnonAuthorizationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuthorizationId]
  }
  @scala.inline
  implicit class AnonAuthorizationIdOps[Self <: AnonAuthorizationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostNameResolver(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNameResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostNameResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNameResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

