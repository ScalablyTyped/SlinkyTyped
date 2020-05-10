package typingsSlinky.pulumiAws.inputMod.gamelift

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingStrategy extends js.Object {
  /**
    * ID of the Gamelift Fleet to point the alias to.
    */
  var fleetId: js.UndefOr[Input[String]] = js.native
  /**
    * Message text to be used with the `TERMINAL` routing strategy.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
    */
  var `type`: Input[String] = js.native
}

object AliasRoutingStrategy {
  @scala.inline
  def apply(`type`: Input[String]): AliasRoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingStrategy]
  }
  @scala.inline
  implicit class AliasRoutingStrategyOps[Self <: AliasRoutingStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

