package typingsSlinky.reactMathquill

import slinky.core.ReactComponentClass
import typingsSlinky.edtrIoMathquill.mod.Config
import typingsSlinky.edtrIoMathquill.mod.MQ
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mathquill", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @JSImport("react-mathquill", "addStyles")
  @js.native
  def addStyles(): Unit = js.native
  
  type MathQuill = ReactComponentClass[Props]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'span'>, 'onChange'> ]: react.react.ComponentProps<'span'>[P]} */ @js.native
  trait Props extends StObject {
    
    var config: js.UndefOr[Config] = js.native
    
    var latex: js.UndefOr[String] = js.native
    
    var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setLatex(value: String): Self = StObject.set(x, "latex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatexUndefined: Self = StObject.set(x, "latex", js.undefined)
      
      @scala.inline
      def setMathquillDidMount(value: /* mathField */ MQ => Unit): Self = StObject.set(x, "mathquillDidMount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMathquillDidMountUndefined: Self = StObject.set(x, "mathquillDidMount", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* mathField */ MQ => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
