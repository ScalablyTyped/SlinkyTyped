package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IShadowLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShadowGenerator")
@js.native
class ShadowGenerator protected ()
  extends typingsSlinky.babylonjs.BABYLON.ShadowGenerator {
  /**
    * Creates a ShadowGenerator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each light casting shadows needs to use its own ShadowGenerator.
    * Documentation : https://doc.babylonjs.com/babylon101/shadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The light object generating the shadows.
    * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    */
  def this(mapSize: Double, light: IShadowLight) = this()
  def this(mapSize: Double, light: IShadowLight, usefulFloatFirst: Boolean) = this()
}
/* static members */
object ShadowGenerator {
  
  @JSGlobal("BABYLON.ShadowGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the shadow generator class
    */
  @JSGlobal("BABYLON.ShadowGenerator.CLASSNAME")
  @js.native
  def CLASSNAME: String = js.native
  @scala.inline
  def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode None: no filtering applied.
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_NONE")
  @js.native
  val FILTER_NONE: Double = js.native
  
  /**
    * Shadow generator mode PCF: Percentage Closer Filtering
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_PCF")
  @js.native
  val FILTER_PCF: Double = js.native
  
  /**
    * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * Contact Hardening
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_PCSS")
  @js.native
  val FILTER_PCSS: Double = js.native
  
  /**
    * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
    * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_POISSONSAMPLING")
  @js.native
  val FILTER_POISSONSAMPLING: Double = js.native
  
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
    * @returns The parsed shadow generator
    */
  @JSGlobal("BABYLON.ShadowGenerator.Parse")
  @js.native
  def Parse(parsedShadowGenerator: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.ShadowGenerator = js.native
  @JSGlobal("BABYLON.ShadowGenerator.Parse")
  @js.native
  def Parse(
    parsedShadowGenerator: js.Any,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    constr: js.Function2[/* mapSize */ Double, /* light */ IShadowLight, this.type]
  ): typingsSlinky.babylonjs.BABYLON.ShadowGenerator = js.native
  
  /**
    * Reserved for PCF and PCSS
    * Highest Quality.
    *
    * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
    *
    * Execute PCSS with 32 taps blocker search and 64 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_HIGH")
  @js.native
  val QUALITY_HIGH: Double = js.native
  
  /**
    * Reserved for PCF and PCSS
    * The lowest quality but the fastest.
    *
    * Execute PCF on a 1*1 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 16 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_LOW")
  @js.native
  val QUALITY_LOW: Double = js.native
  
  /**
    * Reserved for PCF and PCSS
    * Good tradeoff for quality/perf cross devices
    *
    * Execute PCF on a 3*3 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 32 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_MEDIUM")
  @js.native
  val QUALITY_MEDIUM: Double = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.ShadowGenerator._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}
