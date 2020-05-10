package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VakataStatic extends js.Object {
  var context: js.Any = js.native
  var dnd: js.Any = js.native
  var html: js.Any = js.native
  var search: js.Any = js.native
  var storage: js.Any = js.native
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
  implicit class VakataStaticOps[Self <: VakataStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray_filter(value: (js.Any, js.Any, js.Any, js.Array[_], js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array_filter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withArray_remove(value: (js.Array[_], Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array_remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withArray_remove_item(value: (js.Array[_], js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array_remove_item")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withArray_unique(value: js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array_unique")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributes(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

