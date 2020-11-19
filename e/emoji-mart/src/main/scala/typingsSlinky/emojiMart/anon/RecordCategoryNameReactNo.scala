package typingsSlinky.emojiMart.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, (): react.react.ReactNode> */
@js.native
trait RecordCategoryNameReactNo extends js.Object {
  
  var activity: js.Function0[ReactElement] = js.native
  
  var custom: js.Function0[ReactElement] = js.native
  
  var flags: js.Function0[ReactElement] = js.native
  
  var foods: js.Function0[ReactElement] = js.native
  
  var nature: js.Function0[ReactElement] = js.native
  
  var objects: js.Function0[ReactElement] = js.native
  
  var people: js.Function0[ReactElement] = js.native
  
  var places: js.Function0[ReactElement] = js.native
  
  var recent: js.Function0[ReactElement] = js.native
  
  var search: js.Function0[ReactElement] = js.native
  
  var symbols: js.Function0[ReactElement] = js.native
}
object RecordCategoryNameReactNo {
  
  @scala.inline
  def apply(
    activity: () => ReactElement,
    custom: () => ReactElement,
    flags: () => ReactElement,
    foods: () => ReactElement,
    nature: () => ReactElement,
    objects: () => ReactElement,
    people: () => ReactElement,
    places: () => ReactElement,
    recent: () => ReactElement,
    search: () => ReactElement,
    symbols: () => ReactElement
  ): RecordCategoryNameReactNo = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), custom = js.Any.fromFunction0(custom), flags = js.Any.fromFunction0(flags), foods = js.Any.fromFunction0(foods), nature = js.Any.fromFunction0(nature), objects = js.Any.fromFunction0(objects), people = js.Any.fromFunction0(people), places = js.Any.fromFunction0(places), recent = js.Any.fromFunction0(recent), search = js.Any.fromFunction0(search), symbols = js.Any.fromFunction0(symbols))
    __obj.asInstanceOf[RecordCategoryNameReactNo]
  }
  
  @scala.inline
  implicit class RecordCategoryNameReactNoOps[Self <: RecordCategoryNameReactNo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivity(value: () => ReactElement): Self = this.set("activity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustom(value: () => ReactElement): Self = this.set("custom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: () => ReactElement): Self = this.set("flags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFoods(value: () => ReactElement): Self = this.set("foods", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNature(value: () => ReactElement): Self = this.set("nature", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjects(value: () => ReactElement): Self = this.set("objects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeople(value: () => ReactElement): Self = this.set("people", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaces(value: () => ReactElement): Self = this.set("places", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecent(value: () => ReactElement): Self = this.set("recent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: () => ReactElement): Self = this.set("search", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSymbols(value: () => ReactElement): Self = this.set("symbols", js.Any.fromFunction0(value))
  }
}
