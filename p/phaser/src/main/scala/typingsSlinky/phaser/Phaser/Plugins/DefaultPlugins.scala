package typingsSlinky.phaser.Phaser.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultPlugins extends js.Object {
  /**
    * These are the core plugins that are installed into every Scene.Systems instance, no matter what.
    */
  var CoreScene: js.Array[_] = js.native
  /**
    * These plugins are created in Scene.Systems in addition to the CoreScenePlugins.
    */
  var DefaultScene: js.Array[_] = js.native
  /**
    * These are the Global Managers that are created by the Phaser.Game instance.
    */
  var Global: js.Array[_] = js.native
}

object DefaultPlugins {
  @scala.inline
  def apply(CoreScene: js.Array[_], DefaultScene: js.Array[_], Global: js.Array[_]): DefaultPlugins = {
    val __obj = js.Dynamic.literal(CoreScene = CoreScene.asInstanceOf[js.Any], DefaultScene = DefaultScene.asInstanceOf[js.Any], Global = Global.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPlugins]
  }
  @scala.inline
  implicit class DefaultPluginsOps[Self <: DefaultPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreScene(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultScene(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Global")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

