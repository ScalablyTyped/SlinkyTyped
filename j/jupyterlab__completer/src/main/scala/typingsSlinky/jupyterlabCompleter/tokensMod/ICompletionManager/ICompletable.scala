package typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager

import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for completer-compatible objects.
  */
@js.native
trait ICompletable extends ICompletableAttributes {
  /**
    * The parent of the completer; the completer resources dispose with parent.
    */
  val parent: Widget = js.native
}

object ICompletable {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest], parent: Widget): ICompletable = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletable]
  }
  @scala.inline
  implicit class ICompletableOps[Self <: ICompletable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

