package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a supported command
  * @see XDispatchInformationProvider
  * @see Controller
  * @since OOo 2.0
  */
@js.native
trait DispatchInformation extends js.Object {
  /** command URL of a supported command. */
  var Command: String = js.native
  /**
    * group identifier to which the supported command belong.
    * @see CommandGroup
    */
  var GroupId: Double = js.native
}

object DispatchInformation {
  @scala.inline
  def apply(Command: String, GroupId: Double): DispatchInformation = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchInformation]
  }
  @scala.inline
  implicit class DispatchInformationOps[Self <: DispatchInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

