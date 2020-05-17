package typingsSlinky.jointjs.mod.connectors

import typingsSlinky.jointjs.jointjsStrings.arc
import typingsSlinky.jointjs.jointjsStrings.cubic
import typingsSlinky.jointjs.jointjsStrings.gap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpOverConnectorArguments extends js.Object {
  var jump: js.UndefOr[arc | gap | cubic] = js.native
  var radius: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
}

object JumpOverConnectorArguments {
  @scala.inline
  def apply(): JumpOverConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpOverConnectorArguments]
  }
  @scala.inline
  implicit class JumpOverConnectorArgumentsOps[Self <: JumpOverConnectorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJump(value: arc | gap | cubic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
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
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

