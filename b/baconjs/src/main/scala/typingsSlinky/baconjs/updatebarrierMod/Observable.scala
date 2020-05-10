package typingsSlinky.baconjs.updatebarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends js.Object {
  var id: Double = js.native
  def internalDeps(): js.Array[Observable] = js.native
}

object Observable {
  @scala.inline
  def apply(id: Double, internalDeps: () => js.Array[Observable]): Observable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internalDeps = js.Any.fromFunction0(internalDeps))
    __obj.asInstanceOf[Observable]
  }
  @scala.inline
  implicit class ObservableOps[Self <: Observable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalDeps(value: () => js.Array[Observable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalDeps")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

