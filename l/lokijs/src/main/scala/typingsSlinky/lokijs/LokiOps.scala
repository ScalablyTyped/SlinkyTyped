package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiOps extends js.Object {
  // abstract/loose equality
  @JSName("$aeq")
  def $aeq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$and")
  def $and(a: js.Any, b: js.Any): Boolean = js.native
  /** ex : coll.find({'orderCount': {$between: [10, 50]}}); */
  @JSName("$between")
  def $between(a: js.Any, vals: js.Any): Boolean = js.native
  @JSName("$contains")
  def $contains(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsAny")
  def $containsAny(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsNone")
  def $containsNone(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$containsString")
  def $containsString(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$definedin")
  def $definedin(a: js.Any, b: js.Any): Boolean = js.native
  // date equality / loki abstract equality test
  @JSName("$dteq")
  def $dteq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$finite")
  def $finite(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$gt")
  def $gt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$gte")
  def $gte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$in")
  def $in(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jbetween")
  def $jbetween(a: js.Any, vals: js.Any): Boolean = js.native
  @JSName("$jgt")
  def $jgt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jgte")
  def $jgte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jlt")
  def $jlt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$jlte")
  def $jlte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$keyin")
  def $keyin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$len")
  def $len(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$lt")
  def $lt(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$lte")
  def $lte(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$ne")
  def $ne(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$nin")
  def $nin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$nkeyin")
  def $nkeyin(a: js.Any, b: js.Any): Boolean = js.native
  // field-level logical operators
  // a is the value in the collection
  // b is the nested query operation (for '$not')
  //   or an array of nested query operations (for '$and' and '$or')
  @JSName("$not")
  def $not(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$or")
  def $or(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$regex")
  def $regex(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$size")
  def $size(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$type")
  def $type(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$undefinedin")
  def $undefinedin(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$where")
  def $where(a: js.Any, b: js.Any): Boolean = js.native
}

object LokiOps {
  @scala.inline
  def apply(
    $aeq: (js.Any, js.Any) => Boolean,
    $and: (js.Any, js.Any) => Boolean,
    $between: (js.Any, js.Any) => Boolean,
    $contains: (js.Any, js.Any) => Boolean,
    $containsAny: (js.Any, js.Any) => Boolean,
    $containsNone: (js.Any, js.Any) => Boolean,
    $containsString: (js.Any, js.Any) => Boolean,
    $definedin: (js.Any, js.Any) => Boolean,
    $dteq: (js.Any, js.Any) => Boolean,
    $eq: (js.Any, js.Any) => Boolean,
    $finite: (js.Any, js.Any) => Boolean,
    $gt: (js.Any, js.Any) => Boolean,
    $gte: (js.Any, js.Any) => Boolean,
    $in: (js.Any, js.Any) => Boolean,
    $jbetween: (js.Any, js.Any) => Boolean,
    $jgt: (js.Any, js.Any) => Boolean,
    $jgte: (js.Any, js.Any) => Boolean,
    $jlt: (js.Any, js.Any) => Boolean,
    $jlte: (js.Any, js.Any) => Boolean,
    $keyin: (js.Any, js.Any) => Boolean,
    $len: (js.Any, js.Any) => Boolean,
    $lt: (js.Any, js.Any) => Boolean,
    $lte: (js.Any, js.Any) => Boolean,
    $ne: (js.Any, js.Any) => Boolean,
    $nin: (js.Any, js.Any) => Boolean,
    $nkeyin: (js.Any, js.Any) => Boolean,
    $not: (js.Any, js.Any) => Boolean,
    $or: (js.Any, js.Any) => Boolean,
    $regex: (js.Any, js.Any) => Boolean,
    $size: (js.Any, js.Any) => Boolean,
    $type: (js.Any, js.Any) => Boolean,
    $undefinedin: (js.Any, js.Any) => Boolean,
    $where: (js.Any, js.Any) => Boolean
  ): LokiOps = {
    val __obj = js.Dynamic.literal($aeq = js.Any.fromFunction2($aeq), $and = js.Any.fromFunction2($and), $between = js.Any.fromFunction2($between), $contains = js.Any.fromFunction2($contains), $containsAny = js.Any.fromFunction2($containsAny), $containsNone = js.Any.fromFunction2($containsNone), $containsString = js.Any.fromFunction2($containsString), $definedin = js.Any.fromFunction2($definedin), $dteq = js.Any.fromFunction2($dteq), $eq = js.Any.fromFunction2($eq), $finite = js.Any.fromFunction2($finite), $gt = js.Any.fromFunction2($gt), $gte = js.Any.fromFunction2($gte), $in = js.Any.fromFunction2($in), $jbetween = js.Any.fromFunction2($jbetween), $jgt = js.Any.fromFunction2($jgt), $jgte = js.Any.fromFunction2($jgte), $jlt = js.Any.fromFunction2($jlt), $jlte = js.Any.fromFunction2($jlte), $keyin = js.Any.fromFunction2($keyin), $len = js.Any.fromFunction2($len), $lt = js.Any.fromFunction2($lt), $lte = js.Any.fromFunction2($lte), $ne = js.Any.fromFunction2($ne), $nin = js.Any.fromFunction2($nin), $nkeyin = js.Any.fromFunction2($nkeyin), $not = js.Any.fromFunction2($not), $or = js.Any.fromFunction2($or), $regex = js.Any.fromFunction2($regex), $size = js.Any.fromFunction2($size), $type = js.Any.fromFunction2($type), $undefinedin = js.Any.fromFunction2($undefinedin), $where = js.Any.fromFunction2($where))
    __obj.asInstanceOf[LokiOps]
  }
  @scala.inline
  implicit class LokiOpsOps[Self <: LokiOps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$aeq(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$aeq")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$and(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$between(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$between")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$contains(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$containsAny(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$containsAny")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$containsNone(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$containsNone")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$containsString(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$containsString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$definedin(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$definedin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$dteq(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$dteq")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$eq(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$finite(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$finite")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$gt(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$gte(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$in(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$jbetween(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jbetween")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$jgt(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jgt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$jgte(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jgte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$jlt(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jlt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$jlte(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jlte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$keyin(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$keyin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$len(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$len")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$lt(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$lte(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$ne(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$nin(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$nkeyin(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nkeyin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$not(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$or(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$regex(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$size(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$type(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$undefinedin(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$undefinedin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$where(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

