package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.webXRFeaturesManagerMod.IWebXRFeature
import typingsSlinky.babylonjs.webXRFeaturesManagerMod.WebXRFeatureConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRFeaturesManager")
@js.native
class WebXRFeaturesManager protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXRFeaturesManager {
  /**
    * constructs a new features manages.
    *
    * @param _xrSessionManager an instance of WebXRSessionManager
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
}
/* static members */
object WebXRFeaturesManager {
  
  /**
    * Used to register a module. After calling this function a developer can use this feature in the scene.
    * Mainly used internally.
    *
    * @param featureName the name of the feature to register
    * @param constructorFunction the function used to construct the module
    * @param version the (babylon) version of the module
    * @param stable is that a stable version of this module
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.AddWebXRFeature")
  @js.native
  def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor): Unit = js.native
  @JSImport("babylonjs", "WebXRFeaturesManager.AddWebXRFeature")
  @js.native
  def AddWebXRFeature(
    featureName: String,
    constructorFunction: WebXRFeatureConstructor,
    version: js.UndefOr[scala.Nothing],
    stable: Boolean
  ): Unit = js.native
  @JSImport("babylonjs", "WebXRFeaturesManager.AddWebXRFeature")
  @js.native
  def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor, version: Double): Unit = js.native
  @JSImport("babylonjs", "WebXRFeaturesManager.AddWebXRFeature")
  @js.native
  def AddWebXRFeature(
    featureName: String,
    constructorFunction: WebXRFeatureConstructor,
    version: Double,
    stable: Boolean
  ): Unit = js.native
  
  @JSImport("babylonjs", "WebXRFeaturesManager.ConstructFeature")
  @js.native
  def ConstructFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ): js.Function0[IWebXRFeature] = js.native
  @JSImport("babylonjs", "WebXRFeaturesManager.ConstructFeature")
  @js.native
  def ConstructFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    options: js.Any
  ): js.Function0[IWebXRFeature] = js.native
  /**
    * Returns a constructor of a specific feature.
    *
    * @param featureName the name of the feature to construct
    * @param version the version of the feature to load
    * @param xrSessionManager the xrSessionManager. Used to construct the module
    * @param options optional options provided to the module.
    * @returns a function that, when called, will return a new instance of this feature
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.ConstructFeature")
  @js.native
  def ConstructFeature(
    featureName: String,
    version: Double,
    xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ): js.Function0[IWebXRFeature] = js.native
  @JSImport("babylonjs", "WebXRFeaturesManager.ConstructFeature")
  @js.native
  def ConstructFeature(
    featureName: String,
    version: Double,
    xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    options: js.Any
  ): js.Function0[IWebXRFeature] = js.native
  
  /**
    * Can be used to return the list of features currently registered
    *
    * @returns an Array of available features
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.GetAvailableFeatures")
  @js.native
  def GetAvailableFeatures(): js.Array[String] = js.native
  
  /**
    * Gets the versions available for a specific feature
    * @param featureName the name of the feature
    * @returns an array with the available versions
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.GetAvailableVersions")
  @js.native
  def GetAvailableVersions(featureName: String): js.Array[String] = js.native
  
  /**
    * Return the latest unstable version of this feature
    * @param featureName the name of the feature to search
    * @returns the version number. if not found will return -1
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.GetLatestVersionOfFeature")
  @js.native
  def GetLatestVersionOfFeature(featureName: String): Double = js.native
  
  /**
    * Return the latest stable version of this feature
    * @param featureName the name of the feature to search
    * @returns the version number. if not found will return -1
    */
  @JSImport("babylonjs", "WebXRFeaturesManager.GetStableVersionOfFeature")
  @js.native
  def GetStableVersionOfFeature(featureName: String): Double = js.native
  
  @JSImport("babylonjs", "WebXRFeaturesManager._AvailableFeatures")
  @js.native
  val _AvailableFeatures: js.Any = js.native
}
