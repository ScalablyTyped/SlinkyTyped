package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.PartialIHighlightLayerOpt
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.effectLayerMod.EffectLayer
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightLayerMod {
  
  @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer")
  @js.native
  class HighlightLayer protected () extends EffectLayer {
    /**
      * Instantiates a new highlight Layer and references it to the scene..
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
      */
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Scene, options: PartialIHighlightLayerOpt) = this()
    
    var _blurTexture: js.Any = js.native
    
    /**
      * Force the stencil to the normal expected value for none glowing parts
      */
    var _defaultStencilReference: js.Any = js.native
    
    var _downSamplePostprocess: js.Any = js.native
    
    var _excludedMeshes: js.Any = js.native
    
    var _horizontalBlurPostprocess: js.Any = js.native
    
    var _instanceGlowingMeshStencilReference: js.Any = js.native
    
    var _meshes: js.Any = js.native
    
    var _options: js.Any = js.native
    
    /**
      * Returns true if the mesh should render, otherwise false.
      * @param mesh The mesh to render
      * @returns true if it should render otherwise false
      */
    /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
    
    var _verticalBlurPostprocess: js.Any = js.native
    
    /**
      * Add a mesh in the exclusion list to prevent it to impact or being impacted by the highlight layer.
      * @param mesh The mesh to exclude from the highlight layer
      */
    def addExcludedMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Add a mesh in the highlight layer in order to make it glow with the chosen color.
      * @param mesh The mesh to highlight
      * @param color The color of the highlight
      * @param glowEmissiveOnly Extract the glow from the emissive texture
      */
    def addMesh(mesh: Mesh, color: Color3): Unit = js.native
    def addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean): Unit = js.native
    
    /**
      * Gets the horizontal size of the blur.
      */
    def blurHorizontalSize: Double = js.native
    /**
      * Specifies the horizontal size of the blur.
      */
    def blurHorizontalSize_=(value: Double): Unit = js.native
    
    /**
      * Gets the vertical size of the blur.
      */
    def blurVerticalSize: Double = js.native
    /**
      * Specifies the vertical size of the blur.
      */
    def blurVerticalSize_=(value: Double): Unit = js.native
    
    /**
      * Specifies whether or not the inner glow is ACTIVE in the layer.
      */
    var innerGlow: Boolean = js.native
    
    /**
      * An event triggered when the highlight layer has been blurred.
      */
    var onAfterBlurObservable: Observable[HighlightLayer] = js.native
    
    /**
      * An event triggered when the highlight layer is being blurred.
      */
    var onBeforeBlurObservable: Observable[HighlightLayer] = js.native
    
    /**
      * Specifies whether or not the outer glow is ACTIVE in the layer.
      */
    var outerGlow: Boolean = js.native
    
    /**
      * Remove all the meshes currently referenced in the highlight layer
      */
    def removeAllMeshes(): Unit = js.native
    
    /**
      * Remove a mesh from the exclusion list to let it impact or being impacted by the highlight layer.
      * @param mesh The mesh to highlight
      */
    def removeExcludedMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Remove a mesh from the highlight layer in order to make it stop glowing.
      * @param mesh The mesh to highlight
      */
    def removeMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Serializes this Highlight layer
      * @returns a serialized Highlight layer object
      */
    @JSName("serialize")
    def serialize_MHighlightLayer(): js.Any = js.native
  }
  /* static members */
  object HighlightLayer {
    
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Effect Name of the highlight layer.
      */
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer.EffectName")
    @js.native
    val EffectName: String = js.native
    
    /**
      * Stencil value used for glowing meshes.
      */
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer.GlowingMeshStencilReference")
    @js.native
    def GlowingMeshStencilReference: Double = js.native
    @scala.inline
    def GlowingMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlowingMeshStencilReference")(x.asInstanceOf[js.Any])
    
    /**
      * The neutral color used during the preparation of the glow effect.
      * This is black by default as the blend operation is a blend operation.
      */
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer.NeutralColor")
    @js.native
    def NeutralColor: Color4 = js.native
    @scala.inline
    def NeutralColor_=(x: Color4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NeutralColor")(x.asInstanceOf[js.Any])
    
    /**
      * Stencil value used for the other meshes in the scene.
      */
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer.NormalMeshStencilReference")
    @js.native
    def NormalMeshStencilReference: Double = js.native
    @scala.inline
    def NormalMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NormalMeshStencilReference")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a Highlight layer from parsed Highlight layer data
      * @param parsedHightlightLayer defines the Highlight layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the Highlight layer information
      * @returns a parsed Highlight layer
      */
    @JSImport("babylonjs/Layers/highlightLayer", "HighlightLayer.Parse")
    @js.native
    def Parse(parsedHightlightLayer: js.Any, scene: Scene, rootUrl: String): HighlightLayer = js.native
  }
  
  @js.native
  trait IHighlightLayerOptions extends StObject {
    
    /**
      * Alpha blending mode used to apply the blur. Default is combine.
      */
    var alphaBlendingMode: Double = js.native
    
    /**
      * How big in texel of the blur texture is the horizontal blur.
      */
    var blurHorizontalSize: Double = js.native
    
    /**
      * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
      * of the picture to blur (the smaller the faster).
      */
    var blurTextureSizeRatio: Double = js.native
    
    /**
      * How big in texel of the blur texture is the vertical blur.
      */
    var blurVerticalSize: Double = js.native
    
    /**
      * The camera attached to the layer.
      */
    var camera: Nullable[Camera] = js.native
    
    /**
      * Should we display highlight as a solid stroke?
      */
    var isStroke: js.UndefOr[Boolean] = js.native
    
    /**
      * Enforces a fixed size texture to ensure resize independant blur.
      */
    var mainTextureFixedSize: js.UndefOr[Double] = js.native
    
    /**
      * Multiplication factor apply to the canvas size to compute the render target size
      * used to generated the glowing objects (the smaller the faster).
      */
    var mainTextureRatio: Double = js.native
    
    /**
      * The rendering group to draw the layer in.
      */
    var renderingGroupId: Double = js.native
  }
  object IHighlightLayerOptions {
    
    @scala.inline
    def apply(
      alphaBlendingMode: Double,
      blurHorizontalSize: Double,
      blurTextureSizeRatio: Double,
      blurVerticalSize: Double,
      mainTextureRatio: Double,
      renderingGroupId: Double
    ): IHighlightLayerOptions = {
      val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], blurHorizontalSize = blurHorizontalSize.asInstanceOf[js.Any], blurTextureSizeRatio = blurTextureSizeRatio.asInstanceOf[js.Any], blurVerticalSize = blurVerticalSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighlightLayerOptions]
    }
    
    @scala.inline
    implicit class IHighlightLayerOptionsMutableBuilder[Self <: IHighlightLayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurHorizontalSize(value: Double): Self = StObject.set(x, "blurHorizontalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurTextureSizeRatio(value: Double): Self = StObject.set(x, "blurTextureSizeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurVerticalSize(value: Double): Self = StObject.set(x, "blurVerticalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraNull: Self = StObject.set(x, "camera", null)
      
      @scala.inline
      def setIsStroke(value: Boolean): Self = StObject.set(x, "isStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStrokeUndefined: Self = StObject.set(x, "isStroke", js.undefined)
      
      @scala.inline
      def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
      
      @scala.inline
      def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * Return a the first highlight layer of the scene with a given name.
        * @param name The name of the highlight layer to look for.
        * @return The highlight layer if found otherwise null.
        */
      def getHighlightLayerByName(name: String): Nullable[HighlightLayer] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(getHighlightLayerByName: String => Nullable[HighlightLayer]): AbstractScene = {
        val __obj = js.Dynamic.literal(getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
      }
    }
  }
}
