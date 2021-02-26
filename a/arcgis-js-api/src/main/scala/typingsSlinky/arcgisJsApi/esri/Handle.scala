package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle extends Object {
  
  /**
    * Removes the handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#Handle)
    */
  def remove(): Unit = js.native
}
object Handle {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    remove: () => Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit class HandleMutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
