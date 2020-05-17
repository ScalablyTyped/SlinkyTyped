package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mongodb.anon.Type
import typingsSlinky.mongodb.mongodbBooleans.`true`
import typingsSlinky.mongodb.mongodbNumbers.`-1`
import typingsSlinky.mongodb.mongodbNumbers.`1`
import typingsSlinky.mongodb.mongodbStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQuery[TSchema] extends js.Object {
  /** https://docs.mongodb.com/manual/reference/operator/update-array/ */
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[SetFields[TSchema]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/update-bitwise/ */
  @JSName("$bit")
  var $bit: js.UndefOr[
    StringDictionary[typingsSlinky.mongodb.mongodbStrings.UpdateQuery with TopLevel[js.Any]]
  ] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/update-field/ */
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[OnlyFieldsOfType[TSchema, js.Date, `true` | Type]] = js.native
  @JSName("$inc")
  var $inc: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.native
  @JSName("$max")
  var $max: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$min")
  var $min: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$mul")
  var $mul: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.native
  @JSName("$pop")
  var $pop: js.UndefOr[OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]] = js.native
  @JSName("$pull")
  var $pull: js.UndefOr[PullOperator[TSchema]] = js.native
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[PullAllOperator[TSchema]] = js.native
  @JSName("$push")
  var $push: js.UndefOr[PushOperator[TSchema]] = js.native
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[String]] = js.native
  @JSName("$set")
  var $set: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$unset")
  var $unset: js.UndefOr[OnlyFieldsOfType[TSchema, _, _empty | `1` | `true`]] = js.native
}

object UpdateQuery {
  @scala.inline
  def apply[TSchema](): UpdateQuery[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQuery[TSchema]]
  }
  @scala.inline
  implicit class UpdateQueryOps[Self[tschema] <: UpdateQuery[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def with$addToSet(value: SetFields[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$addToSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$addToSet: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$addToSet")(js.undefined)
        ret
    }
    @scala.inline
    def with$bit(value: StringDictionary[typingsSlinky.mongodb.mongodbStrings.UpdateQuery with TopLevel[js.Any]]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$bit: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$bit")(js.undefined)
        ret
    }
    @scala.inline
    def with$currentDate(value: OnlyFieldsOfType[TSchema, js.Date, `true` | Type]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$currentDate: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def with$inc(value: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$inc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$inc: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$inc")(js.undefined)
        ret
    }
    @scala.inline
    def with$max(value: MatchKeysAndValues[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$max: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(js.undefined)
        ret
    }
    @scala.inline
    def with$min(value: MatchKeysAndValues[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$min: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(js.undefined)
        ret
    }
    @scala.inline
    def with$mul(value: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$mul: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mul")(js.undefined)
        ret
    }
    @scala.inline
    def with$pop(value: OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pop: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pop")(js.undefined)
        ret
    }
    @scala.inline
    def with$pull(value: PullOperator[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pull: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pull")(js.undefined)
        ret
    }
    @scala.inline
    def with$pullAll(value: PullAllOperator[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pullAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pullAll: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pullAll")(js.undefined)
        ret
    }
    @scala.inline
    def with$push(value: PushOperator[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$push: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(js.undefined)
        ret
    }
    @scala.inline
    def with$rename(value: StringDictionary[String]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$rename: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$rename")(js.undefined)
        ret
    }
    @scala.inline
    def with$set(value: MatchKeysAndValues[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$set: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(js.undefined)
        ret
    }
    @scala.inline
    def with$setOnInsert(value: MatchKeysAndValues[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$setOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$setOnInsert: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$setOnInsert")(js.undefined)
        ret
    }
    @scala.inline
    def with$unset(value: OnlyFieldsOfType[TSchema, _, _empty | `1` | `true`]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$unset: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unset")(js.undefined)
        ret
    }
  }
  
}

