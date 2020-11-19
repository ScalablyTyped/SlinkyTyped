package typingsSlinky.reactMonacoEditor

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.reactMonacoEditor.anon.EditorWillMount
import typingsSlinky.reactMonacoEditor.anon.Height
import typingsSlinky.reactMonacoEditor.typesMod.MonacoEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor/lib/editor", JSImport.Namespace)
@js.native
object editorMod extends js.Object {
  
  @js.native
  trait MonacoEditor
    extends Component[MonacoEditorProps, js.Object, js.Any] {
    
    var __prevent_trigger_change_event: js.Any = js.native
    
    var _subscription: js.Any = js.native
    
    def assignRef(component: HTMLDivElement): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMonacoEditor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMonacoEditor(prevProps: MonacoEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMonacoEditor(): Unit = js.native
    
    var containerElement: js.Any = js.native
    
    def destroyMonaco(): Unit = js.native
    
    var editor: js.UndefOr[IStandaloneCodeEditor] = js.native
    
    def editorDidMount(editor: IStandaloneCodeEditor): Unit = js.native
    
    def editorWillMount(): IStandaloneEditorConstructionOptions = js.native
    
    def initMonaco(): Unit = js.native
  }
  
  @js.native
  class default protected () extends MonacoEditor {
    def this(props: MonacoEditorProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Height = js.native
    
    var propTypes: EditorWillMount = js.native
  }
}
