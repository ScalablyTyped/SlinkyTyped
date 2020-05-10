package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.native
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.native
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
}

object AliasConfiguration {
  @scala.inline
  def apply(): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasConfiguration]
  }
  @scala.inline
  implicit class AliasConfigurationOps[Self <: AliasConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasArn(value: FunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingConfig(value: AliasRoutingConfiguration): Self = {
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

