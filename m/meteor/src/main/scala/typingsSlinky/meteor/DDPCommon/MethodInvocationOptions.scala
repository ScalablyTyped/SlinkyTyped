package typingsSlinky.meteor.DDPCommon

import typingsSlinky.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodInvocationOptions extends js.Object {
  var connection: Connection = js.native
  var isSimulation: Boolean = js.native
  var randomSeed: String = js.native
  var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.native
  var userId: String | Null = js.native
}

object MethodInvocationOptions {
  @scala.inline
  def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodInvocationOptions]
  }
  @scala.inline
  implicit class MethodInvocationOptionsOps[Self <: MethodInvocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSimulation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSimulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetUserId(value: /* newUserId */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(null)
        ret
    }
  }
  
}

