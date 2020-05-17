package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaField extends Field {
  var cols: Double = js.native
  var rows: Double = js.native
}

object TextAreaField {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    cols: Double,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    placeholder: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    rows: Double,
    show: () => Unit,
    tooltip: String,
    unparent: () => Unit,
    value: Boolean,
    visible: Boolean
  ): TextAreaField = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), cols = cols.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), rows = rows.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaField]
  }
  @scala.inline
  implicit class TextAreaFieldOps[Self <: TextAreaField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

