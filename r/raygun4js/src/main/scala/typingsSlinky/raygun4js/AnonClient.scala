package typingsSlinky.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClient extends js.Object {
  var Client: AnonName = js.native
  var Environment: AnonBrowser = js.native
  var Error: AnonClassName = js.native
  var GroupingKey: js.UndefOr[String] = js.native
  var Request: AnonHeaders = js.native
  var Tags: js.Array[String] = js.native
  var User: AnonEmail = js.native
  var UserCustomData: js.Any = js.native
  var Version: String = js.native
}

object AnonClient {
  @scala.inline
  def apply(
    Client: AnonName,
    Environment: AnonBrowser,
    Error: AnonClassName,
    Request: AnonHeaders,
    Tags: js.Array[String],
    User: AnonEmail,
    UserCustomData: js.Any,
    Version: String
  ): AnonClient = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
  @scala.inline
  implicit class AnonClientOps[Self <: AnonClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: AnonBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: AnonClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: AnonHeaders): Self = {
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
    def withUser(value: AnonEmail): Self = {
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

