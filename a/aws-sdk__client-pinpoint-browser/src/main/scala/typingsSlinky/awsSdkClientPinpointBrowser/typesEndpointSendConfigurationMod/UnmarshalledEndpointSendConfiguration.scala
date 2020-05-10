package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointSendConfiguration extends EndpointSendConfiguration {
  /**
    * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  @JSName("Context")
  var Context_UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledEndpointSendConfiguration {
  @scala.inline
  def apply(): UnmarshalledEndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointSendConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledEndpointSendConfigurationOps[Self <: UnmarshalledEndpointSendConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
  }
  
}

