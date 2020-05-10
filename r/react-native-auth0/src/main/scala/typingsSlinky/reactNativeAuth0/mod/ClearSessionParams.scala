package typingsSlinky.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearSessionParams extends js.Object {
  var federated: Boolean = js.native
}

object ClearSessionParams {
  @scala.inline
  def apply(federated: Boolean): ClearSessionParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSessionParams]
  }
  @scala.inline
  implicit class ClearSessionParamsOps[Self <: ClearSessionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFederated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

