package typingsSlinky.jqueryCleditor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCLEditorButtonDefinitionEventData extends js.Object {
  var button: HTMLElement = js.native
  var buttonName: String = js.native
  var command: String = js.native
  var editor: CLEditor = js.native
  var popup: HTMLElement = js.native
  var popupName: String = js.native
  var useCSS: Boolean = js.native
  var value: js.Any = js.native
}

object JQueryCLEditorButtonDefinitionEventData {
  @scala.inline
  def apply(
    button: HTMLElement,
    buttonName: String,
    command: String,
    editor: CLEditor,
    popup: HTMLElement,
    popupName: String,
    useCSS: Boolean,
    value: js.Any
  ): JQueryCLEditorButtonDefinitionEventData = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonName = buttonName.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupName = popupName.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionEventDataOps[Self <: JQueryCLEditorButtonDefinitionEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: CLEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

