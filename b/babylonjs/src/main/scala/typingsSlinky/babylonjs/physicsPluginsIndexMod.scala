package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPluginsIndexMod {
  
  @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin")
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  class AmmoJSPlugin ()
    extends typingsSlinky.babylonjs.ammoJSPluginMod.AmmoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], ammoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      ammoInjection: js.UndefOr[scala.Nothing],
      overlappingPairCache: js.Any
    ) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      ammoInjection: js.Any,
      overlappingPairCache: js.Any
    ) = this()
    def this(
      _useDeltaForWorldStep: Boolean,
      ammoInjection: js.UndefOr[scala.Nothing],
      overlappingPairCache: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
  }
  /* static members */
  object AmmoJSPlugin {
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin.DISABLE_COLLISION_FLAG")
    @js.native
    val DISABLE_COLLISION_FLAG: js.Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin.DISABLE_DEACTIVATION_FLAG")
    @js.native
    val DISABLE_DEACTIVATION_FLAG: js.Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin.KINEMATIC_FLAG")
    @js.native
    val KINEMATIC_FLAG: js.Any = js.native
  }
  
  @JSImport("babylonjs/Physics/Plugins/index", "CannonJSPlugin")
  @js.native
  class CannonJSPlugin ()
    extends typingsSlinky.babylonjs.cannonJSPluginMod.CannonJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      iterations: js.UndefOr[scala.Nothing],
      cannonInjection: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double, cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: js.UndefOr[scala.Nothing], cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: js.Any) = this()
  }
  
  @JSImport("babylonjs/Physics/Plugins/index", "OimoJSPlugin")
  @js.native
  class OimoJSPlugin ()
    extends typingsSlinky.babylonjs.oimoJSPluginMod.OimoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      iterations: js.UndefOr[scala.Nothing],
      oimoInjection: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: js.UndefOr[scala.Nothing], oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: js.Any) = this()
  }
}
