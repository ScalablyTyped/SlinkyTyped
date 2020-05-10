package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  var blue: StatusColor = js.native
  var cloud: CloudColor = js.native
  var green: StatusColor = js.native
  var ink: InkColor = js.native
  var orange: StatusColor = js.native
  var product: ProductColor = js.native
  var red: StatusColor = js.native
  var social: SocialColor = js.native
  var white: WhiteColor = js.native
}

object Palette {
  @scala.inline
  def apply(
    blue: StatusColor,
    cloud: CloudColor,
    green: StatusColor,
    ink: InkColor,
    orange: StatusColor,
    product: ProductColor,
    red: StatusColor,
    social: SocialColor,
    white: WhiteColor
  ): Palette = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], ink = ink.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[Palette]
  }
  @scala.inline
  implicit class PaletteOps[Self <: Palette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: StatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloud(value: CloudColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: StatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInk(value: InkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrange(value: StatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: ProductColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: StatusColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial(value: SocialColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhite(value: WhiteColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

