package typingsSlinky.reactNativeZssRichTextEditor.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps> */
@js.native
trait RichTextToolbarProps extends js.Object {
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.native
  var iconMap: js.UndefOr[IconsMap] = js.native
  var iconTint: js.UndefOr[String] = js.native
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.native
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.native
  var renderAction: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.native
  var selectedIconTint: js.UndefOr[String] = js.native
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.native
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor = js.native
}

object RichTextToolbarProps {
  @scala.inline
  def apply(getEditor: () => RichTextEditor): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction0(getEditor))
    __obj.asInstanceOf[RichTextToolbarProps]
  }
  @scala.inline
  implicit class RichTextToolbarPropsOps[Self <: RichTextToolbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEditor(value: () => RichTextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActions(value: js.Array[ACTIONS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withIconMap(value: IconsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIconTint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTint")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressAddImage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressAddImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressAddLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressAddLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddLink")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAction(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedButtonStyle(value: ElementStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedIconTint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconTint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIconTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconTint")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedButtonStyle(value: ElementStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedButtonStyle")(null)
        ret
    }
  }
  
}

