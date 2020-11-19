package typingsSlinky.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.monacoEditor.anon.Model
import typingsSlinky.monacoEditor.anon.Owner
import typingsSlinky.monacoEditor.mod.IDisposable
import typingsSlinky.monacoEditor.mod.Token
import typingsSlinky.monacoEditor.mod.Uri
import typingsSlinky.monacoEditor.mod.editor.IColorizerElementOptions
import typingsSlinky.monacoEditor.mod.editor.IColorizerOptions
import typingsSlinky.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IDiffNavigator
import typingsSlinky.monacoEditor.mod.editor.IDiffNavigatorOptions
import typingsSlinky.monacoEditor.mod.editor.IEditorOverrideServices
import typingsSlinky.monacoEditor.mod.editor.IMarker
import typingsSlinky.monacoEditor.mod.editor.IMarkerData
import typingsSlinky.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsSlinky.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsSlinky.monacoEditor.mod.editor.IStandaloneThemeData
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import typingsSlinky.monacoEditor.mod.editor.IWebWorkerOptions
import typingsSlinky.monacoEditor.mod.editor.MonacoWebWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofeditor extends js.Object {
  
  var BareFontInfo: Instantiable0[typingsSlinky.monacoEditor.mod.editor.BareFontInfo] = js.native
  
  var ConfigurationChangedEvent: Instantiable0[typingsSlinky.monacoEditor.mod.editor.ConfigurationChangedEvent] = js.native
  
  val EditorOptions: AcceptSuggestionOnCommitCharacter = js.native
  
  val EditorType: ICodeEditor = js.native
  
  var FindMatch: Instantiable0[typingsSlinky.monacoEditor.mod.editor.FindMatch] = js.native
  
  var FontInfo: Instantiable0[typingsSlinky.monacoEditor.mod.editor.FontInfo] = js.native
  
  var TextModelResolvedOptions: Instantiable0[typingsSlinky.monacoEditor.mod.editor.TextModelResolvedOptions] = js.native
  
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
  
  def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  
  def createModel(value: String): ITextModel = js.native
  def createModel(value: String, language: js.UndefOr[scala.Nothing], uri: Uri): ITextModel = js.native
  def createModel(value: String, language: String): ITextModel = js.native
  def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
  
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  
  def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
  
  def getModel(uri: Uri): ITextModel | Null = js.native
  
  def getModelMarkers(filter: Owner): js.Array[IMarker] = js.native
  
  def getModels(): js.Array[ITextModel] = js.native
  
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ Model, Unit]): IDisposable = js.native
  
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ typingsSlinky.monacoEditor.mod.editor.ICodeEditor, Unit]): IDisposable = js.native
  
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  
  def remeasureFonts(): Unit = js.native
  
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  
  def setTheme(themeName: String): Unit = js.native
  
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}
