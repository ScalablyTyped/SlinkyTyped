package typingsSlinky.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error **/
/** Method **/
@js.native
trait MethodThisType extends js.Object {
  var connection: Connection | Null = js.native
  var isSimulation: Boolean = js.native
  var userId: String | Null = js.native
  def setUserId(userId: String): Unit = js.native
  def unblock(): Unit = js.native
}

object MethodThisType {
  @scala.inline
  def apply(isSimulation: Boolean, setUserId: String => Unit, unblock: () => Unit): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation.asInstanceOf[js.Any], setUserId = js.Any.fromFunction1(setUserId), unblock = js.Any.fromFunction0(unblock))
    __obj.asInstanceOf[MethodThisType]
  }
  @scala.inline
  implicit class MethodThisTypeOps[Self <: MethodThisType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSimulation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSimulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetUserId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnblock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(null)
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

