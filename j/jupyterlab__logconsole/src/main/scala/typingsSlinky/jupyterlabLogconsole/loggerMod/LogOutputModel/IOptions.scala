package typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions
  extends typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions

object IOptions {
  @scala.inline
  def apply(value: IOutput): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

