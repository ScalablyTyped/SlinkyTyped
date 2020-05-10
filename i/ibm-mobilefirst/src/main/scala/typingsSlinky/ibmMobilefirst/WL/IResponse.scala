package typingsSlinky.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponse extends js.Object {
  var invocationContext: js.UndefOr[js.Any] = js.native
}

object IResponse {
  @scala.inline
  def apply(): IResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponse]
  }
  @scala.inline
  implicit class IResponseOps[Self <: IResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(js.undefined)
        ret
    }
  }
  
}

