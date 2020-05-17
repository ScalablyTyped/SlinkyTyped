package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hint extends js.Object {
  var hint: js.UndefOr[String] = js.native
  var messageDetail: js.UndefOr[String] = js.native
  var messageSummary: js.UndefOr[String] = js.native
}

object Hint {
  @scala.inline
  def apply(): Hint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hint]
  }
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(js.undefined)
        ret
    }
  }
  
}

