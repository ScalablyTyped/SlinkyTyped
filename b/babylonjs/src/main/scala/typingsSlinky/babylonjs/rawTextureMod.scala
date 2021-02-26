package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.textureMod.Texture
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture")
  @js.native
  class RawTexture protected () extends Texture {
    /**
      * Instantiates a new RawTexture.
      * Raw texture can help creating a texture directly from an array of data.
      * This can be super useful if you either get the data from an uncompressed source or
      * if you wish to create your texture pixel by pixel.
      * @param data define the array of data to use to create the texture
      * @param width define the width of the texture
      * @param height define the height of the texture
      * @param format define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps define whether mip maps should be generated or not
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
      */
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ) = this()
    def this(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    format: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ) = this()
    
    /**
      * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
      */
    var format: Double = js.native
    
    /**
      * Updates the texture underlying data.
      * @param data Define the new data of the texture
      */
    def update(data: js.typedarray.ArrayBufferView): Unit = js.native
  }
  /* static members */
  object RawTexture {
    
    /**
      * Creates an alpha texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @returns the alpha texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateAlphaTexture")
    @js.native
    def CreateAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    
    /**
      * Creates a luminance alpha texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @returns the luminance alpha texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceAlphaTexture")
    @js.native
    def CreateLuminanceAlphaTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    
    /**
      * Creates a luminance texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @returns the luminance texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateLuminanceTexture")
    @js.native
    def CreateLuminanceTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    
    /**
      * Creates a RGBA texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
      * @returns the RGBA texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBATexture")
    @js.native
    def CreateRGBATexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    
    /**
      * Creates a RGB texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
      * @returns the RGB alpha texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRGBTexture")
    @js.native
    def CreateRGBTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    
    /**
      * Creates a R texture from some data.
      * @param data Define the texture data
      * @param width Define the width of the texture
      * @param height Define the height of the texture
      * @param sceneOrEngine defines the scene or engine the texture will belong to
      * @param generateMipMaps Define whether or not to create mip maps for the texture
      * @param invertY define if the data should be flipped on Y when uploaded to the GPU
      * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
      * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
      * @returns the R texture
      */
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine]
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      `type`: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): RawTexture = js.native
    @JSImport("babylonjs/Materials/Textures/rawTexture", "RawTexture.CreateRTexture")
    @js.native
    def CreateRTexture(
      data: js.typedarray.ArrayBufferView,
      width: Double,
      height: Double,
      sceneOrEngine: Nullable[Scene | ThinEngine],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      `type`: Double
    ): RawTexture = js.native
  }
}
