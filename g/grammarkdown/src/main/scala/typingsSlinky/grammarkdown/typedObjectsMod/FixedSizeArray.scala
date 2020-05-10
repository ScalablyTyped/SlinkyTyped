package typingsSlinky.grammarkdown.typedObjectsMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedSizeArray[THint /* <: TypeHint */, T] extends /* index */ NumberDictionary[T] {
  val length: Double = js.native
}

object FixedSizeArray {
  @scala.inline
  def apply[THint, T](length: Double): FixedSizeArray[THint, T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeArray[THint, T]]
  }
  @scala.inline
  implicit class FixedSizeArrayOps[Self[thint, t] <: FixedSizeArray[thint, t], THint, T] (val x: Self[THint, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THint, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THint, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[THint, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[THint, T]) with Other]
    @scala.inline
    def withLength(value: Double): Self[THint, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

