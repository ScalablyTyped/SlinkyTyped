package typingsSlinky.reactMonacoEditor.components

import typingsSlinky.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonacoDiffEditor {
  
  @JSImport("react-monaco-editor", "MonacoDiffEditor")
  @js.native
  object component extends js.Object
  
  def withProps(p: MonacoDiffEditorProps): SharedBuilder_MonacoDiffEditorProps_2135082855[typingsSlinky.reactMonacoEditor.mod.MonacoDiffEditor] = new SharedBuilder_MonacoDiffEditorProps_2135082855[typingsSlinky.reactMonacoEditor.mod.MonacoDiffEditor](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MonacoDiffEditor.type): SharedBuilder_MonacoDiffEditorProps_2135082855[typingsSlinky.reactMonacoEditor.mod.MonacoDiffEditor] = new SharedBuilder_MonacoDiffEditorProps_2135082855[typingsSlinky.reactMonacoEditor.mod.MonacoDiffEditor](js.Array(this.component, js.Dictionary.empty))()
}
