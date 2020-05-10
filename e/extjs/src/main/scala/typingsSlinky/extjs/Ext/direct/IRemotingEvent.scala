package typingsSlinky.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingEvent extends IEvent {
  /** [Method] Get the transaction associated with this event
  		* @returns Ext.direct.Transaction The transaction
  		*/
  var getTransaction: js.UndefOr[js.Function0[ITransaction]] = js.native
}

object IRemotingEvent {
  @scala.inline
  def apply(): IRemotingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingEvent]
  }
  @scala.inline
  implicit class IRemotingEventOps[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTransaction(value: () => ITransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransaction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransaction")(js.undefined)
        ret
    }
  }
  
}

