package typingsSlinky.blueprintjsCore

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "createReactRef")
  @js.native
  def createReactRef[T](): ReactRef[T] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "ensureElement")
  @js.native
  def ensureElement(): js.UndefOr[ReactElement] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "ensureElement")
  @js.native
  def ensureElement(
    child: js.UndefOr[ReactElement],
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "ensureElement")
  @js.native
  def ensureElement(child: ReactElement): js.UndefOr[ReactElement] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "getDisplayName")
  @js.native
  def getDisplayName(ComponentClass: ReactComponentClass[js.Object]): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "getDisplayName")
  @js.native
  def getDisplayName(ComponentClass: INamed): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "isElementOfType")
  @js.native
  def isElementOfType[P](element: js.Any, ComponentType: ReactComponentClass[P]): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "isReactElement")
  @js.native
  def isReactElement[T](child: ReactElement): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "isReactNodeEmpty")
  @js.native
  def isReactNodeEmpty(): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "isReactNodeEmpty")
  @js.native
  def isReactNodeEmpty(node: js.UndefOr[ReactElement], skipArray: Boolean): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "isReactNodeEmpty")
  @js.native
  def isReactNodeEmpty(node: ReactElement): Boolean = js.native
  
  @js.native
  trait INamed extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object INamed {
    
    @scala.inline
    def apply(): INamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INamed]
    }
    
    @scala.inline
    implicit class INamedMutableBuilder[Self <: INamed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type LifecycleCompatPolyfill[P, T /* <: ReactComponentClass[P] */] = js.Function1[
    /* Comp */ T, 
    T with typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.LifecycleCompatPolyfill with TopLevel[T]
  ]
}
