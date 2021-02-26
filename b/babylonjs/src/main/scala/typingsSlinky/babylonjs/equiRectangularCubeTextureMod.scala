package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equiRectangularCubeTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture")
  @js.native
  class EquiRectangularCubeTexture protected () extends BaseTexture {
    /**
      * Instantiates an EquiRectangularCubeTexture from the following parameters.
      * @param url The location of the image
      * @param scene The scene the texture will be used in
      * @param size The cubemap desired size (the more it increases the longer the generation will be)
      * @param noMipmap Forces to not generate the mipmap if true
      * @param gammaSpace Specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
      * @param onLoad — defines a callback called when texture is loaded
      * @param onError — defines a callback called if there is an error
      */
    def this(url: String, scene: Scene, size: Double) = this()
    def this(url: String, scene: Scene, size: Double, noMipmap: Boolean) = this()
    def this(url: String, scene: Scene, size: Double, noMipmap: js.UndefOr[scala.Nothing], gammaSpace: Boolean) = this()
    def this(url: String, scene: Scene, size: Double, noMipmap: Boolean, gammaSpace: Boolean) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      gammaSpace: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: js.UndefOr[scala.Nothing],
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      gammaSpace: js.UndefOr[scala.Nothing],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: js.UndefOr[scala.Nothing],
      gammaSpace: Boolean,
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: js.UndefOr[scala.Nothing],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
    ) = this()
    def this(
      url: String,
      scene: Scene,
      size: Double,
      noMipmap: Boolean,
      gammaSpace: Boolean,
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
    ) = this()
    
    /** The buffer of the image. */
    var _buffer: js.Any = js.native
    
    /** The height of the input image. */
    var _height: js.Any = js.native
    
    var _noMipmap: js.Any = js.native
    
    var _onError: js.Any = js.native
    
    var _onLoad: js.Any = js.native
    
    /** The size of the cubemap. */
    var _size: js.Any = js.native
    
    /** The width of the input image. */
    var _width: js.Any = js.native
    
    /**
      * Convert the ArrayBuffer into a Float32Array and drop the transparency channel.
      * @param buffer The ArrayBuffer that should be converted.
      * @returns The buffer as Float32Array.
      */
    var getFloat32ArrayFromArrayBuffer: js.Any = js.native
    
    /**
      * Load the image data, by putting the image on a canvas and extracting its buffer.
      */
    var loadImage: js.Any = js.native
    
    /**
      * Convert the image buffer into a cubemap and create a CubeTexture.
      */
    var loadTexture: js.Any = js.native
    
    /** The URL to the image. */
    var url: String = js.native
  }
  /* static members */
  object EquiRectangularCubeTexture {
    
    @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /** The six faces of the cube. */
    @JSImport("babylonjs/Materials/Textures/equiRectangularCubeTexture", "EquiRectangularCubeTexture._FacesMapping")
    @js.native
    def _FacesMapping: js.Any = js.native
    @scala.inline
    def _FacesMapping_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FacesMapping")(x.asInstanceOf[js.Any])
  }
}
