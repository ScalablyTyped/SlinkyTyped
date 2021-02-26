package typingsSlinky.reactLazylog

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactLazylog.anon.ClientHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollFollowMod {
  
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  class default protected () extends ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: js.Any) = this()
  }
  
  @JSImport("react-lazylog/build/ScrollFollow", "ScrollFollow")
  @js.native
  class ScrollFollow protected ()
    extends Component[ScrollFollowProps, js.Object, js.Any] {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: js.Any) = this()
  }
  
  @js.native
  trait ScrollFollowProps extends StObject {
    
    def render(props: ScrollFollowRenderProps): ReactElement = js.native
    
    var startFollowing: js.UndefOr[Boolean] = js.native
  }
  object ScrollFollowProps {
    
    @scala.inline
    def apply(render: ScrollFollowRenderProps => ReactElement): ScrollFollowProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[ScrollFollowProps]
    }
    
    @scala.inline
    implicit class ScrollFollowPropsMutableBuilder[Self <: ScrollFollowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: ScrollFollowRenderProps => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartFollowing(value: Boolean): Self = StObject.set(x, "startFollowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFollowingUndefined: Self = StObject.set(x, "startFollowing", js.undefined)
    }
  }
  
  @js.native
  trait ScrollFollowRenderProps extends StObject {
    
    var follow: Boolean = js.native
    
    def onScroll(args: ClientHeight): Unit = js.native
    
    def startFollowing(): Unit = js.native
    
    def stopFollowing(): Unit = js.native
  }
  object ScrollFollowRenderProps {
    
    @scala.inline
    def apply(
      follow: Boolean,
      onScroll: ClientHeight => Unit,
      startFollowing: () => Unit,
      stopFollowing: () => Unit
    ): ScrollFollowRenderProps = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
      __obj.asInstanceOf[ScrollFollowRenderProps]
    }
    
    @scala.inline
    implicit class ScrollFollowRenderPropsMutableBuilder[Self <: ScrollFollowRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: ClientHeight => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartFollowing(value: () => Unit): Self = StObject.set(x, "startFollowing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopFollowing(value: () => Unit): Self = StObject.set(x, "stopFollowing", js.Any.fromFunction0(value))
    }
  }
}
