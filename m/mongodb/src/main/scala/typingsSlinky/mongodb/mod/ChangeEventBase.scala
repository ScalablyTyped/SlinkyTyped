package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.AnonColl
import typingsSlinky.mongodb.AnonUid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventBase[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ResumeToken = js.native
  var clusterTime: typingsSlinky.bson.mod.Timestamp = js.native
  var lsid: js.UndefOr[AnonUid] = js.native
  /**
    * We leave this off the base type so that we can differentiate
    * by checking its value and get intelligent types on the other fields
    */
  // operationType: ChangeEventTypes;
  var ns: AnonColl = js.native
  var txnNumber: js.UndefOr[scala.Double] = js.native
}

object ChangeEventBase {
  @scala.inline
  def apply[TSchema](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, ns: AnonColl): ChangeEventBase[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventBase[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventBaseOps[Self[tschema] <: ChangeEventBase[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def with_id(value: ResumeToken): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterTime(value: typingsSlinky.bson.mod.Timestamp): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNs(value: AnonColl): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLsid(value: AnonUid): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLsid: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lsid")(js.undefined)
        ret
    }
    @scala.inline
    def withTxnNumber(value: scala.Double): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxnNumber: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txnNumber")(js.undefined)
        ret
    }
  }
  
}

