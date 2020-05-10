package typingsSlinky.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuseResultWithMatches[T] extends js.Object {
  var item: T = js.native
  var matches: js.Any = js.native
}

object FuseResultWithMatches {
  @scala.inline
  def apply[T](item: T, matches: js.Any): FuseResultWithMatches[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuseResultWithMatches[T]]
  }
  @scala.inline
  implicit class FuseResultWithMatchesOps[Self[t] <: FuseResultWithMatches[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

