package typingsSlinky.meteor

import typingsSlinky.meteor.Mongo.ArraysOrEach
import typingsSlinky.meteor.Mongo.CurrentDateModifier
import typingsSlinky.meteor.Mongo.Dictionary
import typingsSlinky.meteor.Mongo.ElementsOf
import typingsSlinky.meteor.Mongo.PartialMapTo
import typingsSlinky.meteor.Mongo.PushModifier
import typingsSlinky.meteor.meteorNumbers.`-1`
import typingsSlinky.meteor.meteorNumbers.`0`
import typingsSlinky.meteor.meteorNumbers.`1`
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddToSet[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[ArraysOrEach[T] with Dictionary[_]] = js.native
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
  ] = js.native
  @JSName("$inc")
  var $inc: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$max")
  var $max: js.UndefOr[(PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])] = js.native
  @JSName("$min")
  var $min: js.UndefOr[(PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])] = js.native
  @JSName("$mul")
  var $mul: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$pop")
  var $pop: js.UndefOr[(PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])] = js.native
  @JSName("$pull")
  var $pull: js.UndefOr[ElementsOf[T] with Dictionary[_]] = js.native
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$push")
  var $push: js.UndefOr[PushModifier[T] with Dictionary[_]] = js.native
  @JSName("$rename")
  var $rename: js.UndefOr[(PartialMapTo[T, String]) with Dictionary[String]] = js.native
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$unset")
  var $unset: js.UndefOr[(PartialMapTo[T, String | Boolean | `1` | `0`]) with Dictionary[_]] = js.native
}

object AnonAddToSet {
  @scala.inline
  def apply[T](): AnonAddToSet[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddToSet[T]]
  }
  @scala.inline
  implicit class AnonAddToSetOps[Self[t] <: AnonAddToSet[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$addToSet(value: ArraysOrEach[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$addToSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$addToSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$addToSet")(js.undefined)
        ret
    }
    @scala.inline
    def with$currentDate(
      value: (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$currentDate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def with$inc(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$inc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$inc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$inc")(js.undefined)
        ret
    }
    @scala.inline
    def with$max(value: (PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$max: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(js.undefined)
        ret
    }
    @scala.inline
    def with$min(value: (PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$min: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(js.undefined)
        ret
    }
    @scala.inline
    def with$mul(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$mul: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mul")(js.undefined)
        ret
    }
    @scala.inline
    def with$pop(value: (PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pop")(js.undefined)
        ret
    }
    @scala.inline
    def with$pull(value: ElementsOf[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pull")(js.undefined)
        ret
    }
    @scala.inline
    def with$pullAll(value: Partial[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pullAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$pullAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pullAll")(js.undefined)
        ret
    }
    @scala.inline
    def with$push(value: PushModifier[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$push: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(js.undefined)
        ret
    }
    @scala.inline
    def with$rename(value: (PartialMapTo[T, String]) with Dictionary[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$rename: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$rename")(js.undefined)
        ret
    }
    @scala.inline
    def with$set(value: Partial[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$set: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(js.undefined)
        ret
    }
    @scala.inline
    def with$setOnInsert(value: Partial[T] with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$setOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$setOnInsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$setOnInsert")(js.undefined)
        ret
    }
    @scala.inline
    def with$unset(value: (PartialMapTo[T, String | Boolean | `1` | `0`]) with Dictionary[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$unset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unset")(js.undefined)
        ret
    }
  }
  
}

