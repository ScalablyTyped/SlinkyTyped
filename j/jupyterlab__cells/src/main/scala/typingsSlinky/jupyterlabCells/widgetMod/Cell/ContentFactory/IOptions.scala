package typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the content factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor factory used by the content factory.
    *
    * If this is not passed, a default CodeMirror editor factory
    * will be used.
    */
  var editorFactory: js.UndefOr[Factory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IOptions]
  }
}

