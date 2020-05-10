package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.AnonGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySelector[T] extends js.Object {
  // Array
  // TODO: define better types for $all and $elemMatch
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.native
  // Bitwise
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Any] = js.native
  // Comparison
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.native
  // Element
  /**
    * When `true`, `$exists` matches the documents that contain the field,
    * including documents where the field value is null.
    */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  // Evaluation
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.native
  // Geospatial
  // TODO: define better types for geo queries
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[AnonGeometry] = js.native
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[T] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[T] = js.native
  @JSName("$in")
  var $in: js.UndefOr[js.Array[T]] = js.native
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[T] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[T] = js.native
  @JSName("$maxDistance")
  var $maxDistance: js.UndefOr[scala.Double] = js.native
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.native
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.native
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.native
  // Logical
  @JSName("$not")
  var $not: js.UndefOr[QuerySelector[T] | js.RegExp] = js.native
  @JSName("$options")
  var $options: js.UndefOr[String] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[js.RegExp | String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.native
  @JSName("$type")
  var $type: js.UndefOr[BSONType | BSONTypeAlias] = js.native
}

object QuerySelector {
  @scala.inline
  def apply[T](): QuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySelector[T]]
  }
  @scala.inline
  implicit class QuerySelectorOps[Self[t] <: QuerySelector[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$all(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def with$bitsAllClear(value: BitwiseQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAllClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bitsAllClear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAllClear")(js.undefined)
        ret
    }
    @scala.inline
    def with$bitsAllSet(value: BitwiseQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAllSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bitsAllSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAllSet")(js.undefined)
        ret
    }
    @scala.inline
    def with$bitsAnyClear(value: BitwiseQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAnyClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bitsAnyClear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAnyClear")(js.undefined)
        ret
    }
    @scala.inline
    def with$bitsAnySet(value: BitwiseQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAnySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bitsAnySet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bitsAnySet")(js.undefined)
        ret
    }
    @scala.inline
    def with$elemMatch(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$elemMatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(js.undefined)
        ret
    }
    @scala.inline
    def with$eq(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$eq: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(js.undefined)
        ret
    }
    @scala.inline
    def with$exists(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$exists: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(js.undefined)
        ret
    }
    @scala.inline
    def with$expr(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$expr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expr")(js.undefined)
        ret
    }
    @scala.inline
    def with$geoIntersects(value: AnonGeometry): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$geoIntersects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$geoIntersects: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$geoIntersects")(js.undefined)
        ret
    }
    @scala.inline
    def with$geoWithin(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$geoWithin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$geoWithin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$geoWithin")(js.undefined)
        ret
    }
    @scala.inline
    def with$gt(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(js.undefined)
        ret
    }
    @scala.inline
    def with$gte(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gte: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(js.undefined)
        ret
    }
    @scala.inline
    def with$in(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$in: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(js.undefined)
        ret
    }
    @scala.inline
    def with$jsonSchema(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jsonSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$jsonSchema: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$jsonSchema")(js.undefined)
        ret
    }
    @scala.inline
    def with$lt(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(js.undefined)
        ret
    }
    @scala.inline
    def with$lte(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lte: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(js.undefined)
        ret
    }
    @scala.inline
    def with$maxDistance(value: scala.Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$maxDistance: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$maxDistance")(js.undefined)
        ret
    }
    @scala.inline
    def with$mod(value: js.Tuple2[scala.Double, scala.Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$mod: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(js.undefined)
        ret
    }
    @scala.inline
    def with$ne(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ne: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(js.undefined)
        ret
    }
    @scala.inline
    def with$near(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$near")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$near: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$near")(js.undefined)
        ret
    }
    @scala.inline
    def with$nearSphere(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nearSphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nearSphere: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nearSphere")(js.undefined)
        ret
    }
    @scala.inline
    def with$nin(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(js.undefined)
        ret
    }
    @scala.inline
    def with$notRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$not(value: QuerySelector[T] | js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$not: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(js.undefined)
        ret
    }
    @scala.inline
    def with$options(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$options: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$options")(js.undefined)
        ret
    }
    @scala.inline
    def with$regexRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$regex(value: js.RegExp | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$regex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: scala.Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: BSONType | BSONTypeAlias): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$type: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.undefined)
        ret
    }
  }
  
}

