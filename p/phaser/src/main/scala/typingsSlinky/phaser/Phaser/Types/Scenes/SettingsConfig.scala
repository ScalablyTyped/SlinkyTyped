package typingsSlinky.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typingsSlinky.phaser.Phaser.Types.Core.LoaderConfig
import typingsSlinky.phaser.Phaser.Types.Core.PhysicsConfig
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.PackFileConfig
import typingsSlinky.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsConfig extends js.Object {
  /**
    * Does the Scene start as active or not? An active Scene updates each step.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * An optional Camera configuration object.
    */
  var cameras: js.UndefOr[JSONCamera | js.Array[JSONCamera]] = js.native
  /**
    * The unique key of this Scene. Must be unique within the entire Game instance.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The loader configuration object for the Scene.
    */
  var loader: js.UndefOr[LoaderConfig] = js.native
  /**
    * Overwrites the default injection map for a scene.
    */
  var map: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Extends the injection map for a scene.
    */
  var mapAdd: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An optional Loader Packfile to be loaded before the Scene begins.
    */
  var pack: js.UndefOr[`false` | PackFileConfig] = js.native
  /**
    * The physics configuration object for the Scene.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.native
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: js.UndefOr[`false` | js.Any] = js.native
  /**
    * Does the Scene start as visible or not? A visible Scene renders each step.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SettingsConfig {
  @scala.inline
  def apply(): SettingsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsConfig]
  }
  @scala.inline
  implicit class SettingsConfigOps[Self <: SettingsConfig] (val x: Self) extends AnyVal {
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
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCameras(value: JSONCamera | js.Array[JSONCamera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameras")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: LoaderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapAdd(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withPack(value: `false` | PackFileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysics(value: PhysicsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: `false` | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

