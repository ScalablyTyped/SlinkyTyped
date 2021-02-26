package typingsSlinky.reactScroll

import slinky.core.ReactComponentClass
import typingsSlinky.reactScroll.anon.Smooth
import typingsSlinky.reactScroll.buttonMod.default
import typingsSlinky.reactScroll.scrollElementMod.ScrollElementProps
import typingsSlinky.reactScroll.scrollEventsMod.Events.ScrollEvent
import typingsSlinky.reactScroll.scrollLinkMod.ScrollLinkProps
import typingsSlinky.reactScroll.scrollSpyMod.ScrollSpy
import typingsSlinky.reactScroll.scrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMod {
  
  @JSImport("react-scroll/modules", "Button")
  @js.native
  class Button () extends default
  
  @JSImport("react-scroll/modules", "Element")
  @js.native
  class Element ()
    extends typingsSlinky.reactScroll.elementMod.default
  
  object Events {
    
    @JSImport("react-scroll/modules", "Events.scrollEvent")
    @js.native
    val scrollEvent: ScrollEvent = js.native
  }
  
  object Helpers {
    
    @JSImport("react-scroll/modules", "Helpers.Element")
    @js.native
    def Element(component: js.Any): js.Any = js.native
    
    @JSImport("react-scroll/modules", "Helpers.Scroll")
    @js.native
    def Scroll(component: js.Any): js.Any = js.native
    @JSImport("react-scroll/modules", "Helpers.Scroll")
    @js.native
    def Scroll(component: js.Any, customScroller: js.Any): js.Any = js.native
  }
  
  @JSImport("react-scroll/modules", "Link")
  @js.native
  class Link ()
    extends typingsSlinky.reactScroll.linkMod.default
  
  @JSImport("react-scroll/modules", "ScrollElement")
  @js.native
  def ScrollElement[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollElementProps[P]] = js.native
  
  @JSImport("react-scroll/modules", "ScrollLink")
  @js.native
  def ScrollLink[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollLinkProps[P]] = js.native
  @JSImport("react-scroll/modules", "ScrollLink")
  @js.native
  def ScrollLink[P](component: ReactComponentClass[P], customScroller: Scroller): ReactComponentClass[ScrollLinkProps[P]] = js.native
  
  object animateScroll {
    
    @JSImport("react-scroll/modules", "animateScroll.animateTopScroll")
    @js.native
    def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "animateScroll.getAnimationType")
    @js.native
    def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = js.native
    
    @JSImport("react-scroll/modules", "animateScroll.scrollMore")
    @js.native
    def scrollMore(toY: Double): Unit = js.native
    @JSImport("react-scroll/modules", "animateScroll.scrollMore")
    @js.native
    def scrollMore(toY: Double, options: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "animateScroll.scrollTo")
    @js.native
    def scrollTo(toY: Double): Unit = js.native
    @JSImport("react-scroll/modules", "animateScroll.scrollTo")
    @js.native
    def scrollTo(toY: Double, options: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "animateScroll.scrollToBottom")
    @js.native
    def scrollToBottom(): Unit = js.native
    @JSImport("react-scroll/modules", "animateScroll.scrollToBottom")
    @js.native
    def scrollToBottom(options: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "animateScroll.scrollToTop")
    @js.native
    def scrollToTop(): Unit = js.native
    @JSImport("react-scroll/modules", "animateScroll.scrollToTop")
    @js.native
    def scrollToTop(options: js.Any): Unit = js.native
  }
  
  @JSImport("react-scroll/modules", "scrollSpy")
  @js.native
  val scrollSpy: ScrollSpy = js.native
  
  object scroller {
    
    @JSImport("react-scroll/modules", "scroller.get")
    @js.native
    def get(name: String): js.Any = js.native
    
    @JSImport("react-scroll/modules", "scroller.getActiveLink")
    @js.native
    def getActiveLink(): String = js.native
    
    @JSImport("react-scroll/modules", "scroller.register")
    @js.native
    def register(name: String, element: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "scroller.scrollTo")
    @js.native
    def scrollTo(to: String, props: js.Any): Unit = js.native
    
    @JSImport("react-scroll/modules", "scroller.setActiveLink")
    @js.native
    def setActiveLink(link: String): Unit = js.native
    
    @JSImport("react-scroll/modules", "scroller.unmount")
    @js.native
    def unmount(): Unit = js.native
    
    @JSImport("react-scroll/modules", "scroller.unregister")
    @js.native
    def unregister(name: String): Unit = js.native
  }
}
