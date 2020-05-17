package typingsSlinky.refArray.anon

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dicti[T] extends /* i */ NumberDictionary[T] {
  var buffer: Buffer = js.native
  var length: Double = js.native
  def inspect(): String = js.native
  def ref(): Buffer = js.native
  def toArray(): js.Array[T] = js.native
  def toJSON(): js.Array[T] = js.native
}

object Dicti {
  @scala.inline
  def apply[T](
    buffer: Buffer,
    inspect: () => String,
    length: Double,
    ref: () => Buffer,
    toArray: () => js.Array[T],
    toJSON: () => js.Array[T]
  ): Dicti[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Dicti[T]]
  }
  @scala.inline
  implicit class DictiOps[Self[t] <: Dicti[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBuffer(value: Buffer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: () => Buffer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

