package typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.NODE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDeleteConfig extends DeclarativeMutationConfig {
  var connectionName: js.UndefOr[String] = js.native
  var deletedIDFieldName: String = js.native
  var parentID: js.UndefOr[String] = js.native
  var parentName: js.UndefOr[String] = js.native
  var `type`: NODE_DELETE = js.native
}

object NodeDeleteConfig {
  @scala.inline
  def apply(deletedIDFieldName: String, `type`: NODE_DELETE): NodeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDeleteConfig]
  }
  @scala.inline
  implicit class NodeDeleteConfigOps[Self <: NodeDeleteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedIDFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedIDFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NODE_DELETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withParentID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentID")(js.undefined)
        ret
    }
    @scala.inline
    def withParentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentName")(js.undefined)
        ret
    }
  }
  
}

