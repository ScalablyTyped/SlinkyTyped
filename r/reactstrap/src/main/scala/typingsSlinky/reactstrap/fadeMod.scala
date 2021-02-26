package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeMod {
  
  @JSImport("reactstrap/lib/Fade", JSImport.Default)
  @js.native
  class default ()
    extends Component[FadeProps, js.Object, js.Any]
  
  type Fade = ReactComponentClass[FadeProps]
  
  @js.native
  trait FadeProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var baseClass: js.UndefOr[String] = js.native
    
    var baseClassIn: js.UndefOr[String] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLeave: js.UndefOr[js.Function0[Unit]] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
    
    var transitionAppear: js.UndefOr[Boolean] = js.native
    
    var transitionAppearTimeout: js.UndefOr[Double] = js.native
    
    var transitionEnter: js.UndefOr[Boolean] = js.native
    
    var transitionEnterTimeout: js.UndefOr[Double] = js.native
    
    var transitionLeave: js.UndefOr[Boolean] = js.native
    
    var transitionLeaveTimeout: js.UndefOr[Double] = js.native
  }
  object FadeProps {
    
    @scala.inline
    def apply(): FadeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeProps]
    }
    
    @scala.inline
    implicit class FadePropsMutableBuilder[Self <: FadeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassIn(value: String): Self = StObject.set(x, "baseClassIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassInUndefined: Self = StObject.set(x, "baseClassIn", js.undefined)
      
      @scala.inline
      def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnLeave(value: () => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAppearTimeout(value: Double): Self = StObject.set(x, "transitionAppearTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAppearTimeoutUndefined: Self = StObject.set(x, "transitionAppearTimeout", js.undefined)
      
      @scala.inline
      def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
      
      @scala.inline
      def setTransitionEnter(value: Boolean): Self = StObject.set(x, "transitionEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEnterTimeout(value: Double): Self = StObject.set(x, "transitionEnterTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEnterTimeoutUndefined: Self = StObject.set(x, "transitionEnterTimeout", js.undefined)
      
      @scala.inline
      def setTransitionEnterUndefined: Self = StObject.set(x, "transitionEnter", js.undefined)
      
      @scala.inline
      def setTransitionLeave(value: Boolean): Self = StObject.set(x, "transitionLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionLeaveTimeout(value: Double): Self = StObject.set(x, "transitionLeaveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionLeaveTimeoutUndefined: Self = StObject.set(x, "transitionLeaveTimeout", js.undefined)
      
      @scala.inline
      def setTransitionLeaveUndefined: Self = StObject.set(x, "transitionLeave", js.undefined)
    }
  }
}
