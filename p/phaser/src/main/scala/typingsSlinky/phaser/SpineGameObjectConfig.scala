package typingsSlinky.phaser

import typingsSlinky.phaser.Phaser.Types.GameObjects.GameObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpineGameObjectConfig extends GameObjectConfig {
  var animationName: js.UndefOr[String] = js.native
  var attachmentName: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var skinName: js.UndefOr[String] = js.native
  var slotName: js.UndefOr[String] = js.native
}

object SpineGameObjectConfig {
  @scala.inline
  def apply(): SpineGameObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpineGameObjectConfig]
  }
  @scala.inline
  implicit class SpineGameObjectConfigOps[Self <: SpineGameObjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentName")(js.undefined)
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
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinName")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotName")(js.undefined)
        ret
    }
  }
  
}

