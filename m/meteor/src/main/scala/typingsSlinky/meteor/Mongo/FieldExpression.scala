package typingsSlinky.meteor.Mongo

import typingsSlinky.meteor.AnonCaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldExpression[T] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[js.Array[T]] = js.native
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Any] = js.native
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.native
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.native
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  @JSName("$expr")
  var $expr: js.UndefOr[FieldExpression[T]] = js.native
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Any] = js.native
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Any] = js.native
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
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[Double]] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.native
  @JSName("$near")
  var $near: js.UndefOr[js.Any] = js.native
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Any] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.native
  @JSName("$not")
  var $not: js.UndefOr[FieldExpression[T]] = js.native
  @JSName("$options")
  var $options: js.UndefOr[String] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[js.RegExp | String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.native
  @JSName("$text")
  var $text: js.UndefOr[AnonCaseSensitive] = js.native
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.native
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.native
}

object FieldExpression {
  @scala.inline
  def apply[T](): FieldExpression[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldExpression[T]]
  }
  @scala.inline
  implicit class FieldExpressionOps[Self[t] <: FieldExpression[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$all(value: js.Array[T]): Self[T] = {
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
    def with$bitsAllClear(value: js.Any): Self[T] = {
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
    def with$bitsAllSet(value: js.Any): Self[T] = {
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
    def with$bitsAnyClear(value: js.Any): Self[T] = {
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
    def with$bitsAnySet(value: js.Any): Self[T] = {
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
    def with$comment(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$comment: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$comment")(js.undefined)
        ret
    }
    @scala.inline
    def with$elemMatch(value: FieldExpression[T] | Query[T]): Self[T] = {
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
    def with$expr(value: FieldExpression[T]): Self[T] = {
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
    def with$geoIntersects(value: js.Any): Self[T] = {
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
    def with$geoWithin(value: js.Any): Self[T] = {
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
    def with$mod(value: js.Array[Double]): Self[T] = {
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
    def with$near(value: js.Any): Self[T] = {
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
    def with$nearSphere(value: js.Any): Self[T] = {
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
    def with$not(value: FieldExpression[T]): Self[T] = {
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
    def with$size(value: Double): Self[T] = {
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
    def with$text(value: AnonCaseSensitive): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$text: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: js.Array[BsonType] | BsonType): Self[T] = {
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
    @scala.inline
    def with$where(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$where: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(js.undefined)
        ret
    }
  }
  
}

