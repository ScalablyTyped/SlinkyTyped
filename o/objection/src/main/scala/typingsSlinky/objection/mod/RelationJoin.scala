package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationJoin extends js.Object {
  var from: String | Reference | (js.Array[String | Reference]) = js.native
  var through: js.UndefOr[RelationThrough] = js.native
  var to: String | Reference | (js.Array[String | Reference]) = js.native
}

object RelationJoin {
  @scala.inline
  def apply(
    from: String | Reference | (js.Array[String | Reference]),
    to: String | Reference | (js.Array[String | Reference])
  ): RelationJoin = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationJoin]
  }
  @scala.inline
  implicit class RelationJoinOps[Self <: RelationJoin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String | Reference | (js.Array[String | Reference])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String | Reference | (js.Array[String | Reference])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrough(value: RelationThrough): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(js.undefined)
        ret
    }
  }
  
}

