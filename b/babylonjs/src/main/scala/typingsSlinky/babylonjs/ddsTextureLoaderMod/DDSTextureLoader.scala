package typingsSlinky.babylonjs.ddsTextureLoaderMod

import typingsSlinky.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/Loaders/ddsTextureLoader", "_DDSTextureLoader")
@js.native
class DDSTextureLoader () extends IInternalTextureLoader {
  
  /**
    * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
    * @param data contains the texture data
    * @param texture defines the BabylonJS internal texture
    * @param callback defines the method to call once ready to upload
    */
  def loadData(
    data: js.typedarray.ArrayBufferView,
    texture: InternalTexture,
    callback: js.Function5[
      /* width */ Double, 
      /* height */ Double, 
      /* loadMipmap */ Boolean, 
      /* isCompressed */ Boolean, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
}
