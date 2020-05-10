package typingsSlinky.mongoose

import typingsSlinky.mongoose.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  ordered ? :boolean,   rawResult ? :boolean} & mongoose.mongoose.ModelOptions */
@js.native
trait orderedbooleanrawResultbo extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.native
  var rawResult: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession | Null] = js.native
}

object orderedbooleanrawResultbo {
  @scala.inline
  def apply(): orderedbooleanrawResultbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[orderedbooleanrawResultbo]
  }
  @scala.inline
  implicit class orderedbooleanrawResultboOps[Self <: orderedbooleanrawResultbo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrdered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(js.undefined)
        ret
    }
    @scala.inline
    def withRawResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResult")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(null)
        ret
    }
  }
  
}

