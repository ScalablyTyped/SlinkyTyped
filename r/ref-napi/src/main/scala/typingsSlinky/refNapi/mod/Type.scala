package typingsSlinky.refNapi.mod

import typingsSlinky.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /** The alignment of this datatype when placed inside a struct. */
  var alignment: js.UndefOr[Double] = js.native
  /** The current level of indirection of the buffer. */
  var indirection: Double = js.native
  /** The name to use during debugging for this datatype. */
  var name: js.UndefOr[String] = js.native
  /** The size in bytes required to hold this datatype. */
  var size: Double = js.native
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  def get(buffer: Buffer, offset: Double): js.Any = js.native
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
}

object Type {
  @scala.inline
  def apply(
    get: (Buffer, Double) => js.Any,
    indirection: Double,
    set: (Buffer, Double, js.Any) => Unit,
    size: Double
  ): Type = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (Buffer, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIndirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (Buffer, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

