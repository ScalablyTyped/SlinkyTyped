package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.Exception
import typingsSlinky.babylonjs.anon.PartialIEnvironmentHelperBackgroundYRotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentHelper extends js.Object {
  var _errorHandler: js.Any = js.native
  /**
    * Get the scene sizes according to the setup.
    */
  var _getSceneSize: js.Any = js.native
  var _ground: js.Any = js.native
  var _groundMaterial: js.Any = js.native
  var _groundMirror: js.Any = js.native
  var _groundTexture: js.Any = js.native
  var _options: js.Any = js.native
  var _rootMesh: js.Any = js.native
  /**
    * Stores the creation options.
    */
  val _scene: js.Any = js.native
  /**
    * Setup the background according to the specified options.
    */
  var _setupBackground: js.Any = js.native
  /**
    * Setup the environment texture according to the specified options.
    */
  var _setupEnvironmentTexture: js.Any = js.native
  /**
    * Setup the ground according to the specified options.
    */
  var _setupGround: js.Any = js.native
  /**
    * Setup the ground diffuse texture according to the specified options.
    */
  var _setupGroundDiffuseTexture: js.Any = js.native
  /**
    * Setup the ground material according to the specified options.
    */
  var _setupGroundMaterial: js.Any = js.native
  /**
    * Setup the ground mirror texture according to the specified options.
    */
  var _setupGroundMirrorTexture: js.Any = js.native
  /**
    * Setup the image processing according to the specified options.
    */
  var _setupImageProcessing: js.Any = js.native
  /**
    * Setup the ground to receive the mirror texture.
    */
  var _setupMirrorInGroundMaterial: js.Any = js.native
  /**
    * Setup the skybox according to the specified options.
    */
  var _setupSkybox: js.Any = js.native
  /**
    * Setup the skybox material according to the specified options.
    */
  var _setupSkyboxMaterial: js.Any = js.native
  /**
    * Setup the skybox reflection texture according to the specified options.
    */
  var _setupSkyboxReflectionTexture: js.Any = js.native
  var _skybox: js.Any = js.native
  var _skyboxMaterial: js.Any = js.native
  var _skyboxTexture: js.Any = js.native
  /**
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  var onErrorObservable: Observable[Exception] = js.native
  /**
    * Dispose all the elements created by the Helper.
    */
  def dispose(): Unit = js.native
  /**
    * Gets the ground mesh created by the helper.
    */
  def ground: Nullable[Mesh] = js.native
  /**
    * Gets the ground material created by the helper.
    */
  def groundMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the ground mirror created by the helper.
    */
  def groundMirror: Nullable[MirrorTexture] = js.native
  /**
    * Gets the ground mirror render list to helps pushing the meshes
    * you wish in the ground reflection.
    */
  def groundMirrorRenderList: Nullable[js.Array[AbstractMesh]] = js.native
  /**
    * Gets the ground texture created by the helper.
    */
  def groundTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets the root mesh created by the helper.
    */
  def rootMesh: Mesh = js.native
  /**
    * Sets the primary color of all the available elements.
    * @param color the main color to affect to the ground and the background
    */
  def setMainColor(color: Color3): Unit = js.native
  /**
    * Gets the skybox created by the helper.
    */
  def skybox: Nullable[Mesh] = js.native
  /**
    * Gets the skybox material created by the helper.
    */
  def skyboxMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the skybox texture created by the helper.
    */
  def skyboxTexture: Nullable[BaseTexture] = js.native
  /**
    * Updates the background according to the new options
    * @param options
    */
  def updateOptions(options: PartialIEnvironmentHelperBackgroundYRotation): Unit = js.native
}

object EnvironmentHelper {
  @scala.inline
  def apply(
    _errorHandler: js.Any,
    _getSceneSize: js.Any,
    _ground: js.Any,
    _groundMaterial: js.Any,
    _groundMirror: js.Any,
    _groundTexture: js.Any,
    _options: js.Any,
    _rootMesh: js.Any,
    _scene: js.Any,
    _setupBackground: js.Any,
    _setupEnvironmentTexture: js.Any,
    _setupGround: js.Any,
    _setupGroundDiffuseTexture: js.Any,
    _setupGroundMaterial: js.Any,
    _setupGroundMirrorTexture: js.Any,
    _setupImageProcessing: js.Any,
    _setupMirrorInGroundMaterial: js.Any,
    _setupSkybox: js.Any,
    _setupSkyboxMaterial: js.Any,
    _setupSkyboxReflectionTexture: js.Any,
    _skybox: js.Any,
    _skyboxMaterial: js.Any,
    _skyboxTexture: js.Any,
    dispose: () => Unit,
    ground: () => Nullable[Mesh],
    groundMaterial: () => Nullable[BackgroundMaterial],
    groundMirror: () => Nullable[MirrorTexture],
    groundMirrorRenderList: () => Nullable[js.Array[AbstractMesh]],
    groundTexture: () => Nullable[BaseTexture],
    onErrorObservable: Observable[Exception],
    rootMesh: () => Mesh,
    setMainColor: Color3 => Unit,
    skybox: () => Nullable[Mesh],
    skyboxMaterial: () => Nullable[BackgroundMaterial],
    skyboxTexture: () => Nullable[BaseTexture],
    updateOptions: PartialIEnvironmentHelperBackgroundYRotation => Unit
  ): EnvironmentHelper = {
    val __obj = js.Dynamic.literal(_errorHandler = _errorHandler.asInstanceOf[js.Any], _getSceneSize = _getSceneSize.asInstanceOf[js.Any], _ground = _ground.asInstanceOf[js.Any], _groundMaterial = _groundMaterial.asInstanceOf[js.Any], _groundMirror = _groundMirror.asInstanceOf[js.Any], _groundTexture = _groundTexture.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _rootMesh = _rootMesh.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _setupBackground = _setupBackground.asInstanceOf[js.Any], _setupEnvironmentTexture = _setupEnvironmentTexture.asInstanceOf[js.Any], _setupGround = _setupGround.asInstanceOf[js.Any], _setupGroundDiffuseTexture = _setupGroundDiffuseTexture.asInstanceOf[js.Any], _setupGroundMaterial = _setupGroundMaterial.asInstanceOf[js.Any], _setupGroundMirrorTexture = _setupGroundMirrorTexture.asInstanceOf[js.Any], _setupImageProcessing = _setupImageProcessing.asInstanceOf[js.Any], _setupMirrorInGroundMaterial = _setupMirrorInGroundMaterial.asInstanceOf[js.Any], _setupSkybox = _setupSkybox.asInstanceOf[js.Any], _setupSkyboxMaterial = _setupSkyboxMaterial.asInstanceOf[js.Any], _setupSkyboxReflectionTexture = _setupSkyboxReflectionTexture.asInstanceOf[js.Any], _skybox = _skybox.asInstanceOf[js.Any], _skyboxMaterial = _skyboxMaterial.asInstanceOf[js.Any], _skyboxTexture = _skyboxTexture.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), ground = js.Any.fromFunction0(ground), groundMaterial = js.Any.fromFunction0(groundMaterial), groundMirror = js.Any.fromFunction0(groundMirror), groundMirrorRenderList = js.Any.fromFunction0(groundMirrorRenderList), groundTexture = js.Any.fromFunction0(groundTexture), onErrorObservable = onErrorObservable.asInstanceOf[js.Any], rootMesh = js.Any.fromFunction0(rootMesh), setMainColor = js.Any.fromFunction1(setMainColor), skybox = js.Any.fromFunction0(skybox), skyboxMaterial = js.Any.fromFunction0(skyboxMaterial), skyboxTexture = js.Any.fromFunction0(skyboxTexture), updateOptions = js.Any.fromFunction1(updateOptions))
    __obj.asInstanceOf[EnvironmentHelper]
  }
  @scala.inline
  implicit class EnvironmentHelperOps[Self <: EnvironmentHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_errorHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_errorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getSceneSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getSceneSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ground(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groundMaterial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groundMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groundMirror(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groundMirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groundTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groundTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rootMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rootMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupBackground(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupEnvironmentTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupEnvironmentTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupGround(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupGroundDiffuseTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupGroundDiffuseTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupGroundMaterial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupGroundMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupGroundMirrorTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupGroundMirrorTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupImageProcessing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupImageProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupMirrorInGroundMaterial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupMirrorInGroundMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupSkybox(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupSkybox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupSkyboxMaterial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupSkyboxMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupSkyboxReflectionTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupSkyboxReflectionTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_skybox(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_skybox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_skyboxMaterial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_skyboxMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_skyboxTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_skyboxTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGround(value: () => Nullable[Mesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroundMaterial(value: () => Nullable[BackgroundMaterial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMaterial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroundMirror(value: () => Nullable[MirrorTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroundMirrorRenderList(value: () => Nullable[js.Array[AbstractMesh]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorRenderList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroundTexture(value: () => Nullable[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundTexture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnErrorObservable(value: Observable[Exception]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootMesh(value: () => Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMesh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMainColor(value: Color3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMainColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkybox(value: () => Nullable[Mesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skybox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSkyboxMaterial(value: () => Nullable[BackgroundMaterial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxMaterial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSkyboxTexture(value: () => Nullable[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxTexture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateOptions(value: PartialIEnvironmentHelperBackgroundYRotation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

