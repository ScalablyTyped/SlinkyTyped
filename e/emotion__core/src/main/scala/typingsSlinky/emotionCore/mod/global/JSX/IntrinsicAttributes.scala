package typingsSlinky.emotionCore.mod.global.JSX

import typingsSlinky.emotionCore.mod.InterpolationWithTheme
import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Do we need to modify `LibraryManagedAttributes` too,
  * to make `className` props optional when `css` props is specified?
  */
@js.native
trait IntrinsicAttributes extends js.Object {
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
}

object IntrinsicAttributes {
  @scala.inline
  def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  @scala.inline
  implicit class IntrinsicAttributesOps[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCss(value: InterpolationWithTheme[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCssNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(null)
        ret
    }
  }
  
}

