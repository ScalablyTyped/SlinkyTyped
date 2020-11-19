package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.navInterfaceMod.NavComponentWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
@js.native
object viewControllerMod extends js.Object {
  
  val VIEW_STATE_ATTACHED: /* 2 */ Double = js.native
  
  val VIEW_STATE_DESTROYED: /* 3 */ Double = js.native
  
  val VIEW_STATE_NEW: /* 1 */ Double = js.native
  
  def convertToView(page: js.Any): ViewController | Null = js.native
  def convertToView(page: js.Any, params: ComponentProps[Null]): ViewController | Null = js.native
  
  def convertToViews(pages: js.Array[NavComponentWithProps[_]]): js.Array[ViewController] = js.native
  
  def matches(view: js.UndefOr[scala.Nothing], id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  
  @js.native
  class ViewController protected () extends js.Object {
    def this(component: js.Any) = this()
    def this(component: js.Any, params: ComponentProps[Null]) = this()
    
    /**
      * DOM WRITE
      */
    def _destroy(): Unit = js.native
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
    
    var component: js.Any = js.native
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    def init(container: HTMLElement): js.Promise[Unit] = js.native
    
    var nav: js.UndefOr[js.Any] = js.native
    
    var params: js.UndefOr[ComponentProps[Null]] = js.native
    
    var state: Double = js.native
  }
}
