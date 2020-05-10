package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsyncResponses extends js.Object {
  var asyncResponses: js.UndefOr[Boolean] = js.native
  var asyncTimeout: js.UndefOr[Double] = js.native
}

object AnonAsyncResponses {
  @scala.inline
  def apply(): AnonAsyncResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAsyncResponses]
  }
  @scala.inline
  implicit class AnonAsyncResponsesOps[Self <: AnonAsyncResponses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncResponses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncTimeout")(js.undefined)
        ret
    }
  }
  
}

