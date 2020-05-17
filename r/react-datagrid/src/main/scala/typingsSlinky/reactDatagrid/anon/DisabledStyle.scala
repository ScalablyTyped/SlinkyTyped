package typingsSlinky.reactDatagrid.anon

import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledStyle extends js.Object {
  var disabledStyle: SVGAttributes[js.Object] = js.native
  var overStyle: SVGAttributes[js.Object] = js.native
  var style: SVGAttributes[js.Object] = js.native
}

object DisabledStyle {
  @scala.inline
  def apply(
    disabledStyle: SVGAttributes[js.Object],
    overStyle: SVGAttributes[js.Object],
    style: SVGAttributes[js.Object]
  ): DisabledStyle = {
    val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], overStyle = overStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStyle]
  }
  @scala.inline
  implicit class DisabledStyleOps[Self <: DisabledStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledStyle(value: SVGAttributes[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverStyle(value: SVGAttributes[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: SVGAttributes[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

