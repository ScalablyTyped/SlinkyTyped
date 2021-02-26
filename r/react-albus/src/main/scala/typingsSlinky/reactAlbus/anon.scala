package typingsSlinky.reactAlbus

import slinky.core.facade.ReactElement
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardContextRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends WizardContextRenderProps {
    
    def children(wizard: WizardContext): ReactElement = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: WizardContext => ReactElement): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: WizardContext => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Render extends WizardContextRenderProps {
    
    var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactElement]] = js.native
  }
  object Render {
    
    @scala.inline
    def apply(): Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: /* wizard */ WizardContext => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
