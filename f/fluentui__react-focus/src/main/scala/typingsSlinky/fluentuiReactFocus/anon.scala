package typingsSlinky.fluentuiReactFocus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentPath extends StObject {
    
    var componentPath: js.UndefOr[String] = js.native
  }
  object ComponentPath {
    
    @scala.inline
    def apply(): ComponentPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentPath]
    }
    
    @scala.inline
    implicit class ComponentPathMutableBuilder[Self <: ComponentPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentPath(value: String): Self = StObject.set(x, "componentPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentPathUndefined: Self = StObject.set(x, "componentPath", js.undefined)
    }
  }
}
