package typingsSlinky.pulumiAws.recorderStatusMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderStatusArgs extends js.Object {
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: Input[Boolean] = js.native
  /**
    * The name of the recorder
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object RecorderStatusArgs {
  @scala.inline
  def apply(isEnabled: Input[Boolean]): RecorderStatusArgs = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderStatusArgs]
  }
  @scala.inline
  implicit class RecorderStatusArgsOps[Self <: RecorderStatusArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

