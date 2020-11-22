package typingsSlinky.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a code mirror editor.
  */
@js.native
trait IOptions
  extends typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
object IOptions {
  
  @scala.inline
  def apply(host: HTMLElement, model: IModel): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}
