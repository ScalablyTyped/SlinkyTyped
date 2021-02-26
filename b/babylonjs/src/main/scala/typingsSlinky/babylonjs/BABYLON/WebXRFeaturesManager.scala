package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRSessionInit
import typingsSlinky.babylonjs.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRFeaturesManager extends IDisposable {
  
  var _features: js.Any = js.native
  
  var _xrSessionManager: js.Any = js.native
  
  /**
    * Attach a feature to the current session. Mainly used when session started to start the feature effect.
    * Can be used during a session to start a feature
    * @param featureName the name of feature to attach
    */
  def attachFeature(featureName: String): Unit = js.native
  
  /**
    * Can be used inside a session or when the session ends to detach a specific feature
    * @param featureName the name of the feature to detach
    */
  def detachFeature(featureName: String): Unit = js.native
  
  /**
    * Used to disable an already-enabled feature
    * The feature will be disposed and will be recreated once enabled.
    * @param featureName the feature to disable
    * @returns true if disable was successful
    */
  def disableFeature(featureName: String): Boolean = js.native
  def disableFeature(featureName: NameString): Boolean = js.native
  
  /**
    * Enable a feature using its name and a version. This will enable it in the scene, and will be responsible to attach it when the session starts.
    * If used twice, the old version will be disposed and a new one will be constructed. This way you can re-enable with different configuration.
    *
    * @param featureName the name of the feature to load or the class of the feature
    * @param version optional version to load. if not provided the latest version will be enabled
    * @param moduleOptions options provided to the module. Ses the module documentation / constructor
    * @param attachIfPossible if set to true (default) the feature will be automatically attached, if it is currently possible
    * @param required is this feature required to the app. If set to true the session init will fail if the feature is not available.
    * @returns a new constructed feature or throws an error if feature not found.
    */
  def enableFeature(featureName: String): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: js.UndefOr[scala.Nothing], moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: String): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: String, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: String,
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: String, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: String,
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: Double): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: Double, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: Double,
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: String, version: Double, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
  def enableFeature(
    featureName: String,
    version: Double,
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: js.UndefOr[scala.Nothing], moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: js.UndefOr[scala.Nothing],
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: String): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: String,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: String, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: String,
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: String, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: String,
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: Double): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: Double,
    moduleOptions: js.UndefOr[scala.Nothing],
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: Double, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: Double,
    moduleOptions: js.Any,
    attachIfPossible: js.UndefOr[scala.Nothing],
    required: Boolean
  ): IWebXRFeature = js.native
  def enableFeature(featureName: NameString, version: Double, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
  def enableFeature(
    featureName: NameString,
    version: Double,
    moduleOptions: js.Any,
    attachIfPossible: Boolean,
    required: Boolean
  ): IWebXRFeature = js.native
  
  /**
    * This function will exten the session creation configuration object with enabled features.
    * If, for example, the anchors feature is enabled, it will be automatically added to the optional or required features list,
    * according to the defined "required" variable, provided during enableFeature call
    * @param xrSessionInit the xr Session init object to extend
    *
    * @returns an extended XRSessionInit object
    */
  def extendXRSessionInitObject(xrSessionInit: XRSessionInit): XRSessionInit = js.native
  
  /**
    * get the implementation of an enabled feature.
    * @param featureName the name of the feature to load
    * @returns the feature class, if found
    */
  def getEnabledFeature(featureName: String): IWebXRFeature = js.native
  
  /**
    * Get the list of enabled features
    * @returns an array of enabled features
    */
  def getEnabledFeatures(): js.Array[String] = js.native
}
