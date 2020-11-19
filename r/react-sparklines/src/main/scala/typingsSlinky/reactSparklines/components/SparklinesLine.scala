package typingsSlinky.reactSparklines.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSparklines.mod.Point
import typingsSlinky.reactSparklines.mod.SparklinesLineProps
import typingsSlinky.reactSparklines.reactSparklinesStrings.click
import typingsSlinky.reactSparklines.reactSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklinesLine {
  
  @JSImport("react-sparklines", "SparklinesLine")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesLine] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMove(value: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Unit): this.type = set("onMouseMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SparklinesLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SparklinesLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
