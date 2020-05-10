package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsIndicatorSymbolSize extends js.Object {
  /** Specifies the height of indicator symbol.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the width of indicator symbol.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.native
}

object CaptionSettingsIndicatorSymbolSize {
  @scala.inline
  def apply(): CaptionSettingsIndicatorSymbolSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
  }
  @scala.inline
  implicit class CaptionSettingsIndicatorSymbolSizeOps[Self <: CaptionSettingsIndicatorSymbolSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

