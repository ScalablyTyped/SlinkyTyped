package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlElementTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/htmlElementTexture", "HtmlElementTexture")
  @js.native
  class HtmlElementTexture protected () extends BaseTexture {
    def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
    /**
      * Instantiates a HtmlElementTexture from the following parameters.
      *
      * @param name Defines the name of the texture
      * @param element Defines the video or canvas the texture is filled with
      * @param options Defines the other none mandatory texture creation options
      */
    def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
    
    var _createInternalTexture: js.Any = js.native
    
    var _generateMipMaps: js.Any = js.native
    
    var _isVideo: js.Any = js.native
    
    var _samplingMode: js.Any = js.native
    
    var _textureMatrix: js.Any = js.native
    
    /**
      * The texture URL.
      */
    var element: HTMLVideoElement | HTMLCanvasElement = js.native
    
    /**
      * Updates the content of the texture.
      * @param invertY Defines wether the texture should be inverted on Y (false by default on video and true on canvas)
      */
    def update(): Unit = js.native
    def update(invertY: Nullable[Boolean]): Unit = js.native
  }
  /* static members */
  object HtmlElementTexture {
    
    @JSImport("babylonjs/Materials/Textures/htmlElementTexture", "HtmlElementTexture.DefaultOptions")
    @js.native
    val DefaultOptions: js.Any = js.native
  }
  
  @js.native
  trait IHtmlElementTextureOptions extends StObject {
    
    /**
      * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
      */
    var engine: Nullable[ThinEngine] = js.native
    
    /**
      * Defines wether mip maps should be created or not.
      */
    var generateMipMaps: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the sampling mode of the texture.
      */
    var samplingMode: js.UndefOr[Double] = js.native
    
    /**
      * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
      */
    var scene: Nullable[Scene] = js.native
  }
  object IHtmlElementTextureOptions {
    
    @scala.inline
    def apply(): IHtmlElementTextureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHtmlElementTextureOptions]
    }
    
    @scala.inline
    implicit class IHtmlElementTextureOptionsMutableBuilder[Self <: IHtmlElementTextureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: Nullable[ThinEngine]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineNull: Self = StObject.set(x, "engine", null)
      
      @scala.inline
      def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
      
      @scala.inline
      def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
      
      @scala.inline
      def setScene(value: Nullable[Scene]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneNull: Self = StObject.set(x, "scene", null)
    }
  }
}
