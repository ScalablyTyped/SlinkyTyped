package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.stickyStickyMod.Sticky
import typingsSlinky.react.mod.Props
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyTypesMod {
  
  @js.native
  sealed trait StickyPositionType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky.types", "StickyPositionType")
  @js.native
  object StickyPositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StickyPositionType with Double] = js.native
    
    @js.native
    sealed trait Both extends StickyPositionType
    /* 0 */ val Both: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Both with Double = js.native
    
    @js.native
    sealed trait Footer extends StickyPositionType
    /* 2 */ val Footer: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Footer with Double = js.native
    
    @js.native
    sealed trait Header extends StickyPositionType
    /* 1 */ val Header: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Header with Double = js.native
  }
  
  @js.native
  trait IStickyProps extends Props[Sticky] {
    
    /**
      * Gets ref to component interface.
      */
    var componentRef: js.UndefOr[IRefObject[IStickyProps]] = js.native
    
    /**
      * If true, then match scrolling position of placeholder element in Sticky.
      * @defaultvalue true
      */
    var isScrollSynced: js.UndefOr[Boolean] = js.native
    
    /**
      * color to apply as 'background-color' style for sticky element.
      */
    var stickyBackgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Class name to apply to the sticky element if component is sticky.
      */
    var stickyClassName: js.UndefOr[String] = js.native
    
    /**
      * Region to render sticky component in.
      * @defaultvalue Both
      */
    var stickyPosition: js.UndefOr[StickyPositionType] = js.native
  }
  object IStickyProps {
    
    @scala.inline
    def apply(): IStickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStickyProps]
    }
    
    @scala.inline
    implicit class IStickyPropsMutableBuilder[Self <: IStickyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IStickyProps]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IStickyProps | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IStickyProps]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setIsScrollSynced(value: Boolean): Self = StObject.set(x, "isScrollSynced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollSyncedUndefined: Self = StObject.set(x, "isScrollSynced", js.undefined)
      
      @scala.inline
      def setStickyBackgroundColor(value: String): Self = StObject.set(x, "stickyBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyBackgroundColorUndefined: Self = StObject.set(x, "stickyBackgroundColor", js.undefined)
      
      @scala.inline
      def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      @scala.inline
      def setStickyPosition(value: StickyPositionType): Self = StObject.set(x, "stickyPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyPositionUndefined: Self = StObject.set(x, "stickyPosition", js.undefined)
    }
  }
}
