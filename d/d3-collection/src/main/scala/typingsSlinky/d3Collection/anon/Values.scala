package typingsSlinky.d3Collection.anon

import typingsSlinky.d3Collection.mod.NestedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Values[Datum, RollupType] extends js.Object {
  var key: String = js.native
  var value: js.UndefOr[RollupType] = js.native
  var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.native
}

object Values {
  @scala.inline
  def apply[Datum, RollupType](key: String): Values[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[Datum, RollupType]]
  }
  @scala.inline
  implicit class ValuesOps[Self[datum, rolluptype] <: Values[datum, rolluptype], Datum, RollupType] (val x: Self[Datum, RollupType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Datum, RollupType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Datum, RollupType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Datum, RollupType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Datum, RollupType]) with Other]
    @scala.inline
    def withKey(value: String): Self[Datum, RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: RollupType): Self[Datum, RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[Datum, RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: (NestedArray[Datum, RollupType]) | js.Array[Datum]): Self[Datum, RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[Datum, RollupType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

