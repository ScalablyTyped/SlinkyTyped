package typingsSlinky.reactMce.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMce.mod.ReactMCEProps
import typingsSlinky.reactMce.mod.^
import typingsSlinky.tinymce.mod.Editor
import typingsSlinky.tinymce.mod.Settings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMce {
  
  @scala.inline
  def apply(config: Settings_): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMCEProps]))
  }
  
  @JSImport("react-mce", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def onAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onAddUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforeAddUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforeAddUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforeExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforeExecCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforeGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforeGetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforeRenderUI(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforeRenderUI", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforeSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforeSetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBeforepaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBeforepaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBlur(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClearUndos(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onClearUndos", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onContextmenu(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onContextmenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCopy(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onCopy", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCut(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onCut", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDblclick(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDblclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDeactivate(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDeactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDirty(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDirty", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDrag(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDragdrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDragdrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDragend(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDragend", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDraggesture(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDraggesture", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDragover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDragover", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDrop(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def onExecCommand(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onExecCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocus(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocusin(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onFocusin", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocusout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onFocusout", js.Any.fromFunction2(value))
    
    @scala.inline
    def onGetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onGetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHide(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def onInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeydown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onKeydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeypress(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onKeypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onKeyup", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLoadContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onLoadContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMousedown(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMousedown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseenter(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMouseenter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseleave(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMouseleave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMousemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMousemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseout(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseover(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseup(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onMouseup", js.Any.fromFunction2(value))
    
    @scala.inline
    def onNodeChange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onNodeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onObjectResizeStart(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onObjectResizeStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onObjectResized(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onObjectResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def onObjectSelected(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onObjectSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPaste(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onPaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPostProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onPostProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPostRender(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onPostRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPreInit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onPreInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPreProcess(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onPreProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def onProgressState(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onProgressState", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRedo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onRedo", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRemove(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def onReset(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onReset", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSaveContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onSaveContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelectionchange(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onSelectionchange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSetAttrib(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onSetAttrib", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSetContent(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onSetContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onShow(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSubmit(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def onUndo(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onUndo", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVisualAid(value: (/* event */ js.Any, /* editor */ Editor) => Unit): this.type = set("onVisualAid", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ReactMCEProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
