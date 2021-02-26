package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubSurfaceConfiguration extends PrePassEffectConfiguration {
  
  /**
    * Performs sampling of a Normalized Burley diffusion profile in polar coordinates.
    * 'u' is the random number (the value of the CDF): [0, 1).
    * rcp(s) = 1 / ShapeParam = ScatteringDistance.
    * Returns the sampled radial distance, s.t. (u = 0 -> r = 0) and (u = 1 -> r = Inf).
    */
  var _sampleBurleyDiffusionProfile: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _ssDiffusionD: js.Any = js.native
  
  var _ssDiffusionS: js.Any = js.native
  
  var _ssFilterRadii: js.Any = js.native
  
  /**
    * Adds a new diffusion profile.
    * Useful for more realistic subsurface scattering on diverse materials.
    * @param color The color of the diffusion profile. Should be the average color of the material.
    * @return The index of the diffusion profile for the material subsurface configuration
    */
  def addDiffusionProfile(color: Color3): Double = js.native
  
  /**
    * Deletes all diffusion profiles.
    * Note that in order to render subsurface scattering, you should have at least 1 diffusion profile.
    */
  def clearAllDiffusionProfiles(): Unit = js.native
  
  /**
    * Creates the sss post process
    * @return The created post process
    */
  @JSName("createPostProcess")
  def createPostProcess_MSubSurfaceConfiguration(): SubSurfaceScatteringPostProcess = js.native
  
  /**
    * Disposes this object
    */
  @JSName("dispose")
  def dispose_MSubSurfaceConfiguration(): Unit = js.native
  
  /**
    * @hidden
    * https://zero-radiance.github.io/post/sampling-diffusion/
    *
    * Importance sample the normalized diffuse reflectance profile for the computed value of 's'.
    * ------------------------------------------------------------------------------------
    * R[r, phi, s]   = s * (Exp[-r * s] + Exp[-r * s / 3]) / (8 * Pi * r)
    * PDF[r, phi, s] = r * R[r, phi, s]
    * CDF[r, s]      = 1 - 1/4 * Exp[-r * s] - 3/4 * Exp[-r * s / 3]
    * ------------------------------------------------------------------------------------
    * We importance sample the color channel with the widest scattering distance.
    */
  def getDiffusionProfileParameters(color: Color3): Double = js.native
  
  /**
    * Defines the ratio real world => scene units.
    * Used for subsurface scattering
    */
  var metersPerUnit: Double = js.native
  
  /**
    * Post process to attach for screen space subsurface scattering
    */
  @JSName("postProcess")
  var postProcess_SubSurfaceConfiguration: SubSurfaceScatteringPostProcess = js.native
  
  /**
    * Diffusion profile max color channel value for subsurface scattering
    */
  def ssDiffusionD: js.Array[Double] = js.native
  
  /**
    * Diffusion profile colors for subsurface scattering
    * You can add one diffusion color using `addDiffusionProfile` on `scene.prePassRenderer`
    * See ...
    * Note that you can only store up to 5 of them
    */
  var ssDiffusionProfileColors: js.Array[Color3] = js.native
  
  /**
    * Diffusion profile color for subsurface scattering
    */
  def ssDiffusionS: js.Array[Double] = js.native
  
  /**
    * Diffusion profile filter radius for subsurface scattering
    */
  def ssFilterRadii: js.Array[Double] = js.native
}
