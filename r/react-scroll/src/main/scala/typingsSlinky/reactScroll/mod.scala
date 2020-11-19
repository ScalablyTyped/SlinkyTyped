package typingsSlinky.reactScroll

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactScroll.anon.Smooth
import typingsSlinky.reactScroll.buttonMod.ButtonProps
import typingsSlinky.reactScroll.elementMod.ElementProps
import typingsSlinky.reactScroll.linkMod.LinkProps
import typingsSlinky.reactScroll.scrollElementMod.ScrollElementProps
import typingsSlinky.reactScroll.scrollEventsMod.Events.ScrollEvent
import typingsSlinky.reactScroll.scrollLinkMod.ScrollLinkProps
import typingsSlinky.reactScroll.scrollSpyMod.ScrollSpy
import typingsSlinky.reactScroll.scrollerMod.Scroller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-scroll", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def ScrollElement[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollElementProps[P]] = js.native
  
  def ScrollLink[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollLinkProps[P]] = js.native
  def ScrollLink[P](component: ReactComponentClass[P], customScroller: Scroller): ReactComponentClass[ScrollLinkProps[P]] = js.native
  
  val scrollSpy: ScrollSpy = js.native
  
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Element ()
    extends Component[ElementProps, js.Object, js.Any]
  
  @js.native
  object Events extends js.Object {
    
    val scrollEvent: ScrollEvent = js.native
  }
  
  @js.native
  object Helpers extends js.Object {
    
    def Element(component: js.Any): js.Any = js.native
    
    def Scroll(component: js.Any): js.Any = js.native
    def Scroll(component: js.Any, customScroller: js.Any): js.Any = js.native
  }
  
  @js.native
  class Link ()
    extends Component[LinkProps, js.Object, js.Any]
  
  @js.native
  object animateScroll extends js.Object {
    
    def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = js.native
    
    def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = js.native
    
    def scrollMore(toY: Double): Unit = js.native
    def scrollMore(toY: Double, options: js.Any): Unit = js.native
    
    def scrollTo(toY: Double): Unit = js.native
    def scrollTo(toY: Double, options: js.Any): Unit = js.native
    
    def scrollToBottom(): Unit = js.native
    def scrollToBottom(options: js.Any): Unit = js.native
    
    def scrollToTop(): Unit = js.native
    def scrollToTop(options: js.Any): Unit = js.native
  }
  
  @js.native
  object scroller extends js.Object {
    
    def get(name: String): js.Any = js.native
    
    def getActiveLink(): String = js.native
    
    def register(name: String, element: js.Any): Unit = js.native
    
    def scrollTo(to: String, props: js.Any): Unit = js.native
    
    def setActiveLink(link: String): Unit = js.native
    
    def unmount(): Unit = js.native
    
    def unregister(name: String): Unit = js.native
  }
}
