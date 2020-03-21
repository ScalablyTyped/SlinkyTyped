package typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console history object.
  */
trait IOptions extends js.Object {
  /**
    * The client session used by the foreign handler.
    */
  var session: IClientSession
}

object IOptions {
  @scala.inline
  def apply(session: IClientSession): IOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

