package typingsSlinky.inputMoment.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inputMoment.mod.InputMomentProps
import typingsSlinky.inputMoment.mod.default
import typingsSlinky.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputMoment {
  
  @scala.inline
  def apply(moment: Moment): Builder = {
    val __props = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputMomentProps]))
  }
  
  @JSImport("input-moment", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minStep(value: Double): this.type = set("minStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextMonthIcon(value: String): this.type = set("nextMonthIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* m */ Moment => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSave(value: () => Unit): this.type = set("onSave", js.Any.fromFunction0(value))
    
    @scala.inline
    def prevMonthIcon(value: String): this.type = set("prevMonthIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputMomentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
