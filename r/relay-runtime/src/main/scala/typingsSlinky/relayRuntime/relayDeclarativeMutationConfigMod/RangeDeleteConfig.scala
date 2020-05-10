package typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod

import typingsSlinky.relayRuntime.AnonKey
import typingsSlinky.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeDeleteConfig extends DeclarativeMutationConfig {
  var connectionKeys: js.UndefOr[js.Array[AnonKey]] = js.native
  var connectionName: js.UndefOr[String] = js.native
  var deletedIDFieldName: String | js.Array[String] = js.native
  var parentID: js.UndefOr[String] = js.native
  var parentName: js.UndefOr[String] = js.native
  var pathToConnection: js.Array[String] = js.native
  var `type`: RANGE_DELETE = js.native
}

object RangeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: String | js.Array[String],
    pathToConnection: js.Array[String],
    `type`: RANGE_DELETE
  ): RangeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDeleteConfig]
  }
  @scala.inline
  implicit class RangeDeleteConfigOps[Self <: RangeDeleteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedIDFieldName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedIDFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathToConnection(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RANGE_DELETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionKeys(value: js.Array[AnonKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionKeys")(js.undefined)
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

