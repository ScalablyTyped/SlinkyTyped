package typingsSlinky.reactRadioGroup

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactRadioGroup.anon.Value
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.`aria-checked`
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.`type`
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.name
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.role
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.value
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Radio extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "Radio")
    @js.native
    class ^ protected ()
      extends Component[RadioProps, js.Object, js.Any] {
      def this(props: RadioProps) = this()
      def this(props: RadioProps, context: js.Any) = this()
    }
    
    @JSImport("react-radio-group", "Radio")
    @js.native
    val ^ : ComponentClass[RadioProps, js.Object] = js.native
    
    type RadioProps = (Omit[
        InputHTMLAttributes[HTMLInputElement], 
        value | name | role | `type` | `aria-checked`
      ]) with Value
    
    type _To = ComponentClass[RadioProps, js.Object]
    
    /* This means you don't have to write `^`, but can instead just say `Radio.foo` */
    override def _to: ComponentClass[RadioProps, js.Object] = ^
  }
  
  object RadioGroup extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    class ^ protected ()
      extends Component[RadioGroupProps, js.Object, js.Any] {
      def this(props: RadioGroupProps) = this()
      def this(props: RadioGroupProps, context: js.Any) = this()
    }
    
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    val ^ : ComponentClass[RadioGroupProps, js.Object] = js.native
    
    type RadioGroupProps = (Omit[HTMLProps[_], onChange]) with typingsSlinky.reactRadioGroup.anon.Component
    
    type _To = ComponentClass[RadioGroupProps, js.Object]
    
    /* This means you don't have to write `^`, but can instead just say `RadioGroup.foo` */
    override def _to: ComponentClass[RadioGroupProps, js.Object] = ^
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
