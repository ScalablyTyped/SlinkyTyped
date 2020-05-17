package typingsSlinky.expect.anon

import typingsSlinky.expect.typesMod.Tester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableEquality extends js.Object {
  var iterableEquality: Tester = js.native
  var subsetEquality: Tester = js.native
}

object IterableEquality {
  @scala.inline
  def apply(
    iterableEquality: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean],
    subsetEquality: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean]
  ): IterableEquality = {
    val __obj = js.Dynamic.literal(iterableEquality = js.Any.fromFunction2(iterableEquality), subsetEquality = js.Any.fromFunction2(subsetEquality))
    __obj.asInstanceOf[IterableEquality]
  }
  @scala.inline
  implicit class IterableEqualityOps[Self <: IterableEquality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterableEquality(value: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterableEquality")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubsetEquality(value: (/* a */ js.Any, /* b */ js.Any) => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subsetEquality")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

