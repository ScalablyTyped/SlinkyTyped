package typingsSlinky.reactMonacoEditor

import typingsSlinky.reactMonacoEditor.anon.DefaultValue
import typingsSlinky.reactMonacoEditor.anon.EditorDidMount
import typingsSlinky.reactMonacoEditor.anon.EditorWillMount
import typingsSlinky.reactMonacoEditor.anon.Height
import typingsSlinky.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import typingsSlinky.reactMonacoEditor.typesMod.MonacoEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-monaco-editor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MonacoDiffEditor protected ()
    extends typingsSlinky.reactMonacoEditor.diffMod.default {
    def this(props: MonacoDiffEditorProps) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.reactMonacoEditor.editorMod.default {
    def this(props: MonacoEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object MonacoDiffEditor extends js.Object {
    var defaultProps: EditorDidMount = js.native
    var propTypes: DefaultValue = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Height = js.native
    var propTypes: EditorWillMount = js.native
  }
  
}

