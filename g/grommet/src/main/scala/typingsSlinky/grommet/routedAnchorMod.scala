package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.RoutedAnchorPropsOmitAnch
import typingsSlinky.grommet.grommetStrings.push
import typingsSlinky.grommet.grommetStrings.replace
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routedAnchorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RoutedAnchor", "RoutedAnchor")
  @js.native
  class RoutedAnchor protected ()
    extends Component[RoutedAnchorPropsOmitAnch, js.Object, js.Any] {
    def this(props: RoutedAnchorPropsOmitAnch) = this()
    def this(props: RoutedAnchorPropsOmitAnch, context: js.Any) = this()
  }
  @JSImport("grommet/components/RoutedAnchor", "RoutedAnchor")
  @js.native
  val RoutedAnchor: ReactComponentClass[RoutedAnchorPropsOmitAnch] = js.native
  
  @js.native
  trait RoutedAnchorProps extends StObject {
    
    var method: js.UndefOr[push | replace] = js.native
    
    var path: String = js.native
  }
  object RoutedAnchorProps {
    
    @scala.inline
    def apply(path: String): RoutedAnchorProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutedAnchorProps]
    }
    
    @scala.inline
    implicit class RoutedAnchorPropsMutableBuilder[Self <: RoutedAnchorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
