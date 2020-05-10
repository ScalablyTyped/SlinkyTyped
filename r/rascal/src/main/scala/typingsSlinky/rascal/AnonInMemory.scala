package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInMemory extends js.Object {
  var inMemory: AnonSize = js.native
}

object AnonInMemory {
  @scala.inline
  def apply(inMemory: AnonSize): AnonInMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInMemory]
  }
  @scala.inline
  implicit class AnonInMemoryOps[Self <: AnonInMemory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInMemory(value: AnonSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

