package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object editor {
  
  type ComputedEditorOptionValue[T /* <: typingsSlinky.monacoEditor.mod.editor.IEditorOption[_, _] */] = js.Any
  
  type FindComputedEditorOptionValueById[T /* <: typingsSlinky.monacoEditor.mod.editor.EditorOption */] = typingsSlinky.std.NonNullable[
    typingsSlinky.monacoEditor.mod.editor.ComputedEditorOptionValue[
      /* import warning: importer.ImportType#apply Failed type conversion: monaco-editor.monaco-editor.editor.EditorOptionsType[monaco-editor.monaco-editor.editor.FindEditorOptionsKeyById<T>] */ js.Any
    ]
  ]
  
  type FindEditorOptionsKeyById[T /* <: typingsSlinky.monacoEditor.mod.editor.EditorOption */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof monaco-editor.monaco-editor.editor.EditorOptionsType ]: monaco-editor.monaco-editor.editor.EditorOptionsType[K]['id'] extends T? K : never}[keyof monaco-editor.monaco-editor.editor.EditorOptionsType] */ js.Any
  
  type IColors = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ICommandHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[typingsSlinky.monacoEditor.mod.editor.IIdentifiedSingleEditOperation], 
    js.Array[typingsSlinky.monacoEditor.mod.Selection] | scala.Null
  ]
  
  type IEditorOverrideServices = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type IModel = typingsSlinky.monacoEditor.mod.editor.ITextModel
  
  type IReadOnlyModel = typingsSlinky.monacoEditor.mod.editor.ITextModel
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.monacoEditor.monacoEditorStrings.on
    - typingsSlinky.monacoEditor.monacoEditorStrings.off
    - typingsSlinky.monacoEditor.monacoEditorStrings.relative
    - typingsSlinky.monacoEditor.monacoEditorStrings.interval
    - js.Function1[/ * lineNumber * / scala.Double, java.lang.String]
  */
  type LineNumbersType = typingsSlinky.monacoEditor.mod.editor._LineNumbersType | (js.Function1[/* lineNumber */ scala.Double, java.lang.String])
  
  type ValidQuickSuggestionsOptions = scala.Boolean | typingsSlinky.monacoEditor.anon.ReadonlyRequiredIQuickSug
}
