package typingsSlinky.reactNativeVectorIcons

import typingsSlinky.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`0`
import typingsSlinky.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`1`
import typingsSlinky.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`2`
import typingsSlinky.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrand extends js.Object {
  var brand: `3` = js.native
  var light: `1` = js.native
  var regular: `0` = js.native
  var solid: `2` = js.native
}

object AnonBrand {
  @scala.inline
  def apply(brand: `3`, light: `1`, regular: `0`, solid: `2`): AnonBrand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrand]
  }
  @scala.inline
  implicit class AnonBrandOps[Self <: AnonBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegular(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolid(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

