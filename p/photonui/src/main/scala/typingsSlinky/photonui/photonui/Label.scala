package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends Widget {
  var forInput: Field | CheckBox = js.native
  var forInputName: String = js.native
  var text: String = js.native
  var textAlign: String = js.native
}

object Label {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    forInput: Field | CheckBox,
    forInputName: String,
    hide: () => Unit,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    text: String,
    textAlign: String,
    tooltip: String,
    unparent: () => Unit,
    visible: Boolean
  ): Label = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), forInput = forInput.asInstanceOf[js.Any], forInputName = forInputName.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForInput(value: Field | CheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forInputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

