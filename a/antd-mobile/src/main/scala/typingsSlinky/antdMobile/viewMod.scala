package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antdMobile.anon.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("antd-mobile/lib/view", JSImport.Default)
  @js.native
  class default () extends View
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/view", "default.defaultProps")
    @js.native
    def defaultProps: Component = js.native
    @scala.inline
    def defaultProps_=(x: Component): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait View
    extends typingsSlinky.react.mod.Component[ViewProps[HTMLDivElement], js.Any, js.Any]
  
  @js.native
  trait ViewProps[T] extends HTMLProps[T] {
    
    var Component: js.UndefOr[String] = js.native
  }
  object ViewProps {
    
    @scala.inline
    def apply[T](): ViewProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewProps[T]]
    }
    
    @scala.inline
    implicit class ViewPropsMutableBuilder[Self <: ViewProps[_], T] (val x: Self with ViewProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    }
  }
}
