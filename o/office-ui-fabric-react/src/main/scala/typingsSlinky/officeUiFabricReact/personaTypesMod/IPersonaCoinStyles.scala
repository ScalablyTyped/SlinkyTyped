package typingsSlinky.officeUiFabricReact.personaTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaCoinStyles extends js.Object {
  var coin: IStyle = js.native
  var image: IStyle = js.native
  var imageArea: IStyle = js.native
  var initials: IStyle = js.native
  var size10WithoutPresenceIcon: IStyle = js.native
}

object IPersonaCoinStyles {
  @scala.inline
  def apply(): IPersonaCoinStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaCoinStyles]
  }
  @scala.inline
  implicit class IPersonaCoinStylesOps[Self <: IPersonaCoinStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoin(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coin")(js.undefined)
        ret
    }
    @scala.inline
    def withCoinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coin")(null)
        ret
    }
    @scala.inline
    def withImage(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(null)
        ret
    }
    @scala.inline
    def withImageArea(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageArea")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAreaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageArea")(null)
        ret
    }
    @scala.inline
    def withInitials(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(null)
        ret
    }
    @scala.inline
    def withSize10WithoutPresenceIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size10WithoutPresenceIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize10WithoutPresenceIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size10WithoutPresenceIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSize10WithoutPresenceIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size10WithoutPresenceIcon")(null)
        ret
    }
  }
  
}

