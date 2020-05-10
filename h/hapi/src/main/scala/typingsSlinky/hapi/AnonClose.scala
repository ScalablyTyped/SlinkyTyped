package typingsSlinky.hapi

import typingsSlinky.hapi.mod.ResponseObject
import typingsSlinky.hapi.mod.ResponseValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClose extends js.Object {
  var close: js.UndefOr[js.Function1[/* response */ ResponseObject, Unit]] = js.native
  var marshal: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseValue]]] = js.native
  var prepare: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseObject]]] = js.native
  var variety: js.UndefOr[String] = js.native
}

object AnonClose {
  @scala.inline
  def apply(): AnonClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClose]
  }
  @scala.inline
  implicit class AnonCloseOps[Self <: AnonClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: /* response */ ResponseObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withMarshal(value: /* response */ ResponseObject => js.Promise[ResponseValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marshal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarshal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marshal")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: /* response */ ResponseObject => js.Promise[ResponseObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withVariety(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variety")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariety: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variety")(js.undefined)
        ret
    }
  }
  
}

