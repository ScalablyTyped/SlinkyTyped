package typingsSlinky.emotionCore.mod

import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalProps[Theme] extends js.Object {
  var styles: InterpolationWithTheme[Theme] = js.native
}

object GlobalProps {
  @scala.inline
  def apply[Theme](): GlobalProps[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalProps[Theme]]
  }
  @scala.inline
  implicit class GlobalPropsOps[Self[theme] <: GlobalProps[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withStylesFunction1(value: Theme => Interpolation[js.UndefOr[scala.Nothing]]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: InterpolationWithTheme[Theme]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesNull: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(null)
        ret
    }
  }
  
}

