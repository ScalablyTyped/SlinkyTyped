package typingsSlinky.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayFilters extends StObject {
  
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object ArrayFilters {
  
  @scala.inline
  def apply(): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFilters]
  }
  
  @scala.inline
  implicit class ArrayFiltersMutableBuilder[Self <: ArrayFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
