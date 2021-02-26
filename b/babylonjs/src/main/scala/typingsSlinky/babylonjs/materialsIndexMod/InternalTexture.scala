package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "InternalTexture")
@js.native
class InternalTexture protected ()
  extends typingsSlinky.babylonjs.texturesIndexMod.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(engine: ThinEngine, source: typingsSlinky.babylonjs.internalTextureMod.InternalTextureSource) = this()
  def this(
    engine: ThinEngine,
    source: typingsSlinky.babylonjs.internalTextureMod.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
object InternalTexture {
  
  /** @hidden */
  @JSImport("babylonjs/Materials/index", "InternalTexture._UpdateRGBDAsync")
  @js.native
  def _UpdateRGBDAsync(
    internalTexture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
