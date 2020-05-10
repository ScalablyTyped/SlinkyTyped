package typingsSlinky.phaser.Phaser.Types.Scenes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSceneFromObjectConfig extends js.Object {
  /**
    * The scene's create callback.
    */
  var create: js.UndefOr[SceneCreateCallback] = js.native
  /**
    * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
    */
  var extend: js.UndefOr[js.Any] = js.native
  /**
    * Any values, which will be merged into the Scene's Data Manager store.
    */
  @JSName("extend.data")
  var extendDotdata: js.UndefOr[js.Any] = js.native
  /**
    * The scene's init callback.
    */
  var init: js.UndefOr[SceneInitCallback] = js.native
  /**
    * The scene's preload callback.
    */
  var preload: js.UndefOr[ScenePreloadCallback] = js.native
  /**
    * The scene's update callback. See {@link Phaser.Scene#update}.
    */
  var update: js.UndefOr[js.Function] = js.native
}

object CreateSceneFromObjectConfig {
  @scala.inline
  def apply(): CreateSceneFromObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSceneFromObjectConfig]
  }
  @scala.inline
  implicit class CreateSceneFromObjectConfigOps[Self <: CreateSceneFromObjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: /* data */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendDotdata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend.data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendDotdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend.data")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* data */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

