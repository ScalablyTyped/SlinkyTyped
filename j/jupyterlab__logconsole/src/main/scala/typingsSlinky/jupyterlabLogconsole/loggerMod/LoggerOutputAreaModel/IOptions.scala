package typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions
  extends typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions {
  /**
    * The maximum number of messages stored.
    */
  var maxLength: Double = js.native
}

object IOptions {
  @scala.inline
  def apply(maxLength: Double): IOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

