package typingsSlinky.pouchdbFind.PouchDB.Find

import typingsSlinky.pouchdbFind.pouchdbFindStrings.`null`
import typingsSlinky.pouchdbFind.pouchdbFindStrings.`object`
import typingsSlinky.pouchdbFind.pouchdbFindStrings.array
import typingsSlinky.pouchdbFind.pouchdbFindStrings.boolean
import typingsSlinky.pouchdbFind.pouchdbFindStrings.number
import typingsSlinky.pouchdbFind.pouchdbFindStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionOperators extends js.Object {
  /** Matches an array value if it contains all the elements of the argument array. */
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ConditionOperators] = js.native
  /** Match fields equal to this one. */
  @JSName("$eq")
  var $eq: js.UndefOr[js.Any] = js.native
  /** True if the field should exist, false otherwise. */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  /** Match fields "greater than" this one. */
  @JSName("$gt")
  var $gt: js.UndefOr[js.Any] = js.native
  /** Match fields "greater than or equal to" this one. */
  @JSName("$gte")
  var $gte: js.UndefOr[js.Any] = js.native
  /** The document field must exist in the list provided. */
  @JSName("$in")
  var $in: js.UndefOr[js.Array[_]] = js.native
  /** Match fields "less than" this one. */
  @JSName("$lt")
  var $lt: js.UndefOr[js.Any] = js.native
  /** Match fields "less than or equal to" this one. */
  @JSName("$lte")
  var $lte: js.UndefOr[js.Any] = js.native
  /**
    * Divisor and Remainder are both positive or negative integers.
    * Non-integer values result in a 404 status.
    * Matches documents where (field % Divisor == Remainder) is true, and only when the document field is an integer.
    * [divisor, remainder]
    */
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Match fields not equal to this one. */
  @JSName("$ne")
  var $ne: js.UndefOr[js.Any] = js.native
  /** The document field must not exist in the list provided. */
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[_]] = js.native
  /** A regular expression pattern to match against the document field. Only matches when the field is a string value and matches the supplied regular expression. */
  @JSName("$regex")
  var $regex: js.UndefOr[String] = js.native
  /** Special condition to match the length of an array field in a document. Non-array fields cannot match this condition. */
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.native
  /** One of: "null", "boolean", "number", "string", "array", or "object". */
  @JSName("$type")
  var $type: js.UndefOr[`null` | boolean | number | string | array | `object`] = js.native
}

object ConditionOperators {
  @scala.inline
  def apply(): ConditionOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionOperators]
  }
  @scala.inline
  implicit class ConditionOperatorsOps[Self <: ConditionOperators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def with$elemMatch(value: ConditionOperators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$elemMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(js.undefined)
        ret
    }
    @scala.inline
    def with$eq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$eq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(js.undefined)
        ret
    }
    @scala.inline
    def with$exists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$exists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(js.undefined)
        ret
    }
    @scala.inline
    def with$gt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(js.undefined)
        ret
    }
    @scala.inline
    def with$gte(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(js.undefined)
        ret
    }
    @scala.inline
    def with$in(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(js.undefined)
        ret
    }
    @scala.inline
    def with$lt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(js.undefined)
        ret
    }
    @scala.inline
    def with$lte(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(js.undefined)
        ret
    }
    @scala.inline
    def with$mod(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$mod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(js.undefined)
        ret
    }
    @scala.inline
    def with$ne(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(js.undefined)
        ret
    }
    @scala.inline
    def with$nin(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(js.undefined)
        ret
    }
    @scala.inline
    def with$regex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$regex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: `null` | boolean | number | string | array | `object`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.undefined)
        ret
    }
  }
  
}

