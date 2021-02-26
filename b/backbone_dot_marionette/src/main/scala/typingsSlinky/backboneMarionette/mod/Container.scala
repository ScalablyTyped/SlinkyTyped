package typingsSlinky.backboneMarionette.mod

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.underscore.mod.List
import typingsSlinky.underscore.mod.ListIterator
import typingsSlinky.underscore.mod.MemoIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "Container")
@js.native
class Container[TView] () extends StObject {
  
  /**
    * Find a view by it's cid.
    */
  def add(view: TView): Unit = js.native
  def add(view: TView, customIndex: Double): Unit = js.native
  
  /**
    * @see _.all
    */
  def all(iterator: ListIterator[TView, Boolean, List[TView]]): Boolean = js.native
  def all(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): Boolean = js.native
  
  /**
    * @see _.any
    */
  def any(iterator: ListIterator[TView, Boolean, List[TView]]): Boolean = js.native
  def any(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): Boolean = js.native
  
  /**
    * @see _.contains
    */
  def contains(value: TView): Boolean = js.native
  def contains(value: TView, fromIndex: Double): Boolean = js.native
  
  /**
    * @see _.detect
    */
  def detect(iterator: ListIterator[TView, Boolean, List[TView]]): js.UndefOr[Container[TView]] = js.native
  def detect(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.UndefOr[Container[TView]] = js.native
  
  /**
    * @see _.each
    */
  def each(iterator: ListIterator[TView, Unit, List[TView]]): Container[TView] = js.native
  def each(iterator: ListIterator[TView, Unit, List[TView]], context: js.Any): Container[TView] = js.native
  
  /**
    * @see _.every
    */
  def every(iterator: ListIterator[TView, Boolean, List[TView]]): Boolean = js.native
  def every(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): Boolean = js.native
  
  /**
    * @see _.filter
    */
  def filter(iterator: ListIterator[TView, Boolean, List[TView]]): js.Array[TView] = js.native
  def filter(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.Array[TView] = js.native
  
  /**
    * @see _.find
    */
  def find(iterator: ListIterator[TView, Boolean, List[TView]]): js.UndefOr[Container[TView]] = js.native
  def find(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.UndefOr[Container[TView]] = js.native
  
  /**
    * Find a view by it's cid.
    */
  def findByCid(cid: String): TView = js.native
  
  /**
    * Find by custom key.
    */
  def findByCustom(key: String): TView = js.native
  
  /**
    * Find by numeric index (unstable).
    */
  def findByIndex(index: Double): TView = js.native
  
  /**
    * Find a view by model.
    */
  def findByModel(model: Model[_, ModelSetOptions, js.Object]): TView = js.native
  
  /**
    * Find a view by model cid.
    */
  def findByModelCid(modelCid: String): TView = js.native
  
  /**
    * @see _.first
    */
  def first(): js.UndefOr[TView] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(iterator: ListIterator[TView, Unit, List[TView]]): Container[TView] = js.native
  def forEach(iterator: ListIterator[TView, Unit, List[TView]], context: js.Any): Container[TView] = js.native
  
  /**
    * @see _.include
    */
  def include(value: TView): Boolean = js.native
  def include(value: TView, fromIndex: Double): Boolean = js.native
  
  /**
    * @see _.initial
    */
  def initial(): js.Array[TView] = js.native
  def initial(n: Double): js.Array[TView] = js.native
  
  /**
    * @see _.invoke
    */
  def invoke(methodName: String, args: js.Any*): js.Any = js.native
  
  /**
    * @see _.isEmpty
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @see _.last
    */
  def last(n: Double): js.Array[TView] = js.native
  
  /**
    * @see _.map
    */
  def map[TResult](iterator: ListIterator[TView, TResult, List[TView]]): js.Array[TResult] = js.native
  def map[TResult](iterator: ListIterator[TView, TResult, List[TView]], context: js.Any): js.Array[TResult] = js.native
  
  /**
    * @see _.partition
    */
  def partition(iterator: ListIterator[TView, Boolean, List[TView]]): js.Array[js.Array[TView]] = js.native
  def partition(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.Array[js.Array[TView]] = js.native
  
  /**
    * @see _.pluck
    */
  def pluck(propertyName: String): js.Array[_] = js.native
  
  /**
    * @see _.reduce
    */
  def reduce[TResult](iterator: MemoIterator[TView, TResult, List[TView]]): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[TView, TResult, List[TView]], memo: TResult): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[TView, TResult, List[TView]], memo: TResult, context: js.Any): TResult = js.native
  def reduce[TResult](
    iterator: MemoIterator[TView, TResult, List[TView]],
    memo: js.UndefOr[scala.Nothing],
    context: js.Any
  ): TResult = js.native
  
  /**
    * @see _.reject
    */
  def reject(iterator: ListIterator[TView, Boolean, List[TView]]): js.Array[TView] = js.native
  def reject(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.Array[TView] = js.native
  
  /**
    * Find a view by it's cid.
    */
  def remove(view: TView): Unit = js.native
  
  /**
    * @see _.rest
    */
  def rest(): js.Array[TView] = js.native
  def rest(n: Double): js.Array[TView] = js.native
  
  /**
    * @see _.select
    */
  def select(iterator: ListIterator[TView, Boolean, List[TView]]): js.Array[TView] = js.native
  def select(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): js.Array[TView] = js.native
  
  /**
    * @see _.some
    */
  def some(iterator: ListIterator[TView, Boolean, List[TView]]): Boolean = js.native
  def some(iterator: ListIterator[TView, Boolean, List[TView]], context: js.Any): Boolean = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): js.Array[TView] = js.native
  
  /**
    * @see _.without
    */
  def without(values: TView*): js.Array[TView] = js.native
}
