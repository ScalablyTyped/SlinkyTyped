package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazyOptions extends StObject {
  
  /**
    * If true the schema generator will only be called once and the result will be cached.
    */
  var once: js.UndefOr[Boolean] = js.native
}
object LazyOptions {
  
  @scala.inline
  def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  
  @scala.inline
  implicit class LazyOptionsMutableBuilder[Self <: LazyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
