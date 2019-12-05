package typingsSlinky.reactDashMonacoDashEditor

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.monacoDashEditor.Anon_Model
import typingsSlinky.monacoDashEditor.Anon_Owner
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.Token
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.Uri
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.ICodeEditor
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IColorizerElementOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IColorizerOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IDiffEditorConstructionOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IDiffNavigator
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IDiffNavigatorOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IEditorConstructionOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IEditorOverrideServices
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IMarker
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IMarkerData
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneCodeEditor
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneDiffEditor
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneThemeData
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.IWebWorkerOptions
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.MonacoWebWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeditor extends js.Object {
  var BareFontInfo: Instantiable0[typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.BareFontInfo] = js.native
  val EditorType: Anon_ICodeEditor = js.native
  var FindMatch: Instantiable0[typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.FindMatch] = js.native
  var FontInfo: Instantiable0[typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.FontInfo] = js.native
  var InternalEditorOptions: Instantiable0[typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.InternalEditorOptions] = js.native
  var TextModelResolvedOptions: Instantiable0[
    typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.TextModelResolvedOptions
  ] = js.native
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
  def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  def createModel(value: String): ITextModel = js.native
  def createModel(value: String, language: String): ITextModel = js.native
  def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
  def getModel(uri: Uri): ITextModel | Null = js.native
  def getModelMarkers(filter: Anon_Owner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ Anon_Model, Unit]): IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def remeasureFonts(): Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  def setTheme(themeName: String): Unit = js.native
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}

