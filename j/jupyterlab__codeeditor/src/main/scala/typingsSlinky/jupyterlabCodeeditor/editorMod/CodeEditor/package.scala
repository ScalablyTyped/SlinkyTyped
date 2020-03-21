package typingsSlinky.jupyterlabCodeeditor.editorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeEditor {
  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[
    /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions, 
    typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
  ]
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[
    /* instance */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor, 
    /* event */ org.scalajs.dom.raw.KeyboardEvent, 
    scala.Boolean
  ]
  type Model = typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model_
}
