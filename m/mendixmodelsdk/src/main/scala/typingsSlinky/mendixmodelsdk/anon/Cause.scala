package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fail
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cause extends IEnvironmentStatus {
  var cause: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var state: CannotFixAppState
  var `type`: fail
}

object Cause {
  @scala.inline
  def apply(state: CannotFixAppState, `type`: fail, cause: String = null, message: String = null): Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
}

