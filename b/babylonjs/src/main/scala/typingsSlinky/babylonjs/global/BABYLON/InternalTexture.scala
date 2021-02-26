package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InternalTexture")
@js.native
class InternalTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    source: typingsSlinky.babylonjs.BABYLON.InternalTextureSource
  ) = this()
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    source: typingsSlinky.babylonjs.BABYLON.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
object InternalTexture {
  
  /** @hidden */
  @JSGlobal("BABYLON.InternalTexture._UpdateRGBDAsync")
  @js.native
  def _UpdateRGBDAsync(
    internalTexture: typingsSlinky.babylonjs.BABYLON.InternalTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    sphericalPolynomial: Nullable[typingsSlinky.babylonjs.BABYLON.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
