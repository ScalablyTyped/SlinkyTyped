package typingsSlinky.ava

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTitle[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.native
}

object AnonTitle {
  @scala.inline
  def apply[Args](): AnonTitle[Args] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTitle[Args]]
  }
  @scala.inline
  implicit class AnonTitleOps[Self[args] <: AnonTitle[args], Args] (val x: Self[Args]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Args] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Args]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Args] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Args] with Other]
    @scala.inline
    def withTitle(value: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => String): Self[Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self[Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

