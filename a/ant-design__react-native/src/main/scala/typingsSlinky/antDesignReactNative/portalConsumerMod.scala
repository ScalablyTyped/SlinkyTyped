package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.portalHostMod.PortalMethods
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalConsumerMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  class default () extends PortalConsumer
  
  @js.native
  trait PortalConsumer
    extends Component[PortalConsumerProps, js.Object, js.Any] {
    
    var _key: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalConsumer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalConsumer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalConsumer(): Unit = js.native
  }
  
  @js.native
  trait PortalConsumerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var manager: PortalMethods = js.native
  }
  object PortalConsumerProps {
    
    @scala.inline
    def apply(manager: PortalMethods): PortalConsumerProps = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalConsumerProps]
    }
    
    @scala.inline
    implicit class PortalConsumerPropsMutableBuilder[Self <: PortalConsumerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setManager(value: PortalMethods): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
}
