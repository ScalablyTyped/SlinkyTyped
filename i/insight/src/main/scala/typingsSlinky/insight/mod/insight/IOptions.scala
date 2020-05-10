package typingsSlinky.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var config: js.UndefOr[IConfigstore] = js.native
  var packageName: js.UndefOr[String] = js.native
  var packageVersion: js.UndefOr[String] = js.native
  var pkg: js.UndefOr[IPackage] = js.native
  var trackingCode: String = js.native
  var trackingProvider: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply(trackingCode: String): IOptions = {
    val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: IConfigstore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPkg(value: IPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingProvider")(js.undefined)
        ret
    }
  }
  
}

