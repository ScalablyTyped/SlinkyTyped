package typingsSlinky.pulumiAws.resourceServerMod

import typingsSlinky.pulumiAws.inputMod.cognito.ResourceServerScope
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerArgs extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: Input[String] = js.native
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[Input[js.Array[Input[ResourceServerScope]]]] = js.native
  val userPoolId: Input[String] = js.native
}

object ResourceServerArgs {
  @scala.inline
  def apply(identifier: Input[String], userPoolId: Input[String]): ResourceServerArgs = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
  @scala.inline
  implicit class ResourceServerArgsOps[Self <: ResourceServerArgs] (val x: Self) extends AnyVal {
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
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
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
  }
  
}

