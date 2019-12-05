package typingsSlinky.plottable.plottableMod

import typingsSlinky.plottable.buildSrcCoreRenderControllerMod.Policy
import typingsSlinky.plottable.buildSrcCoreRenderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "RenderController")
@js.native
object RenderController extends js.Object {
  def flush(): Unit = js.native
  def registerToComputeLayout(component: typingsSlinky.plottable.buildSrcComponentsComponentMod.Component): Unit = js.native
  def registerToComputeLayoutAndRender(component: typingsSlinky.plottable.buildSrcComponentsComponentMod.Component): Unit = js.native
  def registerToRender(component: typingsSlinky.plottable.buildSrcComponentsComponentMod.Component): Unit = js.native
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
    var immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
    var timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
  }
  
}

