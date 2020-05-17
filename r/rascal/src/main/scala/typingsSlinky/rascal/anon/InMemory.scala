package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InMemory extends js.Object {
  var inMemory: Size = js.native
}

object InMemory {
  @scala.inline
  def apply(inMemory: Size): InMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMemory]
  }
  @scala.inline
  implicit class InMemoryOps[Self <: InMemory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInMemory(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

