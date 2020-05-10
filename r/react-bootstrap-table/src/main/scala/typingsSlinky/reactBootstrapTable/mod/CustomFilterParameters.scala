package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFilterParameters[Params /* <: js.Object */] extends js.Object {
  var callbackParameters: Params = js.native
  def callback(cell: js.Any, params: Params): Boolean = js.native
}

object CustomFilterParameters {
  @scala.inline
  def apply[Params](callback: (js.Any, Params) => Boolean, callbackParameters: Params): CustomFilterParameters[Params] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), callbackParameters = callbackParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterParameters[Params]]
  }
  @scala.inline
  implicit class CustomFilterParametersOps[Self[params] <: CustomFilterParameters[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withCallback(value: (js.Any, Params) => Boolean): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallbackParameters(value: Params): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

