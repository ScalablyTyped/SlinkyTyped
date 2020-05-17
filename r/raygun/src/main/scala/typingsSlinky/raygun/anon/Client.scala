package typingsSlinky.raygun.anon

import typingsSlinky.raygun.mod.raygun.KeyValueObject
import typingsSlinky.raygun.mod.raygun.RaygunErrorObject
import typingsSlinky.raygun.mod.raygun.RaygunRequest
import typingsSlinky.raygun.mod.raygun.RaygunUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client: Name = js.native
  var environment: Architecture = js.native
  var error: RaygunErrorObject = js.native
  var groupingKey: js.UndefOr[String] = js.native
  var machineName: String = js.native
  var request: js.UndefOr[RaygunRequest] = js.native
  var tags: js.Array[String] = js.native
  var user: js.UndefOr[RaygunUser | Identifier] = js.native
  var userCustomData: js.UndefOr[KeyValueObject] = js.native
  var version: js.UndefOr[String] = js.native
}

object Client {
  @scala.inline
  def apply(
    client: Name,
    environment: Architecture,
    error: RaygunErrorObject,
    machineName: String,
    tags: js.Array[String]
  ): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], machineName = machineName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: Architecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: RaygunErrorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMachineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: RaygunRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: RaygunUser | Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCustomData(value: KeyValueObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCustomData")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

