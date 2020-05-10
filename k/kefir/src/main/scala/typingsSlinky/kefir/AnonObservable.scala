package typingsSlinky.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObservable extends js.Object {
  var Observable: AnonAp = js.native
}

object AnonObservable {
  @scala.inline
  def apply(Observable: AnonAp): AnonObservable = {
    val __obj = js.Dynamic.literal(Observable = Observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObservable]
  }
  @scala.inline
  implicit class AnonObservableOps[Self <: AnonObservable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObservable(value: AnonAp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Observable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

