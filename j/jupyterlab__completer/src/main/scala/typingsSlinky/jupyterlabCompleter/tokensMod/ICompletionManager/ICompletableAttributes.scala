package typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes of a completable object that can change and sync at runtime.
  */
@js.native
trait ICompletableAttributes extends js.Object {
  /**
    * The data connector used to populate the completer.
    */
  var connector: IDataConnector[IReply, Unit, IRequest] = js.native
  /**
    * The host editor for the completer.
    */
  var editor: IEditor | Null = js.native
}

object ICompletableAttributes {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest]): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletableAttributes]
  }
  @scala.inline
  implicit class ICompletableAttributesOps[Self <: ICompletableAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: IDataConnector[IReply, Unit, IRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(null)
        ret
    }
  }
  
}

