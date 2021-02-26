package typingsSlinky.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Partial<std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/plural-rules.LDMLPluralRule, T>>, 'other'> & {  other :T} */
@js.native
trait LDMLPluralRuleMap[T] extends StObject {
  
  var few: js.UndefOr[T] = js.native
  
  var many: js.UndefOr[T] = js.native
  
  var one: js.UndefOr[T] = js.native
  
  var other: T = js.native
  
  var two: js.UndefOr[T] = js.native
  
  var zero: js.UndefOr[T] = js.native
}
object LDMLPluralRuleMap {
  
  @scala.inline
  def apply[T](other: T): LDMLPluralRuleMap[T] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDMLPluralRuleMap[T]]
  }
  
  @scala.inline
  implicit class LDMLPluralRuleMapMutableBuilder[Self <: LDMLPluralRuleMap[_], T] (val x: Self with LDMLPluralRuleMap[T]) extends AnyVal {
    
    @scala.inline
    def setFew(value: T): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
    
    @scala.inline
    def setMany(value: T): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    
    @scala.inline
    def setOne(value: T): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
    
    @scala.inline
    def setOther(value: T): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo(value: T): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
    
    @scala.inline
    def setZero(value: T): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
