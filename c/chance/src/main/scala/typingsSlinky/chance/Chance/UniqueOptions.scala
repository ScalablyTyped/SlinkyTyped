package typingsSlinky.chance.Chance

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {comparator ? (array : std.Array<T>, value : T): boolean} & chance.Chance.Options */
@js.native
trait UniqueOptions[T]
  extends /* id */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.native
}

object UniqueOptions {
  @scala.inline
  def apply[T](): UniqueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueOptions[T]]
  }
  @scala.inline
  implicit class UniqueOptionsOps[Self[t] <: UniqueOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComparator(value: (/* array */ js.Array[T], /* value */ T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
  }
  
}

