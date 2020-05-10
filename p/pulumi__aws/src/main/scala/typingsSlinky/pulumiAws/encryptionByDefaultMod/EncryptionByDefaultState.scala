package typingsSlinky.pulumiAws.encryptionByDefaultMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionByDefaultState extends js.Object {
  /**
    * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
}

object EncryptionByDefaultState {
  @scala.inline
  def apply(): EncryptionByDefaultState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionByDefaultState]
  }
  @scala.inline
  implicit class EncryptionByDefaultStateOps[Self <: EncryptionByDefaultState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

