package typingsSlinky.jupyterlabServices.builderMod.BuildManager

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.building
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.needed
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The build status response from the server.
  */
@js.native
trait IStatus extends js.Object {
  /**
    * The message associated with the build status.
    */
  val message: String = js.native
  /**
    * Whether a build is needed.
    */
  val status: stable | needed | building = js.native
}

object IStatus {
  @scala.inline
  def apply(message: String, status: stable | needed | building): IStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatus]
  }
  @scala.inline
  implicit class IStatusOps[Self <: IStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: stable | needed | building): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

