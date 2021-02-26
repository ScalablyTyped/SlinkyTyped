package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.baseui.helperMod.HelperStepsPropsT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableHelperSteps {
  
  @scala.inline
  def apply(index: Double, length: Double, onFinish: () => js.Any, onNext: () => js.Any, onPrev: () => js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[HelperStepsPropsT]))
  }
  
  @JSImport("baseui/helper", "UnstableHelperSteps")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HelperStepsPropsT): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
