package typingsSlinky.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ typingsSlinky.monacoEditor.mod.editor.IModelContentChangedEvent, 
    scala.Unit
  ]
  type DiffChangeHandler = typingsSlinky.reactMonacoEditor.mod.ChangeHandler
  type DiffEditorDidMount = js.Function2[
    /* editor */ typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor, 
    /* monaco */ typingsSlinky.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[/* monaco */ typingsSlinky.reactMonacoEditor.TypeofmonacoEditor, scala.Unit]
  type EditorDidMount = js.Function2[
    /* editor */ typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor, 
    /* monaco */ typingsSlinky.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[
    /* monaco */ typingsSlinky.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit | typingsSlinky.monacoEditor.mod.editor.IEditorConstructionOptions
  ]
}
