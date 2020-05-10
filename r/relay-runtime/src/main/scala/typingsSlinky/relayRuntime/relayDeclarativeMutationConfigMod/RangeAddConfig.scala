package typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.AnonFilters
import typingsSlinky.relayRuntime.relayRuntimeStrings.RANGE_ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeAddConfig extends DeclarativeMutationConfig {
  var connectionInfo: js.UndefOr[js.Array[AnonFilters]] = js.native
  var connectionName: js.UndefOr[String] = js.native
  var edgeName: String = js.native
  var parentID: js.UndefOr[String] = js.native
  var parentName: js.UndefOr[String] = js.native
  var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.native
  var `type`: RANGE_ADD = js.native
}

object RangeAddConfig {
  @scala.inline
  def apply(edgeName: String, `type`: RANGE_ADD): RangeAddConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAddConfig]
  }
  @scala.inline
  implicit class RangeAddConfigOps[Self <: RangeAddConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RANGE_ADD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionInfo(value: js.Array[AnonFilters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionInfo")(js.undefined)
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
    @scala.inline
    def withRangeBehaviorsFunction1(value: /* connectionArgs */ StringDictionary[js.Any] => RangeOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehaviors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRangeBehaviors(value: RangeBehaviors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehaviors")(js.undefined)
        ret
    }
  }
  
}

