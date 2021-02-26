package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of one type of object.
  */
@js.native
trait IObjectCollection[T] extends StObject {
  
  /**
    * An array container for objects when a collection of objects is
    * returned.
    */
  var data: js.Array[T] = js.native
}
object IObjectCollection {
  
  @scala.inline
  def apply[T](data: js.Array[T]): IObjectCollection[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectCollection[T]]
  }
  
  @scala.inline
  implicit class IObjectCollectionMutableBuilder[Self <: IObjectCollection[_], T] (val x: Self with IObjectCollection[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
