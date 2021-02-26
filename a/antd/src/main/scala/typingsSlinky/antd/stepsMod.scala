package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.progressProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Steps", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepsProps] = js.native
  
  @js.native
  trait StepsProps extends ProgressProps {
    
    @JSName("steps")
    var steps_StepsProps: Double = js.native
    
    @JSName("strokeColor")
    var strokeColor_StepsProps: js.UndefOr[String] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(steps: Double): StepsProps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class StepsPropsMutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StepsProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepsMod.foo` */
  override def _to: ReactComponentClass[StepsProps] = default
}
