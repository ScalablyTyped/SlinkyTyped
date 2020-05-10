package typingsSlinky.pulumiAws.inputMod.mq

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: Input[String] = js.native
  /**
    * The username of the user.
    */
  var username: Input[String] = js.native
}

object BrokerUser {
  @scala.inline
  def apply(password: Input[String], username: Input[String]): BrokerUser = {
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
    def withPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleAccess(value: Input[Boolean]): Self = {
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
    def withGroups(value: Input[js.Array[Input[String]]]): Self = {
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

