package typingsSlinky.athenajs.mod

import typingsSlinky.athenajs.AnonInstantiableEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: AnonInstantiableEffect): Unit = js.native
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, AnonInstantiableEffect) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
    __obj.asInstanceOf[FXInstance]
  }
  @scala.inline
  implicit class FXInstanceOps[Self <: FXInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFX(value: (String, AnonInstantiableEffect) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFX")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

