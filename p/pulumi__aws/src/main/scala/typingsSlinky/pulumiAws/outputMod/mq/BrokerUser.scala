package typingsSlinky.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Boolean] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: String = js.native
  /**
    * The username of the user.
    */
  var username: String = js.native
}

object BrokerUser {
  @scala.inline
  def apply(password: String, username: String): BrokerUser = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerUser]
  }
  @scala.inline
  implicit class BrokerUserOps[Self <: BrokerUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
  }
  
}

