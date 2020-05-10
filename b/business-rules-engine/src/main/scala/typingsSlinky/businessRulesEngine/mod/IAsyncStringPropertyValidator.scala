package typingsSlinky.businessRulesEngine.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncStringPropertyValidator extends IAsyncPropertyValidator {
  def isAcceptable(s: String): Promise[Boolean] = js.native
}

object IAsyncStringPropertyValidator {
  @scala.inline
  def apply(isAcceptable: String => Promise[Boolean], isAsync: Boolean): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
  @scala.inline
  implicit class IAsyncStringPropertyValidatorOps[Self <: IAsyncStringPropertyValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAcceptable(value: String => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAcceptable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

