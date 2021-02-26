package typingsSlinky.monacoEditor.mod

import org.scalablytyped.runtime.StObject
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
    /* inverseEditOperations */ js.Array[typingsSlinky.monacoEditor.mod.editor.IValidEditOperation], 
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
  
  @scala.inline
  def colorize(
    text: java.lang.String,
    languageId: java.lang.String,
    options: typingsSlinky.monacoEditor.mod.editor.IColorizerOptions
  ): js.Promise[java.lang.String] = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def colorizeElement(
    domNode: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.monacoEditor.mod.editor.IColorizerElementOptions
  ): js.Promise[scala.Unit] = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeElement")(domNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def colorizeModelLine(model: typingsSlinky.monacoEditor.mod.editor.ITextModel, lineNumber: scala.Double): java.lang.String = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def colorizeModelLine(
    model: typingsSlinky.monacoEditor.mod.editor.ITextModel,
    lineNumber: scala.Double,
    tabSize: scala.Double
  ): java.lang.String = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def create(domElement: org.scalajs.dom.raw.HTMLElement): typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions,
    `override`: typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor]
  
  @scala.inline
  def createDiffEditor(domElement: org.scalajs.dom.raw.HTMLElement): typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.monacoEditor.mod.editor.IDiffEditorConstructionOptions
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: typingsSlinky.monacoEditor.mod.editor.IDiffEditorConstructionOptions,
    `override`: typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
  ): typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor]
  
  @scala.inline
  def createDiffNavigator(diffEditor: typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor): typingsSlinky.monacoEditor.mod.editor.IDiffNavigator = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IDiffNavigator]
  @scala.inline
  def createDiffNavigator(
    diffEditor: typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor,
    opts: typingsSlinky.monacoEditor.mod.editor.IDiffNavigatorOptions
  ): typingsSlinky.monacoEditor.mod.editor.IDiffNavigator = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.IDiffNavigator]
  
  @scala.inline
  def createModel(value: java.lang.String): typingsSlinky.monacoEditor.mod.editor.ITextModel = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(
    value: java.lang.String,
    language: js.UndefOr[scala.Nothing],
    uri: typingsSlinky.monacoEditor.mod.Uri
  ): typingsSlinky.monacoEditor.mod.editor.ITextModel = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String): typingsSlinky.monacoEditor.mod.editor.ITextModel = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String, uri: typingsSlinky.monacoEditor.mod.Uri): typingsSlinky.monacoEditor.mod.editor.ITextModel = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.ITextModel]
  
  @scala.inline
  def createWebWorker[T](opts: typingsSlinky.monacoEditor.mod.editor.IWebWorkerOptions): typingsSlinky.monacoEditor.mod.editor.MonacoWebWorker[T] = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createWebWorker")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.MonacoWebWorker[T]]
  
  @scala.inline
  def defineTheme(themeName: java.lang.String, themeData: typingsSlinky.monacoEditor.mod.editor.IStandaloneThemeData): scala.Unit = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("defineTheme")(themeName.asInstanceOf[js.Any], themeData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getModel(uri: typingsSlinky.monacoEditor.mod.Uri): typingsSlinky.monacoEditor.mod.editor.ITextModel | scala.Null = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.editor.ITextModel | scala.Null]
  
  @scala.inline
  def getModelMarkers(filter: typingsSlinky.monacoEditor.anon.Owner): js.Array[typingsSlinky.monacoEditor.mod.editor.IMarker] = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModelMarkers")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.monacoEditor.mod.editor.IMarker]]
  
  @scala.inline
  def getModels(): js.Array[typingsSlinky.monacoEditor.mod.editor.ITextModel] = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[js.Array[typingsSlinky.monacoEditor.mod.editor.ITextModel]]
  
  @scala.inline
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ typingsSlinky.monacoEditor.anon.Model, scala.Unit]): typingsSlinky.monacoEditor.mod.IDisposable = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeModelLanguage")(listener.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateEditor(
    listener: js.Function1[/* codeEditor */ typingsSlinky.monacoEditor.mod.editor.ICodeEditor, scala.Unit]
  ): typingsSlinky.monacoEditor.mod.IDisposable = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateModel(listener: js.Function1[/* model */ typingsSlinky.monacoEditor.mod.editor.ITextModel, scala.Unit]): typingsSlinky.monacoEditor.mod.IDisposable = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateModel")(listener.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onWillDisposeModel(listener: js.Function1[/* model */ typingsSlinky.monacoEditor.mod.editor.ITextModel, scala.Unit]): typingsSlinky.monacoEditor.mod.IDisposable = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onWillDisposeModel")(listener.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def remeasureFonts(): scala.Unit = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("remeasureFonts")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelLanguage(model: typingsSlinky.monacoEditor.mod.editor.ITextModel, languageId: java.lang.String): scala.Unit = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelLanguage")(model.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelMarkers(
    model: typingsSlinky.monacoEditor.mod.editor.ITextModel,
    owner: java.lang.String,
    markers: js.Array[typingsSlinky.monacoEditor.mod.editor.IMarkerData]
  ): scala.Unit = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelMarkers")(model.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTheme(themeName: java.lang.String): scala.Unit = typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def tokenize(text: java.lang.String, languageId: java.lang.String): js.Array[js.Array[typingsSlinky.monacoEditor.mod.Token]] = (typingsSlinky.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[typingsSlinky.monacoEditor.mod.Token]]]
}
