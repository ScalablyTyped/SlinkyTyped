package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenReactNode extends StObject {
  
  var children: ReactElement = js.native
  
  var key: Double = js.native
}
object ChildrenReactNode {
  
  @scala.inline
  def apply(key: Double): ChildrenReactNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenReactNode]
  }
  
  @scala.inline
  implicit class ChildrenReactNodeMutableBuilder[Self <: ChildrenReactNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
