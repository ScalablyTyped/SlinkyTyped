package typingsSlinky.reactMdPortal

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalPortalMod {
  
  object ConditionalPortal {
    
    @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal")
    @js.native
    def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      @scala.inline
      def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionalPortalProps extends RenderConditionalPortalProps {
    
    /**
      * This children to render.
      */
    var children: ReactElement | Null = js.native
  }
  object ConditionalPortalProps {
    
    @scala.inline
    def apply(): ConditionalPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalPortalProps]
    }
    
    @scala.inline
    implicit class ConditionalPortalPropsMutableBuilder[Self <: ConditionalPortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
    }
  }
  
  @js.native
  trait RenderConditionalPortalProps extends StObject {
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.native
    
    /**
      * @see {@link Portal#into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.native
    
    /**
      * @see {@link Portal#intoId}
      */
    var portalIntoId: js.UndefOr[String] = js.native
  }
  object RenderConditionalPortalProps {
    
    @scala.inline
    def apply(): RenderConditionalPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConditionalPortalProps]
    }
    
    @scala.inline
    implicit class RenderConditionalPortalPropsMutableBuilder[Self <: RenderConditionalPortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalInto(value: PortalInto): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "portalInto", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPortalIntoHTMLElement(value: HTMLElement): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalIntoId(value: String): Self = StObject.set(x, "portalIntoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalIntoIdUndefined: Self = StObject.set(x, "portalIntoId", js.undefined)
      
      @scala.inline
      def setPortalIntoNull: Self = StObject.set(x, "portalInto", null)
      
      @scala.inline
      def setPortalIntoUndefined: Self = StObject.set(x, "portalInto", js.undefined)
      
      @scala.inline
      def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
}
