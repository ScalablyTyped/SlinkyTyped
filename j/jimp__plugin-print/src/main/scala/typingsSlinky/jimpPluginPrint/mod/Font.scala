package typingsSlinky.jimpPluginPrint.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  var chars: StringDictionary[FontChar] = js.native
  var common: FontCommon = js.native
  var info: FontInfo = js.native
  var kernings: StringDictionary[StringDictionary[Double]] = js.native
  var pages: js.Array[String] = js.native
}

object Font {
  @scala.inline
  def apply(
    chars: StringDictionary[FontChar],
    common: FontCommon,
    info: FontInfo,
    kernings: StringDictionary[StringDictionary[Double]],
    pages: js.Array[String]
  ): Font = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kernings = kernings.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChars(value: StringDictionary[FontChar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon(value: FontCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: FontInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernings(value: StringDictionary[StringDictionary[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

