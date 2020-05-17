package typingsSlinky.numbro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Billion extends js.Object {
  var billion: js.UndefOr[String] = js.native
  var million: js.UndefOr[String] = js.native
  var thousand: js.UndefOr[String] = js.native
  var trillion: js.UndefOr[String] = js.native
}

object Billion {
  @scala.inline
  def apply(): Billion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billion]
  }
  @scala.inline
  implicit class BillionOps[Self <: Billion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billion")(js.undefined)
        ret
    }
    @scala.inline
    def withMillion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("million")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("million")(js.undefined)
        ret
    }
    @scala.inline
    def withThousand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(js.undefined)
        ret
    }
    @scala.inline
    def withTrillion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trillion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrillion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trillion")(js.undefined)
        ret
    }
  }
  
}

