package typingsSlinky.reactDynamicNumber.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactDynamicNumber.mod.DynamicNumberProps
import typingsSlinky.reactDynamicNumber.mod.default
import typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.Space
import typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDynamicNumber {
  
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def fraction(value: Double): this.type = set("fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def integer(value: Double): this.type = set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separator(value: Dot | Comma): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thousand(value: Boolean | Space): this.type = set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double | _empty): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDynamicNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DynamicNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
