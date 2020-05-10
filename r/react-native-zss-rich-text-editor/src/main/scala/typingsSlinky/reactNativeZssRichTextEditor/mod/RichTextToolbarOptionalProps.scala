package typingsSlinky.reactNativeZssRichTextEditor.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextToolbarOptionalProps extends js.Object {
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS] = js.native
  var iconMap: IconsMap = js.native
  var iconTint: String = js.native
  var onPressAddImage: FunctionWithZeroArgs = js.native
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs = js.native
  var selectedButtonStyle: ElementStyles = js.native
  var selectedIconTint: String = js.native
  var unselectedButtonStyle: ElementStyles = js.native
  def renderAction(): TagMod[Any] = js.native
}

object RichTextToolbarOptionalProps {
  @scala.inline
  def apply(
    actions: js.Array[ACTIONS],
    iconMap: IconsMap,
    iconTint: String,
    onPressAddImage: () => Unit,
    onPressAddLink: () => Unit,
    renderAction: () => TagMod[Any],
    selectedIconTint: String
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], iconMap = iconMap.asInstanceOf[js.Any], iconTint = iconTint.asInstanceOf[js.Any], onPressAddImage = js.Any.fromFunction0(onPressAddImage), onPressAddLink = js.Any.fromFunction0(onPressAddLink), renderAction = js.Any.fromFunction0(renderAction), selectedIconTint = selectedIconTint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
  @scala.inline
  implicit class RichTextToolbarOptionalPropsOps[Self <: RichTextToolbarOptionalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ACTIONS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconMap(value: IconsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconTint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPressAddImage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPressAddLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressAddLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderAction(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectedIconTint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconTint")(value.asInstanceOf[js.Any])
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

