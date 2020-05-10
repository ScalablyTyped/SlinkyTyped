package typingsSlinky.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeArg[FormFields] extends js.Object {
  def subscribe(data: FormFields): Unit = js.native
}

object SubscribeArg {
  @scala.inline
  def apply[FormFields](subscribe: FormFields => Unit): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
  @scala.inline
  implicit class SubscribeArgOps[Self[formfields] <: SubscribeArg[formfields], FormFields] (val x: Self[FormFields]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormFields] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormFields]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FormFields] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FormFields] with Other]
    @scala.inline
    def withSubscribe(value: FormFields => Unit): Self[FormFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

