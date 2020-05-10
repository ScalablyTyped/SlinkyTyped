package typingsSlinky.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPartitionAssignmentProtocol extends js.Object {
  var name: String = js.native
  var version: Double = js.native
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit = js.native
}

object CustomPartitionAssignmentProtocol {
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
  @scala.inline
  implicit class CustomPartitionAssignmentProtocolOps[Self <: CustomPartitionAssignmentProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssign(value: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assign")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

