package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalTextureLoaderMod {
  
  @js.native
  trait IInternalTextureLoader extends StObject {
    
    /**
      * This returns if the loader support the current file information.
      * @param extension defines the file extension of the file being loaded
      * @param mimeType defines the optional mime type of the file being loaded
      * @returns true if the loader can load the specified file
      */
    def canLoad(extension: String): Boolean = js.native
    def canLoad(extension: String, mimeType: String): Boolean = js.native
    
    def loadCubeData(
      data: js.Array[js.typedarray.ArrayBufferView],
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def loadCubeData(
      data: js.Array[js.typedarray.ArrayBufferView],
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      options: js.Any
    ): Unit = js.native
    /**
      * Uploads the cube texture data to the WebGL texture. It has already been bound.
      * @param data contains the texture data
      * @param texture defines the BabylonJS internal texture
      * @param createPolynomials will be true if polynomials have been requested
      * @param onLoad defines the callback to trigger once the texture is ready
      * @param onError defines the callback to trigger in case of error
      * @param options options to be passed to the loader
      */
    def loadCubeData(
      data: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
    ): Unit = js.native
    def loadCubeData(
      data: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      createPolynomials: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ],
      options: js.Any
    ): Unit = js.native
    
    /**
      * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
      * @param data contains the texture data
      * @param texture defines the BabylonJS internal texture
      * @param callback defines the method to call once ready to upload
      * @param options options to be passed to the loader
      */
    def loadData(
      data: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      callback: js.Function6[
          /* width */ Double, 
          /* height */ Double, 
          /* loadMipmap */ Boolean, 
          /* isCompressed */ Boolean, 
          /* done */ js.Function0[Unit], 
          /* loadFailed */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = js.native
    def loadData(
      data: js.typedarray.ArrayBufferView,
      texture: InternalTexture,
      callback: js.Function6[
          /* width */ Double, 
          /* height */ Double, 
          /* loadMipmap */ Boolean, 
          /* isCompressed */ Boolean, 
          /* done */ js.Function0[Unit], 
          /* loadFailed */ js.UndefOr[Boolean], 
          Unit
        ],
      options: js.Any
    ): Unit = js.native
    
    /**
      * Defines wether the loader supports cascade loading the different faces.
      */
    var supportCascades: Boolean = js.native
  }
}
