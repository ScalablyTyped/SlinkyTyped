package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCoreDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.native
}

object CreateCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: string): CreateCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
  }
  @scala.inline
  implicit class CreateCoreDefinitionVersionRequestOps[Self <: CreateCoreDefinitionVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmznClientToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmznClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCores(value: listOfCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(js.undefined)
        ret
    }
  }
  
}

