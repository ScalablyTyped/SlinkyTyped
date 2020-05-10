package typingsSlinky.officeUiFabricReact.marqueeSelectionTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionStyles extends js.Object {
  var box: js.UndefOr[IStyle] = js.native
  var boxFill: js.UndefOr[IStyle] = js.native
  var dragMask: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
}

object IMarqueeSelectionStyles {
  @scala.inline
  def apply(): IMarqueeSelectionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarqueeSelectionStyles]
  }
  @scala.inline
  implicit class IMarqueeSelectionStylesOps[Self <: IMarqueeSelectionStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBox(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(null)
        ret
    }
    @scala.inline
    def withBoxFill(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFill")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxFillNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFill")(null)
        ret
    }
    @scala.inline
    def withDragMask(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMask")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMask")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

