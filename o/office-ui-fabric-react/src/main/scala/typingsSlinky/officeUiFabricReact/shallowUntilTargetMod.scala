package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowUntilTargetMod {
  
  @JSImport("office-ui-fabric-react/lib/common/shallowUntilTarget", "shallowUntilTarget")
  @js.native
  def shallowUntilTarget[P, S](componentInstance: ReactElement, TargetComponent: String): ShallowWrapper[js.Object, js.Object, ReactComponentClass[js.Object]] = js.native
  @JSImport("office-ui-fabric-react/lib/common/shallowUntilTarget", "shallowUntilTarget")
  @js.native
  def shallowUntilTarget[P, S](componentInstance: ReactElement, TargetComponent: String, options: IShallowUntilTarget): ShallowWrapper[js.Object, js.Object, ReactComponentClass[js.Object]] = js.native
  
  @js.native
  trait IShallowRendererProps extends StObject {
    
    var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
    
    var lifecycleExperimental: js.UndefOr[Boolean] = js.native
  }
  object IShallowRendererProps {
    
    @scala.inline
    def apply(): IShallowRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShallowRendererProps]
    }
    
    @scala.inline
    implicit class IShallowRendererPropsMutableBuilder[Self <: IShallowRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
      
      @scala.inline
      def setLifecycleExperimental(value: Boolean): Self = StObject.set(x, "lifecycleExperimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleExperimentalUndefined: Self = StObject.set(x, "lifecycleExperimental", js.undefined)
    }
  }
  
  @js.native
  trait IShallowUntilTarget extends StObject {
    
    var maxTries: Double = js.native
    
    var shallowOptions: IShallowRendererProps = js.native
  }
  object IShallowUntilTarget {
    
    @scala.inline
    def apply(maxTries: Double, shallowOptions: IShallowRendererProps): IShallowUntilTarget = {
      val __obj = js.Dynamic.literal(maxTries = maxTries.asInstanceOf[js.Any], shallowOptions = shallowOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShallowUntilTarget]
    }
    
    @scala.inline
    implicit class IShallowUntilTargetMutableBuilder[Self <: IShallowUntilTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallowOptions(value: IShallowRendererProps): Self = StObject.set(x, "shallowOptions", value.asInstanceOf[js.Any])
    }
  }
}
