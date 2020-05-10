package typingsSlinky.meteor

import typingsSlinky.meteor.Meteor.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnResultReceived[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result], Unit]
  ] = js.native
  var returnStubValue: js.UndefOr[Boolean] = js.native
  var throwStubExceptions: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FAnonOnResultReceived: js.UndefOr[Boolean] = js.native
}

object AnonOnResultReceived {
  @scala.inline
  def apply[Result](): AnonOnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnResultReceived[Result]]
  }
  @scala.inline
  implicit class AnonOnResultReceivedOps[Self[result] <: AnonOnResultReceived[result], Result] (val x: Self[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Result] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Result] with Other]
    @scala.inline
    def withOnResultReceived(value: (/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result]) => Unit): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultReceived")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResultReceived: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnStubValue(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnStubValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnStubValue: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnStubValue")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowStubExceptions(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwStubExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowStubExceptions: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwStubExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Boolean): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

