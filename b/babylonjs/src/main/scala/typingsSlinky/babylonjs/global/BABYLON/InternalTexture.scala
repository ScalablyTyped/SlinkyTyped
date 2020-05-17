package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("BABYLON.InternalTexture")
@js.native
object InternalTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typingsSlinky.babylonjs.BABYLON.InternalTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    sphericalPolynomial: Nullable[typingsSlinky.babylonjs.BABYLON.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}

