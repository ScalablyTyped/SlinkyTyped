package typingsSlinky.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ typingsSlinky.monacoEditor.mod.editor.IModelContentChangedEvent, 
    scala.Unit
  ]
  
  type DiffChangeHandler = typingsSlinky.reactMonacoEditor.typesMod.ChangeHandler
  
  type DiffEditorDidMount = js.Function2[
    /* editor */ typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor, 
    /* monaco */ typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit
  ]
  
  type DiffEditorWillMount = js.Function1[
    /* monaco */ typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit | typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
  ]
  
  type EditorConstructionOptions = typingsSlinky.std.NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-monaco-editor.anon.FnCall>[1] */ js.Any
  ]
  
  type EditorDidMount = js.Function2[
    /* editor */ typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor, 
    /* monaco */ typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit
  ]
  
  type EditorWillMount = js.Function1[
    /* monaco */ typingsSlinky.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit | typingsSlinky.reactMonacoEditor.typesMod.EditorConstructionOptions
  ]
}
