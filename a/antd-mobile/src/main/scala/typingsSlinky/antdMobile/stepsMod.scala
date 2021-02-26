package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.Direction
import typingsSlinky.antdMobile.stepsPropsTypeMod.StepsPropsType
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("antd-mobile/lib/steps", JSImport.Default)
  @js.native
  class default () extends Steps
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/steps", "default.Step")
    @js.native
    def Step: js.Any = js.native
    @scala.inline
    def Step_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/steps", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    @scala.inline
    def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Steps
    extends Component[StepsProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSteps(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSteps(): Unit = js.native
    
    var stepRefs: js.Array[_] = js.native
    
    var stepsRef: js.Any = js.native
  }
  
  @js.native
  trait StepsProps extends StepsPropsType {
    
    var direction: js.UndefOr[String] = js.native
    
    var iconPrefix: js.UndefOr[String] = js.native
    
    var labelPlacement: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[String] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(children: js.Array[_]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class StepsPropsMutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
