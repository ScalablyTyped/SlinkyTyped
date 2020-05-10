package typingsSlinky.jupyterlabTooltip.widgetMod.Tooltip

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for a tooltip widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The anchor widget that the tooltip widget tracks.
    */
  var anchor: Widget = js.native
  /**
    * The data that populates the tooltip widget.
    */
  var bundle: JSONObject = js.native
  /**
    * The editor referent of the tooltip model.
    */
  var editor: IEditor = js.native
  /**
    * The rendermime instance used by the tooltip model.
    */
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, bundle: JSONObject, editor: IEditor, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundle(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

