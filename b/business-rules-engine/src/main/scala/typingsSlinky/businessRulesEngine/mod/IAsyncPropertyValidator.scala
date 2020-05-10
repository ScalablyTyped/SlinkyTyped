package typingsSlinky.businessRulesEngine.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.native
  var isAsync: Boolean = js.native
  var tagName: js.UndefOr[String] = js.native
  def isAcceptable(s: js.Any): Promise[Boolean] = js.native
}

object IAsyncPropertyValidator {
  @scala.inline
  def apply(isAcceptable: js.Any => Promise[Boolean], isAsync: Boolean): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
  @scala.inline
  implicit class IAsyncPropertyValidatorOps[Self <: IAsyncPropertyValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAcceptable(value: js.Any => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAcceptable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

