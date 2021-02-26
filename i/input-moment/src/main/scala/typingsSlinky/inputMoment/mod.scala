package typingsSlinky.inputMoment

import slinky.core.ReactComponentClass
import typingsSlinky.inputMoment.anon.ReadonlyInputMomentProps
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("input-moment", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[InputMomentProps, js.Object, js.Any] {
    def this(props: ReadonlyInputMomentProps) = this()
  }
  
  type InputMoment = ReactComponentClass[InputMomentProps]
  
  @js.native
  trait InputMomentProps extends StObject {
    
    var hourStep: js.UndefOr[Double] = js.native
    
    var minStep: js.UndefOr[Double] = js.native
    
    var moment: Moment = js.native
    
    var nextMonthIcon: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[OnChangeListener] = js.native
    
    var onSave: js.UndefOr[OnSaveListener] = js.native
    
    var prevMonthIcon: js.UndefOr[String] = js.native
  }
  object InputMomentProps {
    
    @scala.inline
    def apply(moment: Moment): InputMomentProps = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMomentProps]
    }
    
    @scala.inline
    implicit class InputMomentPropsMutableBuilder[Self <: InputMomentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinStepUndefined: Self = StObject.set(x, "minStep", js.undefined)
      
      @scala.inline
      def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthIcon(value: String): Self = StObject.set(x, "nextMonthIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthIconUndefined: Self = StObject.set(x, "nextMonthIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* m */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSave(value: () => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      @scala.inline
      def setPrevMonthIcon(value: String): Self = StObject.set(x, "prevMonthIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthIconUndefined: Self = StObject.set(x, "prevMonthIcon", js.undefined)
    }
  }
  
  type OnChangeListener = js.Function1[/* m */ Moment, Unit]
  
  type OnSaveListener = js.Function0[Unit]
}
