package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontConstructorOptionsBase extends js.Object {
  var ascender: Double = js.native
  var descender: Double = js.native
  var familyName: String = js.native
  var styleName: String = js.native
  var unitsPerEm: Double = js.native
}

object FontConstructorOptionsBase {
  @scala.inline
  def apply(ascender: Double, descender: Double, familyName: String, styleName: String, unitsPerEm: Double): FontConstructorOptionsBase = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptionsBase]
  }
  @scala.inline
  implicit class FontConstructorOptionsBaseOps[Self <: FontConstructorOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitsPerEm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitsPerEm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

