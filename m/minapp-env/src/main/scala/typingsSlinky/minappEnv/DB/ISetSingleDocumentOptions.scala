package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.IAPIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetSingleDocumentOptions
  extends IAPIParam[js.Any] {
  var data: IUpdateCondition = js.native
}

object ISetSingleDocumentOptions {
  @scala.inline
  def apply(data: IUpdateCondition): ISetSingleDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetSingleDocumentOptions]
  }
  @scala.inline
  implicit class ISetSingleDocumentOptionsOps[Self <: ISetSingleDocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IUpdateCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

