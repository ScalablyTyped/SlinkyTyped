package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.native
}

object ArrayOptions {
  @scala.inline
  def apply[TLeft, TRight](): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
  @scala.inline
  implicit class ArrayOptionsOps[Self[tleft, tright] <: ArrayOptions[tleft, tright], TLeft, TRight] (val x: Self[TLeft, TRight]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLeft, TRight] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLeft, TRight]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TLeft, TRight]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TLeft, TRight]) with Other]
    @scala.inline
    def withComparator(value: (/* left */ TLeft, /* right */ TRight) => Boolean): Self[TLeft, TRight] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self[TLeft, TRight] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
  }
  
}

