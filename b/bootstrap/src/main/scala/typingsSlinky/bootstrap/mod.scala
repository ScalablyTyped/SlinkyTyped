package typingsSlinky.bootstrap

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.alertMod.default
import typingsSlinky.bootstrap.anon.PartialOptions
import typingsSlinky.bootstrap.anon.PartialOptionsAnimation
import typingsSlinky.bootstrap.anon.PartialOptionsBackdrop
import typingsSlinky.bootstrap.anon.PartialOptionsBoundary
import typingsSlinky.bootstrap.anon.PartialOptionsMethod
import typingsSlinky.bootstrap.anon.PartialOptionsParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bootstrap", "Alert")
  @js.native
  class Alert protected () extends default {
    def this(element: Element) = this()
  }
  object Alert {
    
    @JSImport("bootstrap", "Alert.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.alertMod.Alert.Events with String] = js.native
      
      /* "close.bs.alert" */ val close: typingsSlinky.bootstrap.alertMod.Alert.Events.close with String = js.native
      
      /* "closed.bs.alert" */ val closed: typingsSlinky.bootstrap.alertMod.Alert.Events.closed with String = js.native
    }
    
    /**
      * Static method which allows you to get the alert instance associated to a
      * DOM element, you can use it like this: getInstance(alert)
      */
    /* static member */
    @JSImport("bootstrap", "Alert.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.alertMod.Alert = js.native
  }
  
  @JSImport("bootstrap", "Button")
  @js.native
  class Button protected ()
    extends typingsSlinky.bootstrap.buttonMod.default {
    def this(element: Element) = this()
  }
  
  @JSImport("bootstrap", "Carousel")
  @js.native
  class Carousel protected ()
    extends typingsSlinky.bootstrap.carouselMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptions) = this()
  }
  object Carousel {
    
    @JSImport("bootstrap", "Carousel.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.carouselMod.Carousel.Events with String] = js.native
      
      /* "slid.bs.carousel" */ val slid: typingsSlinky.bootstrap.carouselMod.Carousel.Events.slid with String = js.native
      
      /* "slide.bs.carousel" */ val slide: typingsSlinky.bootstrap.carouselMod.Carousel.Events.slide with String = js.native
    }
    
    /**
      * Static method which allows you to get the carousel instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap", "Carousel.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.carouselMod.Carousel = js.native
    @JSImport("bootstrap", "Carousel.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptions): typingsSlinky.bootstrap.carouselMod.Carousel = js.native
  }
  
  @JSImport("bootstrap", "Collapse")
  @js.native
  class Collapse protected ()
    extends typingsSlinky.bootstrap.collapseMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsParent) = this()
  }
  object Collapse {
    
    @JSImport("bootstrap", "Collapse.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.collapseMod.Collapse.Events with String] = js.native
      
      /* "hidden.bs.collapse" */ val hidden: typingsSlinky.bootstrap.collapseMod.Collapse.Events.hidden with String = js.native
      
      /* "hide.bs.collapse" */ val hide: typingsSlinky.bootstrap.collapseMod.Collapse.Events.hide with String = js.native
      
      /* "show.bs.collapse" */ val show: typingsSlinky.bootstrap.collapseMod.Collapse.Events.show with String = js.native
      
      /* "shown.bs.collapse" */ val shown: typingsSlinky.bootstrap.collapseMod.Collapse.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the collapse instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap", "Collapse.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.collapseMod.Collapse = js.native
    @JSImport("bootstrap", "Collapse.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsParent): typingsSlinky.bootstrap.collapseMod.Collapse = js.native
  }
  
  @JSImport("bootstrap", "Dropdown")
  @js.native
  class Dropdown protected ()
    extends typingsSlinky.bootstrap.dropdownMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsBoundary) = this()
  }
  object Dropdown {
    
    @JSImport("bootstrap", "Dropdown.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.dropdownMod.Dropdown.Events with String] = js.native
      
      /* "hidden.bs.dropdown" */ val hidden: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.hidden with String = js.native
      
      /* "hide.bs.dropdown" */ val hide: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.hide with String = js.native
      
      /* "show.bs.dropdown" */ val show: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.show with String = js.native
      
      /* "shown.bs.dropdown" */ val shown: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the dropdown instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap", "Dropdown.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.dropdownMod.Dropdown = js.native
    @JSImport("bootstrap", "Dropdown.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsBoundary): typingsSlinky.bootstrap.dropdownMod.Dropdown = js.native
  }
  
  @JSImport("bootstrap", "Modal")
  @js.native
  class Modal protected ()
    extends typingsSlinky.bootstrap.modalMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsBackdrop) = this()
  }
  object Modal {
    
    @JSImport("bootstrap", "Modal.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.modalMod.Modal.Events with String] = js.native
      
      /* "hidden.bs.modal" */ val hidden: typingsSlinky.bootstrap.modalMod.Modal.Events.hidden with String = js.native
      
      /* "hide.bs.modal" */ val hide: typingsSlinky.bootstrap.modalMod.Modal.Events.hide with String = js.native
      
      /* "hidePrevented.bs.modal" */ val hidePrevented: typingsSlinky.bootstrap.modalMod.Modal.Events.hidePrevented with String = js.native
      
      /* "show.bs.modal" */ val show: typingsSlinky.bootstrap.modalMod.Modal.Events.show with String = js.native
      
      /* "shown.bs.modal" */ val shown: typingsSlinky.bootstrap.modalMod.Modal.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element
      */
    /* static member */
    @JSImport("bootstrap", "Modal.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.modalMod.Modal = js.native
    @JSImport("bootstrap", "Modal.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsBackdrop): typingsSlinky.bootstrap.modalMod.Modal = js.native
  }
  
  @JSImport("bootstrap", "Popover")
  @js.native
  class Popover protected ()
    extends typingsSlinky.bootstrap.popoverMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsAnimation) = this()
  }
  object Popover {
    
    @JSImport("bootstrap", "Popover.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.popoverMod.Popover.Events with String] = js.native
      
      /* "hidden.bs.popover" */ val hidden: typingsSlinky.bootstrap.popoverMod.Popover.Events.hidden with String = js.native
      
      /* "hide.bs.popover" */ val hide: typingsSlinky.bootstrap.popoverMod.Popover.Events.hide with String = js.native
      
      /* "inserted.bs.popover" */ val inserted: typingsSlinky.bootstrap.popoverMod.Popover.Events.inserted with String = js.native
      
      /* "show.bs.popover" */ val show: typingsSlinky.bootstrap.popoverMod.Popover.Events.show with String = js.native
      
      /* "shown.bs.popover" */ val shown: typingsSlinky.bootstrap.popoverMod.Popover.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the popover instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap", "Popover.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.popoverMod.Popover = js.native
    @JSImport("bootstrap", "Popover.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsAnimation): typingsSlinky.bootstrap.popoverMod.Popover = js.native
  }
  
  @JSImport("bootstrap", "ScrollSpy")
  @js.native
  class ScrollSpy protected ()
    extends typingsSlinky.bootstrap.scrollspyMod.default {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsMethod) = this()
  }
  object ScrollSpy {
    
    @JSImport("bootstrap", "ScrollSpy.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events with String] = js.native
      
      /* "activate.bs.scrollspy" */ val activate: typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events.activate with String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap", "ScrollSpy.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.scrollspyMod.ScrollSpy = js.native
    @JSImport("bootstrap", "ScrollSpy.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsMethod): typingsSlinky.bootstrap.scrollspyMod.ScrollSpy = js.native
  }
  
  @JSImport("bootstrap", "Tab")
  @js.native
  class Tab protected ()
    extends typingsSlinky.bootstrap.tabMod.default {
    def this(element: Element) = this()
  }
  object Tab {
    
    @JSImport("bootstrap", "Tab.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.tabMod.Tab.Events with String] = js.native
      
      /* "hidden.bs.tab" */ val hidden: typingsSlinky.bootstrap.tabMod.Tab.Events.hidden with String = js.native
      
      /* "hide.bs.tab" */ val hide: typingsSlinky.bootstrap.tabMod.Tab.Events.hide with String = js.native
      
      /* "show.bs.tab" */ val show: typingsSlinky.bootstrap.tabMod.Tab.Events.show with String = js.native
      
      /* "shown.bs.tab" */ val shown: typingsSlinky.bootstrap.tabMod.Tab.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element
      */
    /* static member */
    @JSImport("bootstrap", "Tab.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.tabMod.Tab = js.native
  }
  
  @JSImport("bootstrap", "Toast")
  @js.native
  class Toast protected ()
    extends typingsSlinky.bootstrap.toastMod.default {
    def this(element: Element) = this()
  }
  object Toast {
    
    @JSImport("bootstrap", "Toast.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.toastMod.Toast.Events with String] = js.native
      
      /* "hidden.bs.toast" */ val hidden: typingsSlinky.bootstrap.toastMod.Toast.Events.hidden with String = js.native
      
      /* "hide.bs.toast" */ val hide: typingsSlinky.bootstrap.toastMod.Toast.Events.hide with String = js.native
      
      /* "show.bs.toast" */ val show: typingsSlinky.bootstrap.toastMod.Toast.Events.show with String = js.native
      
      /* "shown.bs.toast" */ val shown: typingsSlinky.bootstrap.toastMod.Toast.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap", "Toast.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.toastMod.Toast = js.native
  }
  
  @JSImport("bootstrap", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends typingsSlinky.bootstrap.tooltipMod.default {
    def this(element: Element) = this()
  }
  object Tooltip {
    
    @JSImport("bootstrap", "Tooltip.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.tooltipMod.Tooltip.Events with String] = js.native
      
      /* "hidden.bs.tooltip" */ val hidden: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.hidden with String = js.native
      
      /* "hide.bs.tooltip" */ val hide: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.hide with String = js.native
      
      /* "inserted.bs.tooltip" */ val inserted: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.inserted with String = js.native
      
      /* "show.bs.tooltip" */ val show: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.show with String = js.native
      
      /* "shown.bs.tooltip" */ val shown: typingsSlinky.bootstrap.tooltipMod.Tooltip.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap", "Tooltip.getInstance")
    @js.native
    def getInstance(element: Element): typingsSlinky.bootstrap.tooltipMod.Tooltip = js.native
  }
}
