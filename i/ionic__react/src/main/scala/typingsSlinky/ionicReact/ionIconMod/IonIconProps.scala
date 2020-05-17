package typingsSlinky.ionicReact.ionIconMod

import typingsSlinky.ionicReact.anon.Ios
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonIconProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var flipRtl: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Ios | String] = js.native
  var ios: js.UndefOr[Ios | String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var md: js.UndefOr[Ios | String] = js.native
  var mode: js.UndefOr[ios | md] = js.native
  var name: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object IonIconProps {
  @scala.inline
  def apply(): IonIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonIconProps]
  }
  @scala.inline
  implicit class IonIconPropsOps[Self <: IonIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipRtl")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Ios | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: Ios | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: Ios | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ios | md): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

