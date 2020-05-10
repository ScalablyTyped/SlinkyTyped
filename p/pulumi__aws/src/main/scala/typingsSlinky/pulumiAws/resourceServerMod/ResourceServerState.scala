package typingsSlinky.pulumiAws.resourceServerMod

import typingsSlinky.pulumiAws.inputMod.cognito.ResourceServerScope
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerState extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of all scopes configured for this resource server in the format identifier/scope_name.
    */
  val scopeIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[ResourceServerScope]]]] = js.native
  val userPoolId: js.UndefOr[Input[String]] = js.native
}

object ResourceServerState {
  @scala.inline
  def apply(): ResourceServerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServerState]
  }
  @scala.inline
  implicit class ResourceServerStateOps[Self <: ResourceServerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeIdentifiers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: Input[js.Array[Input[ResourceServerScope]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(js.undefined)
        ret
    }
  }
  
}

