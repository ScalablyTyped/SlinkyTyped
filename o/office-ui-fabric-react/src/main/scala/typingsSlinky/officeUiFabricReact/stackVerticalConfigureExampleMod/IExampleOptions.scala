package typingsSlinky.officeUiFabricReact.stackVerticalConfigureExampleMod

import typingsSlinky.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExampleOptions extends js.Object {
  var autoHeight: Boolean = js.native
  var childrenGap: Double = js.native
  var disableShrink: Boolean = js.native
  var emptyChildren: js.Array[String] = js.native
  var hideEmptyChildren: Boolean = js.native
  var horizontalAlignment: js.UndefOr[Alignment] = js.native
  var numItems: Double = js.native
  var paddingBottom: Double = js.native
  var paddingLeft: Double = js.native
  var paddingRight: Double = js.native
  var paddingTop: Double = js.native
  var preventOverflow: Boolean = js.native
  var showBoxShadow: Boolean = js.native
  var stackHeight: Double = js.native
  var verticalAlignment: js.UndefOr[Alignment] = js.native
  var wrap: Boolean = js.native
}

object IExampleOptions {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    childrenGap: Double,
    disableShrink: Boolean,
    emptyChildren: js.Array[String],
    hideEmptyChildren: Boolean,
    numItems: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double,
    preventOverflow: Boolean,
    showBoxShadow: Boolean,
    stackHeight: Double,
    wrap: Boolean
  ): IExampleOptions = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], childrenGap = childrenGap.asInstanceOf[js.Any], disableShrink = disableShrink.asInstanceOf[js.Any], emptyChildren = emptyChildren.asInstanceOf[js.Any], hideEmptyChildren = hideEmptyChildren.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], preventOverflow = preventOverflow.asInstanceOf[js.Any], showBoxShadow = showBoxShadow.asInstanceOf[js.Any], stackHeight = stackHeight.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
  @scala.inline
  implicit class IExampleOptionsOps[Self <: IExampleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableShrink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideEmptyChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmptyChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBoxShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBoxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

