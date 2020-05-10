package typingsSlinky.reactMce.mod

import typingsSlinky.tinymce.mod.Editor
import typingsSlinky.tinymce.mod.Settings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMCEProps extends js.Object {
  // Non-events
  var config: Settings_ = js.native
  var content: js.UndefOr[String] = js.native
  var onActivate: js.UndefOr[EventHandler] = js.native
  var onAddUndo: js.UndefOr[EventHandler] = js.native
  var onBeforeAddUndo: js.UndefOr[EventHandler] = js.native
  var onBeforeExecCommand: js.UndefOr[EventHandler] = js.native
  var onBeforeGetContent: js.UndefOr[EventHandler] = js.native
  var onBeforeRenderUI: js.UndefOr[EventHandler] = js.native
  var onBeforeSetContent: js.UndefOr[EventHandler] = js.native
  var onBeforepaste: js.UndefOr[EventHandler] = js.native
  var onBlur: js.UndefOr[EventHandler] = js.native
  var onChange: js.UndefOr[EventHandler] = js.native
  var onClearUndos: js.UndefOr[EventHandler] = js.native
  var onClick: js.UndefOr[EventHandler] = js.native
  var onContextmenu: js.UndefOr[EventHandler] = js.native
  var onCopy: js.UndefOr[EventHandler] = js.native
  var onCut: js.UndefOr[EventHandler] = js.native
  var onDblclick: js.UndefOr[EventHandler] = js.native
  var onDeactivate: js.UndefOr[EventHandler] = js.native
  var onDirty: js.UndefOr[EventHandler] = js.native
  var onDrag: js.UndefOr[EventHandler] = js.native
  var onDragdrop: js.UndefOr[EventHandler] = js.native
  var onDragend: js.UndefOr[EventHandler] = js.native
  var onDraggesture: js.UndefOr[EventHandler] = js.native
  var onDragover: js.UndefOr[EventHandler] = js.native
  var onDrop: js.UndefOr[EventHandler] = js.native
  var onExecCommand: js.UndefOr[EventHandler] = js.native
  var onFocus: js.UndefOr[EventHandler] = js.native
  // Events
  var onFocusin: js.UndefOr[EventHandler] = js.native
  var onFocusout: js.UndefOr[EventHandler] = js.native
  var onGetContent: js.UndefOr[EventHandler] = js.native
  var onHide: js.UndefOr[EventHandler] = js.native
  var onInit: js.UndefOr[EventHandler] = js.native
  var onKeydown: js.UndefOr[EventHandler] = js.native
  var onKeypress: js.UndefOr[EventHandler] = js.native
  var onKeyup: js.UndefOr[EventHandler] = js.native
  var onLoadContent: js.UndefOr[EventHandler] = js.native
  var onMousedown: js.UndefOr[EventHandler] = js.native
  var onMouseenter: js.UndefOr[EventHandler] = js.native
  var onMouseleave: js.UndefOr[EventHandler] = js.native
  var onMousemove: js.UndefOr[EventHandler] = js.native
  var onMouseout: js.UndefOr[EventHandler] = js.native
  var onMouseover: js.UndefOr[EventHandler] = js.native
  var onMouseup: js.UndefOr[EventHandler] = js.native
  var onNodeChange: js.UndefOr[EventHandler] = js.native
  var onObjectResizeStart: js.UndefOr[EventHandler] = js.native
  var onObjectResized: js.UndefOr[EventHandler] = js.native
  var onObjectSelected: js.UndefOr[EventHandler] = js.native
  var onPaste: js.UndefOr[EventHandler] = js.native
  var onPostProcess: js.UndefOr[EventHandler] = js.native
  var onPostRender: js.UndefOr[EventHandler] = js.native
  var onPreInit: js.UndefOr[EventHandler] = js.native
  var onPreProcess: js.UndefOr[EventHandler] = js.native
  var onProgressState: js.UndefOr[EventHandler] = js.native
  var onRedo: js.UndefOr[EventHandler] = js.native
  var onRemove: js.UndefOr[EventHandler] = js.native
  var onReset: js.UndefOr[EventHandler] = js.native
  var onSaveContent: js.UndefOr[EventHandler] = js.native
  var onSelectionchange: js.UndefOr[EventHandler] = js.native
  var onSetAttrib: js.UndefOr[EventHandler] = js.native
  var onSetContent: js.UndefOr[EventHandler] = js.native
  var onShow: js.UndefOr[EventHandler] = js.native
  var onSubmit: js.UndefOr[EventHandler] = js.native
  var onUndo: js.UndefOr[EventHandler] = js.native
  var onVisualAid: js.UndefOr[EventHandler] = js.native
}

object ReactMCEProps {
  @scala.inline
  def apply(config: Settings_): ReactMCEProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMCEProps]
  }
  @scala.inline
  implicit class ReactMCEPropsOps[Self <: ReactMCEProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Settings_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddUndo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAddUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeAddUndo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeAddUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeAddUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeExecCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeExecCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeExecCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeGetContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeGetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeGetContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeRenderUI(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRenderUI")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeRenderUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRenderUI")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSetContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeSetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSetContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforepaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforepaste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforepaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforepaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClearUndos(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearUndos")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClearUndos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearUndos")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextmenu(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextmenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblclick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDirty(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragdrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragdrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragend(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDraggesture(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraggesture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDraggesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraggesture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExecCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusin(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocusin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocusout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnGetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeydown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeypress(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLoadContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousedown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseenter(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseenter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseleave(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseleave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectResizeStart(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectResizeStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectResized(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectSelected(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onObjectSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostRender(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPostRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPreInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPreProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressState(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnProgressState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRedo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSaveContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaveContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSaveContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaveContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionchange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionchange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetAttrib(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSetAttrib")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSetAttrib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSetAttrib")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSetContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSetContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUndo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisualAid(value: (/* event */ js.Any, /* editor */ Editor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisualAid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnVisualAid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisualAid")(js.undefined)
        ret
    }
  }
  
}

