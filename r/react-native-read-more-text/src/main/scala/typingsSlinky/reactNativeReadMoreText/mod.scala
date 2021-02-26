package typingsSlinky.reactNativeReadMoreText

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReadMoreProps, js.Object, js.Any]
  
  type ReadMore = ReactComponentClass[ReadMoreProps]
  
  @js.native
  trait ReadMoreProps extends StObject {
    
    var children: ReactElement = js.native
    
    var numberOfLines: Double = js.native
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.native
    
    def renderRevealedFooter(onPress: js.Function0[Unit]): ReactElement = js.native
    
    def renderTruncatedFooter(onPress: js.Function0[Unit]): ReactElement = js.native
  }
  object ReadMoreProps {
    
    @scala.inline
    def apply(
      numberOfLines: Double,
      renderRevealedFooter: js.Function0[Unit] => ReactElement,
      renderTruncatedFooter: js.Function0[Unit] => ReactElement
    ): ReadMoreProps = {
      val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
      __obj.asInstanceOf[ReadMoreProps]
    }
    
    @scala.inline
    implicit class ReadMorePropsMutableBuilder[Self <: ReadMoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setRenderRevealedFooter(value: js.Function0[Unit] => ReactElement): Self = StObject.set(x, "renderRevealedFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTruncatedFooter(value: js.Function0[Unit] => ReactElement): Self = StObject.set(x, "renderTruncatedFooter", js.Any.fromFunction1(value))
    }
  }
}
