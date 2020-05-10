package typingsSlinky.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCustomMatcherResult extends js.Object {
  var message: js.UndefOr[String] = js.native
  var pass: Boolean | js.Promise[Boolean] = js.native
}

object AsyncCustomMatcherResult {
  @scala.inline
  def apply(pass: Boolean | js.Promise[Boolean]): AsyncCustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncCustomMatcherResult]
  }
  @scala.inline
  implicit class AsyncCustomMatcherResultOps[Self <: AsyncCustomMatcherResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPass(value: Boolean | js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

