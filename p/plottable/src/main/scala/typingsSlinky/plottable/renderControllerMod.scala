package typingsSlinky.plottable

import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
@js.native
object renderControllerMod extends js.Object {
  /* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plottable.plottableStrings.immediate
    - typingsSlinky.plottable.plottableStrings.animationFrame
    - typingsSlinky.plottable.plottableStrings.timeout
  */
  trait Policy extends js.Object
  
  def flush(): Unit = js.native
  def registerToComputeLayout(component: Component): Unit = js.native
  def registerToComputeLayoutAndRender(component: Component): Unit = js.native
  def registerToRender(component: Component): Unit = js.native
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
    var immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
    var timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
  }
  
}

