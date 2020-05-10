package typingsSlinky.phaser.Phaser.Types.GameObjects.Group

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.native
}

object GroupConfig {
  @scala.inline
  def apply(): GroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupConfig]
  }
  @scala.inline
  implicit class GroupConfigOps[Self <: GroupConfig] (val x: Self) extends AnyVal {
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
    def withClassType(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateCallback(value: /* item */ GameObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultipleCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateMultipleCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultipleCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFrame(value: String | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCallback(value: /* item */ GameObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRunChildUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runChildUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunChildUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runChildUpdate")(js.undefined)
        ret
    }
  }
  
}

