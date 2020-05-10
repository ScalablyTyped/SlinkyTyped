package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLoadIndicatorOptions extends WidgetOptions[dxLoadIndicator] {
  /** Specifies the path to an image used as the indicator. */
  var indicatorSrc: js.UndefOr[String] = js.native
}

object dxLoadIndicatorOptions {
  @scala.inline
  def apply(): dxLoadIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLoadIndicatorOptions]
  }
  @scala.inline
  implicit class dxLoadIndicatorOptionsOps[Self <: dxLoadIndicatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndicatorSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSrc")(js.undefined)
        ret
    }
  }
  
}

