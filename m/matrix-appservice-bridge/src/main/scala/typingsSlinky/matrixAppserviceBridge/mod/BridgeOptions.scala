package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeOptions extends js.Object {
  var controller: Controller = js.native
  var domain: String = js.native
  var homeserverUrl: String = js.native
  var registration: AppServiceRegistration = js.native
  var suppressEcho: js.UndefOr[Boolean] = js.native
}

object BridgeOptions {
  @scala.inline
  def apply(
    controller: Controller,
    domain: String,
    homeserverUrl: String,
    registration: AppServiceRegistration
  ): BridgeOptions = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeOptions]
  }
  @scala.inline
  implicit class BridgeOptionsOps[Self <: BridgeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: Controller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeserverUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeserverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistration(value: AppServiceRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressEcho(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressEcho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressEcho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressEcho")(js.undefined)
        ret
    }
  }
  
}

