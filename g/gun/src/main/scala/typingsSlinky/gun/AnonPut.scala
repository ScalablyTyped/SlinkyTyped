package typingsSlinky.gun

import typingsSlinky.gun.mod.Gun.DisallowArray
import typingsSlinky.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPut[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit = js.native
}

object AnonPut {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): AnonPut[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
    __obj.asInstanceOf[AnonPut[DataType]]
  }
  @scala.inline
  implicit class AnonPutOps[Self[datatype] <: AnonPut[datatype], DataType] (val x: Self[DataType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DataType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DataType] with Other]
    @scala.inline
    def withPut(value: DisallowArray[Saveable[DataType]] => Unit): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

