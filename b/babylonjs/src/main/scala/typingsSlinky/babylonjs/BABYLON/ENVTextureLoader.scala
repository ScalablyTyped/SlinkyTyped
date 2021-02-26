package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENVTextureLoader extends IInternalTextureLoader {
  
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
