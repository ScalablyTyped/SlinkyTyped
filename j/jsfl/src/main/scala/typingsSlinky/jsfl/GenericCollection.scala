package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericCollection[T] extends StObject {
  
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ]
  ): js.Any = js.native
  
  var elements: js.Array[T] = js.native
  
  def randomize(info: js.Any): GenericCollection[T] = js.native
  
  def rename(pattern: String): GenericCollection[T] = js.native
  
  def select(): GenericCollection[T] = js.native
  
  def toGrid(x: Double, y: Double): GenericCollection[T] = js.native
  
  def update(): GenericCollection[T] = js.native
}
object GenericCollection {
  
  @scala.inline
  def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ] => js.Any,
    elements: js.Array[T],
    randomize: js.Any => GenericCollection[T],
    rename: String => GenericCollection[T],
    select: () => GenericCollection[T],
    toGrid: (Double, Double) => GenericCollection[T],
    update: () => GenericCollection[T]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), elements = elements.asInstanceOf[js.Any], randomize = js.Any.fromFunction1(randomize), rename = js.Any.fromFunction1(rename), select = js.Any.fromFunction0(select), toGrid = js.Any.fromFunction2(toGrid), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[GenericCollection[T]]
  }
  
  @scala.inline
  implicit class GenericCollectionMutableBuilder[Self <: GenericCollection[_], T] (val x: Self with GenericCollection[T]) extends AnyVal {
    
    @scala.inline
    def setEach(
      value: js.Function3[
          /* element */ T, 
          /* index */ js.UndefOr[Double], 
          /* elements */ js.UndefOr[js.Array[T]], 
          Unit
        ] => js.Any
    ): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElements(value: js.Array[T]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: T*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setRandomize(value: js.Any => GenericCollection[T]): Self = StObject.set(x, "randomize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRename(value: String => GenericCollection[T]): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: () => GenericCollection[T]): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToGrid(value: (Double, Double) => GenericCollection[T]): Self = StObject.set(x, "toGrid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: () => GenericCollection[T]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
