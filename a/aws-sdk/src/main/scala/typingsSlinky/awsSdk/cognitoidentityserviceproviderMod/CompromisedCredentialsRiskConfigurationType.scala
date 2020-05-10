package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompromisedCredentialsRiskConfigurationType extends js.Object {
  /**
    * The compromised credentials risk configuration actions.
    */
  var Actions: CompromisedCredentialsActionsType = js.native
  /**
    * Perform the action for these events. The default is to perform all events if no event filter is specified.
    */
  var EventFilter: js.UndefOr[EventFiltersType] = js.native
}

object CompromisedCredentialsRiskConfigurationType {
  @scala.inline
  def apply(Actions: CompromisedCredentialsActionsType): CompromisedCredentialsRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
  }
  @scala.inline
  implicit class CompromisedCredentialsRiskConfigurationTypeOps[Self <: CompromisedCredentialsRiskConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: CompromisedCredentialsActionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventFilter(value: EventFiltersType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFilter")(js.undefined)
        ret
    }
  }
  
}

