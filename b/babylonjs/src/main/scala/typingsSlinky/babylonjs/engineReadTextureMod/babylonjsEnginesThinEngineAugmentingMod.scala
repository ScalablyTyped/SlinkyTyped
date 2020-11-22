package typingsSlinky.babylonjs.engineReadTextureMod

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /** @hidden */
    def _readTexturePixels(texture: InternalTexture, width: Double, height: Double): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(
      texture: InternalTexture,
      width: Double,
      height: Double,
      faceIndex: js.UndefOr[scala.Nothing],
      level: js.UndefOr[scala.Nothing],
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(
      texture: InternalTexture,
      width: Double,
      height: Double,
      faceIndex: js.UndefOr[scala.Nothing],
      level: Double
    ): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(
      texture: InternalTexture,
      width: Double,
      height: Double,
      faceIndex: js.UndefOr[scala.Nothing],
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(
      texture: InternalTexture,
      width: Double,
      height: Double,
      faceIndex: Double,
      level: js.UndefOr[scala.Nothing],
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double, level: Double): js.typedarray.ArrayBufferView = js.native
    def _readTexturePixels(
      texture: InternalTexture,
      width: Double,
      height: Double,
      faceIndex: Double,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.typedarray.ArrayBufferView = js.native
  }
}
