package typingsSlinky.jsonquery.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCondition[P] extends js.Object {
  @JSName("$all")
  var $all: js.Array[P] = js.native
  @JSName("$elemMatch")
  var $elemMatch: Partial[P] = js.native
  @JSName("$gt")
  var $gt: P = js.native
  @JSName("$gte")
  var $gte: P = js.native
  @JSName("$in")
  var $in: js.Array[P] = js.native
  @JSName("$lt")
  var $lt: P = js.native
  @JSName("$lte")
  var $lte: P = js.native
  @JSName("$mod")
  var $mod: js.Tuple2[Double, Double] = js.native
  @JSName("$ne")
  var $ne: P = js.native
  @JSName("$nin")
  var $nin: js.Array[P] = js.native
}

object BaseCondition {
  @scala.inline
  def apply[P](
    $all: js.Array[P],
    $elemMatch: Partial[P],
    $gt: P,
    $gte: P,
    $in: js.Array[P],
    $lt: P,
    $lte: P,
    $mod: js.Tuple2[Double, Double],
    $ne: P,
    $nin: js.Array[P]
  ): BaseCondition[P] = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $elemMatch = $elemMatch.asInstanceOf[js.Any], $gt = $gt.asInstanceOf[js.Any], $gte = $gte.asInstanceOf[js.Any], $in = $in.asInstanceOf[js.Any], $lt = $lt.asInstanceOf[js.Any], $lte = $lte.asInstanceOf[js.Any], $mod = $mod.asInstanceOf[js.Any], $ne = $ne.asInstanceOf[js.Any], $nin = $nin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCondition[P]]
  }
  @scala.inline
  implicit class BaseConditionOps[Self[p] <: BaseCondition[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def with$all(value: js.Array[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$elemMatch(value: Partial[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$gt(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$gte(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$in(value: js.Array[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$lt(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$lte(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$mod(value: js.Tuple2[Double, Double]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$ne(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$nin(value: js.Array[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

