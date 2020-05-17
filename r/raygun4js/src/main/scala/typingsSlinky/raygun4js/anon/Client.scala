package typingsSlinky.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var Client: Name = js.native
  var Environment: Browser = js.native
  var Error: ClassName = js.native
  var GroupingKey: js.UndefOr[String] = js.native
  var Request: Headers = js.native
  var Tags: js.Array[String] = js.native
  var User: Email = js.native
  var UserCustomData: js.Any = js.native
  var Version: String = js.native
}

object Client {
  @scala.inline
  def apply(
    Client: Name,
    Environment: Browser,
    Error: ClassName,
    Request: Headers,
    Tags: js.Array[String],
    User: Email,
    UserCustomData: js.Any,
    Version: String
  ): Client = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
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
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingKey")(js.undefined)
        ret
    }
  }
  
}

