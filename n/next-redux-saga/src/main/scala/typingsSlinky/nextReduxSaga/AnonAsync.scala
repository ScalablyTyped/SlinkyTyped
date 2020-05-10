package typingsSlinky.nextReduxSaga

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsync extends js.Object {
  var async: Boolean = js.native
}

object AnonAsync {
  @scala.inline
  def apply(async: Boolean): AnonAsync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
  @scala.inline
  implicit class AnonAsyncOps[Self <: AnonAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

