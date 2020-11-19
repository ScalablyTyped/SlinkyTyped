package typingsSlinky.reactMonacoEditor.components

import typingsSlinky.reactMonacoEditor.editorMod.default
import typingsSlinky.reactMonacoEditor.typesMod.MonacoEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editor {
  
  @JSImport("react-monaco-editor/lib/editor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MonacoEditorProps): SharedBuilder_MonacoEditorProps1239749771[default] = new SharedBuilder_MonacoEditorProps1239749771[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Editor.type): SharedBuilder_MonacoEditorProps1239749771[default] = new SharedBuilder_MonacoEditorProps1239749771[default](js.Array(this.component, js.Dictionary.empty))()
}
