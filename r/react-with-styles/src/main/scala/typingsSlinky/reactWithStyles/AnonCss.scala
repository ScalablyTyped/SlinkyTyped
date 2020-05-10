package typingsSlinky.reactWithStyles

import typingsSlinky.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCss[TStyles /* <: Styles */] extends js.Object {
  var css: js.Function = js.native
  var styles: TStyles = js.native
}

object AnonCss {
  @scala.inline
  def apply[TStyles](css: js.Function, styles: TStyles): AnonCss[TStyles] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss[TStyles]]
  }
  @scala.inline
  implicit class AnonCssOps[Self[tstyles] <: AnonCss[tstyles], TStyles] (val x: Self[TStyles]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStyles] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStyles]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TStyles] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TStyles] with Other]
    @scala.inline
    def withCss(value: js.Function): Self[TStyles] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: TStyles): Self[TStyles] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

