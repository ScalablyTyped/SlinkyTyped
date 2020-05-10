package typingsSlinky.nivoCore.mod

import typingsSlinky.nivoCore.AnonDictkey
import typingsSlinky.nivoCore.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[AnonDictkey]] = js.native
  var fill: js.UndefOr[js.Array[AnonId[T]]] = js.native
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
  @scala.inline
  implicit class SvgDefsAndFillOps[Self[t] <: SvgDefsAndFill[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefs(value: js.Array[AnonDictkey]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: js.Array[AnonId[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
  }
  
}

