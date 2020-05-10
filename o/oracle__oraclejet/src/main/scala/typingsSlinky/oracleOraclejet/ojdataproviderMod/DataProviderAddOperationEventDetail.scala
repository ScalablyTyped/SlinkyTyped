package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderAddOperationEventDetail[K, D] extends DataProviderOperationEventDetail[K, D] {
  var addBeforeKeys: js.UndefOr[js.Array[K]] = js.native
  var parentKeys: js.UndefOr[js.Array[K]] = js.native
}

object DataProviderAddOperationEventDetail {
  @scala.inline
  def apply[K, D](keys: Set[K]): DataProviderAddOperationEventDetail[K, D] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderAddOperationEventDetail[K, D]]
  }
  @scala.inline
  implicit class DataProviderAddOperationEventDetailOps[Self[k, d] <: DataProviderAddOperationEventDetail[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAddBeforeKeys(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBeforeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBeforeKeys: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBeforeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withParentKeys(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentKeys: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKeys")(js.undefined)
        ret
    }
  }
  
}

