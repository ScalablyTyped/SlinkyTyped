package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanInsideOptions extends js.Object {
  var padding: js.UndefOr[PointExpression] = js.native
  var paddingBottomRight: js.UndefOr[PointExpression] = js.native
  var paddingTopLeft: js.UndefOr[PointExpression] = js.native
}

object PanInsideOptions {
  @scala.inline
  def apply(): PanInsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInsideOptions]
  }
  @scala.inline
  implicit class PanInsideOptionsOps[Self <: PanInsideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottomRight(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopLeft(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopLeft")(js.undefined)
        ret
    }
  }
  
}

