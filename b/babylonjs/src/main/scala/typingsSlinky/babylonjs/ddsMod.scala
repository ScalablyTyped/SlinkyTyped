package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddsMod {
  
  @JSImport("babylonjs/Misc/dds", "DDSTools")
  @js.native
  class DDSTools () extends StObject
  /* static members */
  object DDSTools {
    
    @JSImport("babylonjs/Misc/dds", "DDSTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets DDS information from an array buffer
      * @param data defines the array buffer view to read data from
      * @returns the DDS information
      */
    @JSImport("babylonjs/Misc/dds", "DDSTools.GetDDSInfo")
    @js.native
    def GetDDSInfo(data: js.typedarray.ArrayBufferView): DDSInfo = js.native
    
    /**
      * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
      */
    @JSImport("babylonjs/Misc/dds", "DDSTools.StoreLODInAlphaChannel")
    @js.native
    def StoreLODInAlphaChannel: Boolean = js.native
    @scala.inline
    def StoreLODInAlphaChannel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoreLODInAlphaChannel")(x.asInstanceOf[js.Any])
    
    /**
      * Uploads DDS Levels to a Babylon Texture
      * @hidden
      */
    @JSImport("babylonjs/Misc/dds", "DDSTools.UploadDDSLevels")
    @js.native
    def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double
    ): Unit = js.native
    @JSImport("babylonjs/Misc/dds", "DDSTools.UploadDDSLevels")
    @js.native
    def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: js.UndefOr[scala.Nothing],
      currentFace: Double
    ): Unit = js.native
    @JSImport("babylonjs/Misc/dds", "DDSTools.UploadDDSLevels")
    @js.native
    def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double
    ): Unit = js.native
    @JSImport("babylonjs/Misc/dds", "DDSTools.UploadDDSLevels")
    @js.native
    def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double,
      currentFace: Double
    ): Unit = js.native
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._ExtractLongWordOrder")
    @js.native
    def _ExtractLongWordOrder: js.Any = js.native
    @scala.inline
    def _ExtractLongWordOrder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractLongWordOrder")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._FloatView")
    @js.native
    def _FloatView: js.Any = js.native
    @scala.inline
    def _FloatView_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FloatView")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._FromHalfFloat")
    @js.native
    def _FromHalfFloat: js.Any = js.native
    @scala.inline
    def _FromHalfFloat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromHalfFloat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetFloatAsUIntRGBAArrayBuffer")
    @js.native
    def _GetFloatAsUIntRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetFloatAsUIntRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetFloatRGBAArrayBuffer")
    @js.native
    def _GetFloatRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatAsFloatRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatAsFloatRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetHalfFloatAsFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatAsUIntRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatAsUIntRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetHalfFloatAsUIntRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetHalfFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetLuminanceArrayBuffer")
    @js.native
    def _GetLuminanceArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetLuminanceArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetLuminanceArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetRGBAArrayBuffer")
    @js.native
    def _GetRGBAArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetRGBArrayBuffer")
    @js.native
    def _GetRGBArrayBuffer: js.Any = js.native
    @scala.inline
    def _GetRGBArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._Int32View")
    @js.native
    def _Int32View: js.Any = js.native
    @scala.inline
    def _Int32View_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Int32View")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._ToHalfFloat")
    @js.native
    def _ToHalfFloat: js.Any = js.native
    @scala.inline
    def _ToHalfFloat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ToHalfFloat")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DDSInfo extends StObject {
    
    /**
      * The dxgiFormat of the texture
      * @see https://docs.microsoft.com/en-us/windows/desktop/api/dxgiformat/ne-dxgiformat-dxgi_format
      */
    var dxgiFormat: Double = js.native
    
    /**
      * Width of the texture
      */
    var height: Double = js.native
    
    /**
      * If the texture is a compressed format eg. FOURCC_DXT1
      */
    var isCompressed: Boolean = js.native
    
    /**
      * If this is a cube texture
      * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dds-file-layout-for-cubic-environment-maps
      */
    var isCube: Boolean = js.native
    
    /**
      * If the textures format is a known fourCC format
      * @see https://www.fourcc.org/
      */
    var isFourCC: Boolean = js.native
    
    /**
      * If the texture is a lumincance format
      */
    var isLuminance: Boolean = js.native
    
    /**
      * If the texture is an RGB format eg. DXGI_FORMAT_B8G8R8X8_UNORM format
      */
    var isRGB: Boolean = js.native
    
    /**
      * Number of Mipmaps for the texture
      * @see https://en.wikipedia.org/wiki/Mipmap
      */
    var mipmapCount: Double = js.native
    
    /**
      * Sphericle polynomial created for the dds texture
      */
    var sphericalPolynomial: js.UndefOr[SphericalPolynomial] = js.native
    
    /**
      * Texture type eg. Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT
      */
    var textureType: Double = js.native
    
    /**
      * Width of the texture
      */
    var width: Double = js.native
  }
  object DDSInfo {
    
    @scala.inline
    def apply(
      dxgiFormat: Double,
      height: Double,
      isCompressed: Boolean,
      isCube: Boolean,
      isFourCC: Boolean,
      isLuminance: Boolean,
      isRGB: Boolean,
      mipmapCount: Double,
      textureType: Double,
      width: Double
    ): DDSInfo = {
      val __obj = js.Dynamic.literal(dxgiFormat = dxgiFormat.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any], isCube = isCube.asInstanceOf[js.Any], isFourCC = isFourCC.asInstanceOf[js.Any], isLuminance = isLuminance.asInstanceOf[js.Any], isRGB = isRGB.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], textureType = textureType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DDSInfo]
    }
    
    @scala.inline
    implicit class DDSInfoMutableBuilder[Self <: DDSInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDxgiFormat(value: Double): Self = StObject.set(x, "dxgiFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFourCC(value: Boolean): Self = StObject.set(x, "isFourCC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLuminance(value: Boolean): Self = StObject.set(x, "isLuminance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRGB(value: Boolean): Self = StObject.set(x, "isRGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMipmapCount(value: Double): Self = StObject.set(x, "mipmapCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphericalPolynomial(value: SphericalPolynomial): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphericalPolynomialUndefined: Self = StObject.set(x, "sphericalPolynomial", js.undefined)
      
      @scala.inline
      def setTextureType(value: Double): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Create a cube texture from prefiltered data (ie. the mipmaps contain ready to use data for PBR reflection)
        * @param rootUrl defines the url where the file to load is located
        * @param scene defines the current scene
        * @param lodScale defines scale to apply to the mip map selection
        * @param lodOffset defines offset to apply to the mip map selection
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials defines wheter or not to create polynomails harmonics for the texture
        * @returns the cube texture as an InternalTexture
        */
      def createPrefilteredCubeTexture(rootUrl: String, scene: Nullable[Scene], lodScale: Double, lodOffset: Double): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: js.UndefOr[scala.Nothing],
        forcedExtension: js.UndefOr[scala.Nothing],
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: js.UndefOr[scala.Nothing],
        forcedExtension: js.Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: js.UndefOr[scala.Nothing],
        forcedExtension: js.Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: Double
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: Double,
        forcedExtension: js.UndefOr[scala.Nothing],
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: Double,
        forcedExtension: js.Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
        format: Double,
        forcedExtension: js.Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
        onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]
      ): InternalTexture = js.native
    }
  }
}
