package typingsSlinky.antDesignIcons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignIcons.AnonPrimaryColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelperRenderOptions extends js.Object {
  var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.native
  var placeholders: js.UndefOr[AnonPrimaryColor] = js.native
}

object HelperRenderOptions {
  @scala.inline
  def apply(): HelperRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperRenderOptions]
  }
  @scala.inline
  implicit class HelperRenderOptionsOps[Self <: HelperRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraSVGAttrs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraSVGAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraSVGAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraSVGAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholders(value: AnonPrimaryColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(js.undefined)
        ret
    }
  }
  
}

