package typingsSlinky.officeUiFabricReact.modalTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStyles extends js.Object {
  var keyboardMoveIcon: IStyle = js.native
  var keyboardMoveIconContainer: IStyle = js.native
  var layer: IStyle = js.native
  var main: IStyle = js.native
  var root: IStyle = js.native
  var scrollableContent: IStyle = js.native
}

object IModalStyles {
  @scala.inline
  def apply(): IModalStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalStyles]
  }
  @scala.inline
  implicit class IModalStylesOps[Self <: IModalStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardMoveIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardMoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardMoveIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIcon")(null)
        ret
    }
    @scala.inline
    def withKeyboardMoveIconContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIconContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardMoveIconContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIconContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardMoveIconContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardMoveIconContainer")(null)
        ret
    }
    @scala.inline
    def withLayer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(null)
        ret
    }
    @scala.inline
    def withMain(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
    @scala.inline
    def withMainNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(null)
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
    @scala.inline
    def withScrollableContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableContent")(null)
        ret
    }
  }
  
}

