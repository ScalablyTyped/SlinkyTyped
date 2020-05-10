package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerifyVaultJobOutput extends js.Object {
  val Errors: IStrings = js.native
}

object IVerifyVaultJobOutput {
  @scala.inline
  def apply(Errors: IStrings): IVerifyVaultJobOutput = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyVaultJobOutput]
  }
  @scala.inline
  implicit class IVerifyVaultJobOutputOps[Self <: IVerifyVaultJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: IStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

