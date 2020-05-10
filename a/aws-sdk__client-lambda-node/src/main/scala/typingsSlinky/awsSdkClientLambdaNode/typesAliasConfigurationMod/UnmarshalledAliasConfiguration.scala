package typingsSlinky.awsSdkClientLambdaNode.typesAliasConfigurationMod

import typingsSlinky.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAliasConfiguration extends AliasConfiguration {
  /**
    * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
    */
  @JSName("RoutingConfig")
  var RoutingConfig_UnmarshalledAliasConfiguration: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.native
}

object UnmarshalledAliasConfiguration {
  @scala.inline
  def apply(): UnmarshalledAliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAliasConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledAliasConfigurationOps[Self <: UnmarshalledAliasConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingConfig")(js.undefined)
        ret
    }
  }
  
}

