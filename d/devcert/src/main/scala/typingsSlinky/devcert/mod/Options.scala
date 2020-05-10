package typingsSlinky.devcert.mod

import typingsSlinky.devcert.userInterfaceMod.UserInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Return the CA certificate data? */
  var getCaBuffer: js.UndefOr[Boolean] = js.native
  /** Return the path to the CA certificate? */
  var getCaPath: js.UndefOr[Boolean] = js.native
  /** If `certutil` is not installed already (for updating nss databases; e.g. firefox), do not attempt to install it */
  var skipCertutilInstall: js.UndefOr[Boolean] = js.native
  /** Do not update your systems host file with the domain name of the certificate */
  var skipHostsFile: js.UndefOr[Boolean] = js.native
  /** User interface hooks */
  var ui: js.UndefOr[UserInterface] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCaBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCaBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCaPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCertutilInstall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCertutilInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCertutilInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCertutilInstall")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHostsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHostsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHostsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHostsFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: UserInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
  }
  
}

