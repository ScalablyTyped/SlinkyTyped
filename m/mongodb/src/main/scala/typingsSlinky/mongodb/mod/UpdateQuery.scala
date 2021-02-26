package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mongodb.anon.Type
import typingsSlinky.mongodb.mongodbBooleans.`true`
import typingsSlinky.mongodb.mongodbNumbers.`-1`
import typingsSlinky.mongodb.mongodbNumbers.`1`
import typingsSlinky.mongodb.mongodbStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQuery[TSchema] extends StObject {
  
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
  var $inc: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[NumericTypes], js.UndefOr[NumericTypes]]] = js.native
  
  @JSName("$max")
  var $max: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  
  @JSName("$min")
  var $min: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  
  @JSName("$mul")
  var $mul: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[NumericTypes], js.UndefOr[NumericTypes]]] = js.native
  
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
  implicit class UpdateQueryMutableBuilder[Self <: UpdateQuery[_], TSchema] (val x: Self with UpdateQuery[TSchema]) extends AnyVal {
    
    @scala.inline
    def set$addToSet(value: SetFields[TSchema]): Self = StObject.set(x, "$addToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$addToSetUndefined: Self = StObject.set(x, "$addToSet", js.undefined)
    
    @scala.inline
    def set$bit(value: StringDictionary[typingsSlinky.mongodb.mongodbStrings.UpdateQuery with TopLevel[js.Any]]): Self = StObject.set(x, "$bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitUndefined: Self = StObject.set(x, "$bit", js.undefined)
    
    @scala.inline
    def set$currentDate(value: OnlyFieldsOfType[TSchema, js.Date, `true` | Type]): Self = StObject.set(x, "$currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$currentDateUndefined: Self = StObject.set(x, "$currentDate", js.undefined)
    
    @scala.inline
    def set$inc(value: OnlyFieldsOfType[TSchema, js.UndefOr[NumericTypes], js.UndefOr[NumericTypes]]): Self = StObject.set(x, "$inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$incUndefined: Self = StObject.set(x, "$inc", js.undefined)
    
    @scala.inline
    def set$max(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
    
    @scala.inline
    def set$min(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
    
    @scala.inline
    def set$mul(value: OnlyFieldsOfType[TSchema, js.UndefOr[NumericTypes], js.UndefOr[NumericTypes]]): Self = StObject.set(x, "$mul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$mulUndefined: Self = StObject.set(x, "$mul", js.undefined)
    
    @scala.inline
    def set$pop(value: OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]): Self = StObject.set(x, "$pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popUndefined: Self = StObject.set(x, "$pop", js.undefined)
    
    @scala.inline
    def set$pull(value: PullOperator[TSchema]): Self = StObject.set(x, "$pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pullAll(value: PullAllOperator[TSchema]): Self = StObject.set(x, "$pullAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pullAllUndefined: Self = StObject.set(x, "$pullAll", js.undefined)
    
    @scala.inline
    def set$pullUndefined: Self = StObject.set(x, "$pull", js.undefined)
    
    @scala.inline
    def set$push(value: PushOperator[TSchema]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
    
    @scala.inline
    def set$rename(value: StringDictionary[String]): Self = StObject.set(x, "$rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$renameUndefined: Self = StObject.set(x, "$rename", js.undefined)
    
    @scala.inline
    def set$set(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsert(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$setOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsertUndefined: Self = StObject.set(x, "$setOnInsert", js.undefined)
    
    @scala.inline
    def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
    
    @scala.inline
    def set$unset(value: OnlyFieldsOfType[TSchema, _, _empty | `1` | `true`]): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$unsetUndefined: Self = StObject.set(x, "$unset", js.undefined)
  }
}
