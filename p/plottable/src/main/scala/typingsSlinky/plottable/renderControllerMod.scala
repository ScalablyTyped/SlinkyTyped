package typingsSlinky.plottable

import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.plottableStrings.animationFrame
import typingsSlinky.plottable.plottableStrings.immediate
import typingsSlinky.plottable.plottableStrings.timeout
import typingsSlinky.plottable.renderPolicyMod.IRenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderControllerMod {
  
  /* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plottable.plottableStrings.immediate
    - typingsSlinky.plottable.plottableStrings.animationFrame
    - typingsSlinky.plottable.plottableStrings.timeout
  */
  trait Policy extends StObject
  object Policy {
    
    @JSImport("plottable/build/src/core/renderController", "Policy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/core/renderController", "Policy.animationFrame")
    @js.native
    def animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
    @scala.inline
    def animationFrame_=(x: animationFrame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.immediate")
    @js.native
    def immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
    @scala.inline
    def immediate_=(x: immediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.timeout")
    @js.native
    def timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
    @scala.inline
    def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/core/renderController", "flush")
  @js.native
  def flush(): Unit = js.native
  
  @JSImport("plottable/build/src/core/renderController", "registerToComputeLayout")
  @js.native
  def registerToComputeLayout(component: Component): Unit = js.native
  
  @JSImport("plottable/build/src/core/renderController", "registerToComputeLayoutAndRender")
  @js.native
  def registerToComputeLayoutAndRender(component: Component): Unit = js.native
  
  @JSImport("plottable/build/src/core/renderController", "registerToRender")
  @js.native
  def registerToRender(component: Component): Unit = js.native
  
  @JSImport("plottable/build/src/core/renderController", "renderPolicy")
  @js.native
  def renderPolicy(): IRenderPolicy = js.native
  @JSImport("plottable/build/src/core/renderController", "renderPolicy")
  @js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
}
