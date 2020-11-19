package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/States/index", JSImport.Namespace)
@js.native
object statesIndexMod extends js.Object {
  
  @js.native
  /**
    * Initializes the state.
    */
  class AlphaState ()
    extends typingsSlinky.babylonjs.alphaCullingStateMod.AlphaState
  
  @js.native
  /**
    * Initializes the state.
    */
  class DepthCullingState ()
    extends typingsSlinky.babylonjs.depthCullingStateMod.DepthCullingState
  
  @js.native
  class StencilState ()
    extends typingsSlinky.babylonjs.stencilStateMod.StencilState
  /* static members */
  @js.native
  object StencilState extends js.Object {
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    val ALWAYS: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    val KEEP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    val REPLACE: Double = js.native
  }
}
