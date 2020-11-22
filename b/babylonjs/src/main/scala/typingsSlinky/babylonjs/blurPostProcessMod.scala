package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/blurPostProcess", JSImport.Namespace)
@js.native
object blurPostProcessMod extends js.Object {
  
  @js.native
  class BlurPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance BlurPostProcess
      * @param name The name of the effect.
      * @param direction The direction in which to blur the image.
      * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
      * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(
      name: String,
      direction: Vector2,
      kernel: Double,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      defines: js.UndefOr[String],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * Calculates the value of a Gaussian distribution with sigma 3 at a given point.
      * @param x The point on the Gaussian distribution to sample.
      * @return the value of the Gaussian function at x.
      */
    /* protected */ def _gaussianWeight(x: Double): Double = js.native
    
    /**
      * Generates a string that can be used as a floating point number in GLSL.
      * @param x Value to print.
      * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
      * @return GLSL float string.
      */
    /* protected */ def _glslFloat(x: Double): String = js.native
    /* protected */ def _glslFloat(x: Double, decimalFigures: Double): String = js.native
    
    var _idealKernel: Double = js.native
    
    var _kernel: Double = js.native
    
    /**
      * Best kernels are odd numbers that when divided by 2, their integer part is even, so 5, 9 or 13.
      * Other odd kernels optimize correctly but require proportionally more samples, even kernels are
      * possible but will produce minor visual artifacts. Since each new kernel requires a new shader we
      * want to minimize kernel changes, having gaps between physical kernels is helpful in that regard.
      * The gaps between physical kernels are compensated for in the weighting of the samples
      * @param idealKernel Ideal blur kernel.
      * @return Nearest best kernel.
      */
    /* protected */ def _nearestBestKernel(idealKernel: Double): Double = js.native
    
    var _packedFloat: Boolean = js.native
    
    var _staticDefines: js.Any = js.native
    
    /* protected */ def _updateParameters(): Unit = js.native
    /* protected */ def _updateParameters(
      onCompiled: js.UndefOr[scala.Nothing],
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Unit = js.native
    /* protected */ def _updateParameters(onCompiled: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    /* protected */ def _updateParameters(
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Unit = js.native
    
    var blockCompilation: js.Any = js.native
    
    /** The direction in which to blur the image. */
    var direction: Vector2 = js.native
    
    /**
      * Gets the length in pixels of the blur sample region
      */
    def kernel: Double = js.native
    /**
      * Sets the length in pixels of the blur sample region
      */
    def kernel_=(v: Double): Unit = js.native
    
    /**
      * Gets wether or not the blur is unpacking/repacking floats
      */
    def packedFloat: Boolean = js.native
    /**
      * Sets wether or not the blur needs to unpack/repack floats
      */
    def packedFloat_=(v: Boolean): Unit = js.native
    
    /**
      * Updates the effect with the current post process compile time values and recompiles the shader.
      * @param defines Define statements that should be added at the beginning of the shader. (default: null)
      * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
      * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param onCompiled Called when the shader has been compiled.
      * @param onError Called if there is an error when compiling a shader.
      */
    def updateEffect(
      defines: js.UndefOr[Nullable[String]],
      uniforms: js.UndefOr[Nullable[js.Array[String]]],
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      indexParameters: js.UndefOr[js.Any],
      onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
      onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
    ): Unit = js.native
  }
  /* static members */
  @js.native
  object BlurPostProcess extends js.Object {
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[BlurPostProcess] = js.native
  }
}
