package typingsSlinky.jupyterlabConsole.foreignMod

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler.IOptions
import typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler.IReceiver
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/foreign", "ForeignHandler")
@js.native
class ForeignHandler_ protected () extends IDisposable {
  /**
    * Construct a new foreign message handler.
    */
  def this(options: IOptions) = this()
  var _enabled: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Create a new code cell for an input originated from a foreign session.
    */
  var _newCell: js.Any = js.native
  var _parent: js.Any = js.native
  /**
    * Set whether the handler is able to inject foreign cells into a console.
    */
  var enabled: Boolean = js.native
  /**
    * The foreign handler's parent receiver.
    */
  val parent: IReceiver = js.native
  /**
    * The client session used by the foreign handler.
    */
  val session: IClientSession = js.native
  /**
    * Handler IOPub messages.
    *
    * @returns `true` if the message resulted in a new cell injection or a
    * previously injected cell being updated and `false` for all other messages.
    */
  /* protected */ def onIOPubMessage(sender: IClientSession, msg: IIOPubMessage[IOPubMessageType]): Boolean = js.native
}

