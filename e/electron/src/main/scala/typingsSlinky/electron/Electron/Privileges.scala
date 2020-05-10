package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Privileges extends js.Object {
  /**
    * Default false.
    */
  var allowServiceWorkers: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var bypassCSP: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var corsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var standard: js.UndefOr[Boolean] = js.native
  /**
    * Default false.
    */
  var supportFetchAPI: js.UndefOr[Boolean] = js.native
}

object Privileges {
  @scala.inline
  def apply(): Privileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privileges]
  }
  @scala.inline
  implicit class PrivilegesOps[Self <: Privileges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowServiceWorkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowServiceWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowServiceWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowServiceWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withBypassCSP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassCSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassCSP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassCSP")(js.undefined)
        ret
    }
    @scala.inline
    def withCorsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportFetchAPI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFetchAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportFetchAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFetchAPI")(js.undefined)
        ret
    }
  }
  
}

