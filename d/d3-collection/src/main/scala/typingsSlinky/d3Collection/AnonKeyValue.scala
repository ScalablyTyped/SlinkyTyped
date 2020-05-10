package typingsSlinky.d3Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyValue[RollupType] extends js.Object {
  var key: String = js.native
  var value: js.UndefOr[RollupType] = js.native
  var values: js.Any = js.native
}

object AnonKeyValue {
  @scala.inline
  def apply[RollupType](key: String, values: js.Any): AnonKeyValue[RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyValue[RollupType]]
  }
  @scala.inline
  implicit class AnonKeyValueOps[Self[rolluptype] <: AnonKeyValue[rolluptype], RollupType] (val x: Self[RollupType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RollupType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RollupType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RollupType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RollupType] with Other]
    @scala.inline
    def withKey(value: String): Self[RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self[RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: RollupType): Self[RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

