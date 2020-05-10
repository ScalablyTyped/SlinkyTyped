package typingsSlinky.immer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmerState[T] extends js.Object {
  var assigned: StringDictionary[Boolean] = js.native
  var base: T = js.native
  var copy: T = js.native
  var parent: js.UndefOr[ImmerState[_]] = js.native
}

object ImmerState {
  @scala.inline
  def apply[T](assigned: StringDictionary[Boolean], base: T, copy: T): ImmerState[T] = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmerState[T]]
  }
  @scala.inline
  implicit class ImmerStateOps[Self[t] <: ImmerState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAssigned(value: StringDictionary[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ImmerState[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

