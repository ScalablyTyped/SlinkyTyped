package typingsSlinky.jupyterlabLogconsole.anon

import typingsSlinky.jupyterlabLogconsole.loggerMod.ILogOutput
import typingsSlinky.jupyterlabLogconsole.loggerMod.ILogOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastModel extends js.Object {
  var lastModel: ILogOutputModel = js.native
  var value: ILogOutput = js.native
}

object LastModel {
  @scala.inline
  def apply(lastModel: ILogOutputModel, value: ILogOutput): LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModel]
  }
  @scala.inline
  implicit class LastModelOps[Self <: LastModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModel(value: ILogOutputModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ILogOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

