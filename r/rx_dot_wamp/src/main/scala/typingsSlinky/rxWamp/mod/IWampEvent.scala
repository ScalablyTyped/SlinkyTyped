package typingsSlinky.rxWamp.mod

import typingsSlinky.autobahn.mod.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWampEvent extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var details: js.UndefOr[IEvent] = js.native
  var kwargs: js.UndefOr[js.Any] = js.native
}

object IWampEvent {
  @scala.inline
  def apply(): IWampEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWampEvent]
  }
  @scala.inline
  implicit class IWampEventOps[Self <: IWampEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: IEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withKwargs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kwargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKwargs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kwargs")(js.undefined)
        ret
    }
  }
  
}

