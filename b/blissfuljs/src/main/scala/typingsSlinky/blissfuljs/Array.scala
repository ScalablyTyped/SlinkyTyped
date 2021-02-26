package typingsSlinky.blissfuljs

import typingsSlinky.blissfuljs.BlissNS.BlissBindedArray
import typingsSlinky.blissfuljs.BlissNS.BlissCollectionArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends StObject {
  
  @JSName("_")
  var _underscore: BlissBindedArray[T] with BlissCollectionArray[T] = js.native
}
object Array {
  
  @scala.inline
  def apply[T](_underscore: BlissBindedArray[T] with BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array[_], T] (val x: Self with Array[T]) extends AnyVal {
    
    @scala.inline
    def set_underscore(value: BlissBindedArray[T] with BlissCollectionArray[T]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
