package typingsSlinky.favicons

import typingsSlinky.favicons.mod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  android  :boolean | favicons.favicons.IconOptions,   appleIcon  :boolean | favicons.favicons.IconOptions,   appleStartup  :boolean | favicons.favicons.IconOptions,   coast  :boolean | favicons.favicons.IconOptions,   favicons  :boolean | favicons.favicons.IconOptions,   firefox  :boolean | favicons.favicons.IconOptions,   windows  :boolean | favicons.favicons.IconOptions,   yandex  :boolean | favicons.favicons.IconOptions}> */
@js.native
trait PartialandroidbooleanIcon extends js.Object {
  var android: js.UndefOr[Boolean | IconOptions] = js.native
  var appleIcon: js.UndefOr[Boolean | IconOptions] = js.native
  var appleStartup: js.UndefOr[Boolean | IconOptions] = js.native
  var coast: js.UndefOr[Boolean | IconOptions] = js.native
  var favicons: js.UndefOr[Boolean | IconOptions] = js.native
  var firefox: js.UndefOr[Boolean | IconOptions] = js.native
  var windows: js.UndefOr[Boolean | IconOptions] = js.native
  var yandex: js.UndefOr[Boolean | IconOptions] = js.native
}

object PartialandroidbooleanIcon {
  @scala.inline
  def apply(): PartialandroidbooleanIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialandroidbooleanIcon]
  }
  @scala.inline
  implicit class PartialandroidbooleanIconOps[Self <: PartialandroidbooleanIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleIcon(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleStartup(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleStartup")(js.undefined)
        ret
    }
    @scala.inline
    def withCoast(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coast")(js.undefined)
        ret
    }
    @scala.inline
    def withFavicons(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavicons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicons")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(js.undefined)
        ret
    }
    @scala.inline
    def withWindows(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.undefined)
        ret
    }
    @scala.inline
    def withYandex(value: Boolean | IconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYandex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandex")(js.undefined)
        ret
    }
  }
  
}

