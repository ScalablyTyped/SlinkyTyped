package typingsSlinky.createEmotion.mod._Global_.JSX

import typingsSlinky.createEmotion.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributes extends js.Object {
  var css: js.UndefOr[Interpolation] = js.native
}

object HTMLAttributes {
  @scala.inline
  def apply(): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes]
  }
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: Interpolation): Self = {
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

