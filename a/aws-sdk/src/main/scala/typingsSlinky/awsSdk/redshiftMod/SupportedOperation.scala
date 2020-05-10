package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedOperation extends js.Object {
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.native
}

object SupportedOperation {
  @scala.inline
  def apply(): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedOperation]
  }
  @scala.inline
  implicit class SupportedOperationOps[Self <: SupportedOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationName")(js.undefined)
        ret
    }
  }
  
}

