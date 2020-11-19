package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.create")
@js.native
object create extends js.Object {
  
  def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: js.UndefOr[scala.Nothing], `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def apply(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = js.native
}
