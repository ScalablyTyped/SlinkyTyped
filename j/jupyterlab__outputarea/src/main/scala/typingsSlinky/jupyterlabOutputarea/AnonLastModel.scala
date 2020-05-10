package typingsSlinky.jupyterlabOutputarea

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLastModel extends js.Object {
  var lastModel: IOutputModel = js.native
  var value: IOutput = js.native
}

object AnonLastModel {
  @scala.inline
  def apply(lastModel: IOutputModel, value: IOutput): AnonLastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastModel]
  }
  @scala.inline
  implicit class AnonLastModelOps[Self <: AnonLastModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModel(value: IOutputModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: IOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

