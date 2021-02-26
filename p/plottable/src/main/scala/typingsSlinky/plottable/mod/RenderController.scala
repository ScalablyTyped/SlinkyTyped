package typingsSlinky.plottable.mod

import typingsSlinky.plottable.plottableStrings.animationFrame
import typingsSlinky.plottable.plottableStrings.immediate
import typingsSlinky.plottable.plottableStrings.timeout
import typingsSlinky.plottable.renderControllerMod.Policy
import typingsSlinky.plottable.renderPolicyMod.IRenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderController {
  
  object Policy {
    
    @JSImport("plottable", "RenderController.Policy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "RenderController.Policy.animationFrame")
    @js.native
    def animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
    @scala.inline
    def animationFrame_=(x: animationFrame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "RenderController.Policy.immediate")
    @js.native
    def immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
    @scala.inline
    def immediate_=(x: immediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "RenderController.Policy.timeout")
    @js.native
    def timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
    @scala.inline
    def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "RenderController.flush")
  @js.native
  def flush(): Unit = js.native
  
  @JSImport("plottable", "RenderController.registerToComputeLayout")
  @js.native
  def registerToComputeLayout(component: typingsSlinky.plottable.componentMod.Component): Unit = js.native
  
  @JSImport("plottable", "RenderController.registerToComputeLayoutAndRender")
  @js.native
  def registerToComputeLayoutAndRender(component: typingsSlinky.plottable.componentMod.Component): Unit = js.native
  
  @JSImport("plottable", "RenderController.registerToRender")
  @js.native
  def registerToRender(component: typingsSlinky.plottable.componentMod.Component): Unit = js.native
  
  @JSImport("plottable", "RenderController.renderPolicy")
  @js.native
  def renderPolicy(): IRenderPolicy = js.native
  @JSImport("plottable", "RenderController.renderPolicy")
  @js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
}
