package typingsSlinky.reactResolver.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[P] extends js.Object {
  var Resolved: ReactComponentClass[P] = js.native
  var data: js.Any = js.native
}

object Data {
  @scala.inline
  def apply[P](Resolved: ReactComponentClass[P], data: js.Any): Data[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[P]]
  }
  @scala.inline
  implicit class DataOps[Self[p] <: Data[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withResolved(value: ReactComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

