package typingsSlinky.fluentuiDomUtilities

import typingsSlinky.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.Array[IVirtualElement] = js.native
    
    var parent: js.UndefOr[IVirtualElement] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: js.Array[IVirtualElement]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[IVirtualElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: IVirtualElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: IVirtualElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
