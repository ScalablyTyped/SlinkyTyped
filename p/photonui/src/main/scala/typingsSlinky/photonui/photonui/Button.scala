package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends Widget {
  var appearance: String = js.native
   //  normal | flat
  var buttonColor: String = js.native
  var leftIcon: BaseIcon = js.native
  var leftIconName: String = js.native
  var leftIconVisible: Boolean = js.native
  var rightIcon: BaseIcon = js.native
  var rightIconName: String = js.native
  var rightIconVisible: Boolean = js.native
  var text: String = js.native
  var textVisible: Boolean = js.native
}

object Button {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    appearance: String,
    buttonColor: String,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    leftIcon: BaseIcon,
    leftIconName: String,
    leftIconVisible: Boolean,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    rightIcon: BaseIcon,
    rightIconName: String,
    rightIconVisible: Boolean,
    show: () => Unit,
    text: String,
    textVisible: Boolean,
    tooltip: String,
    unparent: () => Unit,
    visible: Boolean
  ): Button = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), appearance = appearance.asInstanceOf[js.Any], buttonColor = buttonColor.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], leftIcon = leftIcon.asInstanceOf[js.Any], leftIconName = leftIconName.asInstanceOf[js.Any], leftIconVisible = leftIconVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), rightIcon = rightIcon.asInstanceOf[js.Any], rightIconName = rightIconName.asInstanceOf[js.Any], rightIconVisible = rightIconVisible.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any], textVisible = textVisible.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIcon(value: BaseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIconVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIcon(value: BaseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIconVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

