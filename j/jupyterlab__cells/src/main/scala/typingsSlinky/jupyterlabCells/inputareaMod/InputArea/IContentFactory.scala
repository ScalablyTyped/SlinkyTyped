package typingsSlinky.jupyterlabCells.inputareaMod.InputArea

import typingsSlinky.jupyterlabCells.inputareaMod.IInputPrompt
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  val editorFactory: Factory = js.native
  /**
    * Create an input prompt.
    */
  def createInputPrompt(): IInputPrompt = js.native
}

object IContentFactory {
  @scala.inline
  def apply(
    createInputPrompt: () => IInputPrompt,
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createInputPrompt = js.Any.fromFunction0(createInputPrompt), editorFactory = js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateInputPrompt(value: () => IInputPrompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInputPrompt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditorFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFactory")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

