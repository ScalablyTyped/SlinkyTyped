package typingsSlinky.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VakataStatic extends StObject {
  
  /**
    * filter array
    */
  def array_filter(c: js.Any, a: js.Any, b: js.Any, d: js.Array[_], e: js.Any): js.Array[_] = js.native
  
  /**
    * remove item from array
    */
  def array_remove(array: js.Array[_], from: Double): js.Array[_] = js.native
  
  /**
    * remove item from array
    */
  def array_remove_item(array: js.Array[_], item: js.Any): js.Array[_] = js.native
  
  /**
    * returns array with unique elements
    */
  def array_unique(array: js.Array[_]): js.Array[_] = js.native
  
  /**
    * collect attributes
    */
  def attributes(node: js.Any, with_values: js.Any): js.Any = js.native
  
  var context: js.Any = js.native
  
  var dnd: js.Any = js.native
  
  var html: js.Any = js.native
  
  var search: js.Any = js.native
  
  var storage: js.Any = js.native
}
object VakataStatic {
  
  @scala.inline
  def apply(
    array_filter: (js.Any, js.Any, js.Any, js.Array[_], js.Any) => js.Array[_],
    array_remove: (js.Array[_], Double) => js.Array[_],
    array_remove_item: (js.Array[_], js.Any) => js.Array[_],
    array_unique: js.Array[_] => js.Array[_],
    attributes: (js.Any, js.Any) => js.Any,
    context: js.Any,
    dnd: js.Any,
    html: js.Any,
    search: js.Any,
    storage: js.Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(array_filter = js.Any.fromFunction5(array_filter), array_remove = js.Any.fromFunction2(array_remove), array_remove_item = js.Any.fromFunction2(array_remove_item), array_unique = js.Any.fromFunction1(array_unique), attributes = js.Any.fromFunction2(attributes), context = context.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VakataStatic]
  }
  
  @scala.inline
  implicit class VakataStaticMutableBuilder[Self <: VakataStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray_filter(value: (js.Any, js.Any, js.Any, js.Array[_], js.Any) => js.Array[_]): Self = StObject.set(x, "array_filter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setArray_remove(value: (js.Array[_], Double) => js.Array[_]): Self = StObject.set(x, "array_remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setArray_remove_item(value: (js.Array[_], js.Any) => js.Array[_]): Self = StObject.set(x, "array_remove_item", js.Any.fromFunction2(value))
    
    @scala.inline
    def setArray_unique(value: js.Array[_] => js.Array[_]): Self = StObject.set(x, "array_unique", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributes(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd(value: js.Any): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: js.Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
