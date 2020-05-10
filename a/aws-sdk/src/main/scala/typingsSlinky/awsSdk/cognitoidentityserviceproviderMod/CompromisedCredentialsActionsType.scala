package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompromisedCredentialsActionsType extends js.Object {
  /**
    * The event action.
    */
  var EventAction: CompromisedCredentialsEventActionType = js.native
}

object CompromisedCredentialsActionsType {
  @scala.inline
  def apply(EventAction: CompromisedCredentialsEventActionType): CompromisedCredentialsActionsType = {
    val __obj = js.Dynamic.literal(EventAction = EventAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsActionsType]
  }
  @scala.inline
  implicit class CompromisedCredentialsActionsTypeOps[Self <: CompromisedCredentialsActionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventAction(value: CompromisedCredentialsEventActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

