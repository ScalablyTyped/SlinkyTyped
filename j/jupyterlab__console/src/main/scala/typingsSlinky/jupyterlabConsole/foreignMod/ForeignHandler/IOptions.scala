package typingsSlinky.jupyterlabConsole.foreignMod.ForeignHandler

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a foreign handler.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The parent into which the handler will inject code cells.
    */
  var parent: IReceiver = js.native
  /**
    * The client session used by the foreign handler.
    */
  var session: IClientSession = js.native
}

object IOptions {
  @scala.inline
  def apply(parent: IReceiver, session: IClientSession): IOptions = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: IReceiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: IClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

