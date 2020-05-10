package typingsSlinky.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typingsSlinky.phaser.Phaser.Types.Core.LoaderConfig
import typingsSlinky.phaser.Phaser.Types.Core.PhysicsConfig
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.PackFileConfig
import typingsSlinky.phaser.integer
import typingsSlinky.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsObject extends js.Object {
  /**
    * The active state of this Scene. An active Scene updates each step.
    */
  var active: Boolean = js.native
  /**
    * The Camera configuration object.
    */
  var cameras: JSONCamera | js.Array[JSONCamera] = js.native
  /**
    * a data bundle passed to this Scene from the Scene Manager.
    */
  var data: js.Object = js.native
  /**
    * Has the Scene finished booting?
    */
  var isBooted: Boolean = js.native
  /**
    * Is the Scene in a state of transition?
    */
  var isTransition: Boolean = js.native
  /**
    * The unique key of this Scene. Unique within the entire Game instance.
    */
  var key: String = js.native
  /**
    * The loader configuration object for the Scene.
    */
  var loader: LoaderConfig = js.native
  /**
    * The Scene's Injection Map.
    */
  var map: StringDictionary[String] = js.native
  /**
    * The Loader Packfile to be loaded before the Scene begins.
    */
  var pack: `false` | PackFileConfig = js.native
  /**
    * The physics configuration object for the Scene.
    */
  var physics: PhysicsConfig = js.native
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: `false` | js.Any = js.native
  /**
    * The current status of the Scene. Maps to the Scene constants.
    */
  var status: Double = js.native
  /**
    * Is this Scene allowed to receive input during transitions?
    */
  var transitionAllowInput: Boolean = js.native
  /**
    * The duration of the transition, if set.
    */
  var transitionDuration: integer = js.native
  /**
    * The Scene this Scene is transitioning from, if set.
    */
  var transitionFrom: Scene = js.native
  /**
    * The visible state of this Scene. A visible Scene renders each step.
    */
  var visible: Boolean = js.native
}

object SettingsObject {
  @scala.inline
  def apply(
    active: Boolean,
    cameras: JSONCamera | js.Array[JSONCamera],
    data: js.Object,
    isBooted: Boolean,
    isTransition: Boolean,
    key: String,
    loader: LoaderConfig,
    map: StringDictionary[String],
    pack: `false` | PackFileConfig,
    physics: PhysicsConfig,
    plugins: `false` | js.Any,
    status: Double,
    transitionAllowInput: Boolean,
    transitionDuration: integer,
    transitionFrom: Scene,
    visible: Boolean
  ): SettingsObject = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isBooted = isBooted.asInstanceOf[js.Any], isTransition = isTransition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transitionAllowInput = transitionAllowInput.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionFrom = transitionFrom.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsObject]
  }
  @scala.inline
  implicit class SettingsObjectOps[Self <: SettingsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameras(value: JSONCamera | js.Array[JSONCamera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBooted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBooted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoader(value: LoaderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPack(value: `false` | PackFileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysics(value: PhysicsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: `false` | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionAllowInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAllowInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionDuration(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionFrom(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

