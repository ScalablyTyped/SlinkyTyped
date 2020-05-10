package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyProductOutput extends js.Object {
  /**
    * The token to use to track the progress of the operation.
    */
  var CopyProductToken: js.UndefOr[Id] = js.native
}

object CopyProductOutput {
  @scala.inline
  def apply(): CopyProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyProductOutput]
  }
  @scala.inline
  implicit class CopyProductOutputOps[Self <: CopyProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyProductToken(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyProductToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyProductToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyProductToken")(js.undefined)
        ret
    }
  }
  
}

