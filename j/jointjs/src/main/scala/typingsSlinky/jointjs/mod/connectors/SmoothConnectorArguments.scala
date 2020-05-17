package typingsSlinky.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmoothConnectorArguments extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
}

object SmoothConnectorArguments {
  @scala.inline
  def apply(): SmoothConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmoothConnectorArguments]
  }
  @scala.inline
  implicit class SmoothConnectorArgumentsOps[Self <: SmoothConnectorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

