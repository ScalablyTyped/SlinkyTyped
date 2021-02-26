package typingsSlinky.meteor.anon

import typingsSlinky.meteor.Mongo.ArraysOrEach
import typingsSlinky.meteor.Mongo.CurrentDateModifier
import typingsSlinky.meteor.Mongo.Dictionary
import typingsSlinky.meteor.Mongo.ElementsOf
import typingsSlinky.meteor.Mongo.PartialMapTo
import typingsSlinky.meteor.Mongo.PushModifier
import typingsSlinky.meteor.meteorNumbers.`-1`
import typingsSlinky.meteor.meteorNumbers.`1`
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentDate[T] extends StObject {
  
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
  var $unset: js.UndefOr[
    (PartialMapTo[T, String | Boolean | `1` | typingsSlinky.meteor.meteorNumbers.`0`]) with Dictionary[_]
  ] = js.native
}
object CurrentDate {
  
  @scala.inline
  def apply[T](): CurrentDate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDate[T]]
  }
  
  @scala.inline
  implicit class CurrentDateMutableBuilder[Self <: CurrentDate[_], T] (val x: Self with CurrentDate[T]) extends AnyVal {
    
    @scala.inline
    def set$addToSet(value: ArraysOrEach[T] with Dictionary[_]): Self = StObject.set(x, "$addToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$addToSetUndefined: Self = StObject.set(x, "$addToSet", js.undefined)
    
    @scala.inline
    def set$currentDate(
      value: (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
    ): Self = StObject.set(x, "$currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$currentDateUndefined: Self = StObject.set(x, "$currentDate", js.undefined)
    
    @scala.inline
    def set$inc(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self = StObject.set(x, "$inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$incUndefined: Self = StObject.set(x, "$inc", js.undefined)
    
    @scala.inline
    def set$max(value: (PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
    
    @scala.inline
    def set$min(value: (PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
    
    @scala.inline
    def set$mul(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self = StObject.set(x, "$mul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$mulUndefined: Self = StObject.set(x, "$mul", js.undefined)
    
    @scala.inline
    def set$pop(value: (PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])): Self = StObject.set(x, "$pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popUndefined: Self = StObject.set(x, "$pop", js.undefined)
    
    @scala.inline
    def set$pull(value: ElementsOf[T] with Dictionary[_]): Self = StObject.set(x, "$pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pullAll(value: Partial[T] with Dictionary[_]): Self = StObject.set(x, "$pullAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pullAllUndefined: Self = StObject.set(x, "$pullAll", js.undefined)
    
    @scala.inline
    def set$pullUndefined: Self = StObject.set(x, "$pull", js.undefined)
    
    @scala.inline
    def set$push(value: PushModifier[T] with Dictionary[_]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
    
    @scala.inline
    def set$rename(value: (PartialMapTo[T, String]) with Dictionary[String]): Self = StObject.set(x, "$rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$renameUndefined: Self = StObject.set(x, "$rename", js.undefined)
    
    @scala.inline
    def set$set(value: Partial[T] with Dictionary[_]): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsert(value: Partial[T] with Dictionary[_]): Self = StObject.set(x, "$setOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsertUndefined: Self = StObject.set(x, "$setOnInsert", js.undefined)
    
    @scala.inline
    def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
    
    @scala.inline
    def set$unset(
      value: (PartialMapTo[T, String | Boolean | `1` | typingsSlinky.meteor.meteorNumbers.`0`]) with Dictionary[_]
    ): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$unsetUndefined: Self = StObject.set(x, "$unset", js.undefined)
  }
}
