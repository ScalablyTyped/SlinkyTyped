package typingsSlinky.reactCodemirror.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.codemirror.mod.Editor
import typingsSlinky.codemirror.mod.EditorChange
import typingsSlinky.codemirror.mod.EditorConfiguration
import typingsSlinky.codemirror.mod.ScrollInfo
import typingsSlinky.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import typingsSlinky.reactCodemirror.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCodemirror {
  
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: Boolean): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def codeMirrorInstance(value: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor): this.type = set("codeMirrorInstance", js.Any.fromFunction2(value))
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* newValue */ String, /* change */ EditorChange) => _): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCursorActivity(value: /* codemirror */ Editor => _): this.type = set("onCursorActivity", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusChange(value: /* focused */ Boolean => _): this.type = set("onFocusChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* scrollInfo */ ScrollInfo => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def options(value: EditorConfiguration): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserveScrollPosition(value: Boolean): this.type = set("preserveScrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactCodeMirrorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactCodemirror.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
