package typingsSlinky.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectValueProps extends StObject {
  
  /**
    * The object to describe.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  
  var styles: js.UndefOr[js.Object] = js.native
}
object ObjectValueProps {
  
  @scala.inline
  def apply(): ObjectValueProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectValueProps]
  }
  
  @scala.inline
  implicit class ObjectValuePropsMutableBuilder[Self <: ObjectValueProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
