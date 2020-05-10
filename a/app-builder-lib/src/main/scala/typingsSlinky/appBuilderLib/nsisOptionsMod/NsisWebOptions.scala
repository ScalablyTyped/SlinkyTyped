package typingsSlinky.appBuilderLib.nsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NsisWebOptions extends NsisOptions {
  /**
    * The application package download URL. Optional — by default computed using publish configuration.
    *
    * URL like `https://example.com/download/latest` allows web installer to be version independent (installer will download latest application package).
    * Please note — it is [full URL](https://github.com/electron-userland/electron-builder/issues/1810#issuecomment-317650878).
    *
    * Custom `X-Arch` http header is set to `32` or `64`.
    */
  val appPackageUrl: js.UndefOr[String | Null] = js.native
}

object NsisWebOptions {
  @scala.inline
  def apply(): NsisWebOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NsisWebOptions]
  }
  @scala.inline
  implicit class NsisWebOptionsOps[Self <: NsisWebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppPackageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppPackageUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageUrl")(null)
        ret
    }
  }
  
}

