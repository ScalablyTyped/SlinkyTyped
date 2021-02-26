package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panoramaToCubemapMod {
  
  @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools")
  @js.native
  class PanoramaToCubeMapTools () extends StObject
  /* static members */
  object PanoramaToCubeMapTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.CalcProjectionSpherical")
    @js.native
    def CalcProjectionSpherical: js.Any = js.native
    @scala.inline
    def CalcProjectionSpherical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
    
    /**
      * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
      *
      * @param float32Array The source data.
      * @param inputWidth The width of the input panorama.
      * @param inputHeight The height of the input panorama.
      * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
      * @return The cubemap data
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.ConvertPanoramaToCubemap")
    @js.native
    def ConvertPanoramaToCubemap(float32Array: js.typedarray.Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.CreateCubemapTexture")
    @js.native
    def CreateCubemapTexture: js.Any = js.native
    @scala.inline
    def CreateCubemapTexture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_BACK")
    @js.native
    def FACE_BACK: js.Any = js.native
    @scala.inline
    def FACE_BACK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_DOWN")
    @js.native
    def FACE_DOWN: js.Any = js.native
    @scala.inline
    def FACE_DOWN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_FRONT")
    @js.native
    def FACE_FRONT: js.Any = js.native
    @scala.inline
    def FACE_FRONT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_LEFT")
    @js.native
    def FACE_LEFT: js.Any = js.native
    @scala.inline
    def FACE_LEFT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_RIGHT")
    @js.native
    def FACE_RIGHT: js.Any = js.native
    @scala.inline
    def FACE_RIGHT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_UP")
    @js.native
    def FACE_UP: js.Any = js.native
    @scala.inline
    def FACE_UP_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CubeMapInfo extends StObject {
    
    /**
      * The pixel array for the back face.
      * This is stored in format, left to right, up to down format.
      */
    var back: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * The pixel array for the down face.
      * This is stored in format, left to right, up to down format.
      */
    var down: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * The format of the texture.
      *
      * RGBA, RGB.
      */
    var format: Double = js.native
    
    /**
      * The pixel array for the front face.
      * This is stored in format, left to right, up to down format.
      */
    var front: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * Specifies whether the texture is in gamma space.
      */
    var gammaSpace: Boolean = js.native
    
    /**
      * The pixel array for the left face.
      * This is stored in format, left to right, up to down format.
      */
    var left: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * The pixel array for the right face.
      * This is stored in format, left to right, up to down format.
      */
    var right: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * The size of the cubemap stored.
      *
      * Each faces will be size * size pixels.
      */
    var size: Double = js.native
    
    /**
      * The type of the texture data.
      *
      * UNSIGNED_INT, FLOAT.
      */
    var `type`: Double = js.native
    
    /**
      * The pixel array for the up face.
      * This is stored in format, left to right, up to down format.
      */
    var up: Nullable[js.typedarray.ArrayBufferView] = js.native
  }
  object CubeMapInfo {
    
    @scala.inline
    def apply(format: Double, gammaSpace: Boolean, size: Double, `type`: Double): CubeMapInfo = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CubeMapInfo]
    }
    
    @scala.inline
    implicit class CubeMapInfoMutableBuilder[Self <: CubeMapInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBack(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackNull: Self = StObject.set(x, "back", null)
      
      @scala.inline
      def setDown(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownNull: Self = StObject.set(x, "down", null)
      
      @scala.inline
      def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFront(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrontNull: Self = StObject.set(x, "front", null)
      
      @scala.inline
      def setGammaSpace(value: Boolean): Self = StObject.set(x, "gammaSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftNull: Self = StObject.set(x, "left", null)
      
      @scala.inline
      def setRight(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightNull: Self = StObject.set(x, "right", null)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpNull: Self = StObject.set(x, "up", null)
    }
  }
}
