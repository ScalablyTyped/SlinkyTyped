package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.mod.DevExpress.viz.dxSankeyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalOffset extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.native
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  var horizontalOffset: js.UndefOr[Double] = js.native
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.native
  var shadow: js.UndefOr[Blur] = js.native
  var useNodeColors: js.UndefOr[Boolean] = js.native
  var verticalOffset: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object HorizontalOffset {
  @scala.inline
  def apply(): HorizontalOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalOffset]
  }
  @scala.inline
  implicit class HorizontalOffsetOps[Self <: HorizontalOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* itemInfo */ dxSankeyNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlappingBehavior(value: ellipsis | hide | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlappingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Blur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNodeColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNodeColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNodeColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNodeColors")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

