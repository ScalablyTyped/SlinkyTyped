package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorTranslateArgs extends js.Object {
  var CustomMessage: js.UndefOr[IErrorCustomMessage] = js.native
  var MessageArgs: js.Any = js.native
  var TranslateId: String = js.native
}

object IErrorTranslateArgs {
  @scala.inline
  def apply(MessageArgs: js.Any, TranslateId: String): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs.asInstanceOf[js.Any], TranslateId = TranslateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
  @scala.inline
  implicit class IErrorTranslateArgsOps[Self <: IErrorTranslateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMessage")(js.undefined)
        ret
    }
  }
  
}

