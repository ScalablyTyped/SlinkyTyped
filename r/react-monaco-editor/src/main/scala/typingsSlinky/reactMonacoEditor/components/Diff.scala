package typingsSlinky.reactMonacoEditor.components

import typingsSlinky.reactMonacoEditor.diffMod.default
import typingsSlinky.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diff {
  
  @JSImport("react-monaco-editor/lib/diff", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Diff.type): SharedBuilder_MonacoDiffEditorProps_2135082855[default] = new SharedBuilder_MonacoDiffEditorProps_2135082855[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MonacoDiffEditorProps): SharedBuilder_MonacoDiffEditorProps_2135082855[default] = new SharedBuilder_MonacoDiffEditorProps_2135082855[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
