package typingsSlinky.reactNativeElements.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.TooltipProps>> */
@js.native
trait RecursivePartialPartialTo extends js.Object {
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var highlightColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var onClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onOpen: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var overlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var pointerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var popover: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  var toggleOnPress: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var withOverlay: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var withPointer: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
}

object RecursivePartialPartialTo {
  @scala.inline
  def apply(): RecursivePartialPartialTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialTo]
  }
  @scala.inline
  implicit class RecursivePartialPartialToOps[Self <: RecursivePartialPartialTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withHighlightColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPopover(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOnPress(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnPress")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    @scala.inline
    def withWithOverlay(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withWithPointer(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPointer")(js.undefined)
        ret
    }
  }
  
}

