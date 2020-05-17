package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotData extends js.Object {
  var attachmentName: String = js.native
  var blendMode: BlendMode = js.native
  var boneData: BoneData = js.native
  var color: Color = js.native
  var darkColor: Color = js.native
  var index: Double = js.native
  var name: String = js.native
}

object SlotData {
  @scala.inline
  def apply(
    attachmentName: String,
    blendMode: BlendMode,
    boneData: BoneData,
    color: Color,
    darkColor: Color,
    index: Double,
    name: String
  ): SlotData = {
    val __obj = js.Dynamic.literal(attachmentName = attachmentName.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], boneData = boneData.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotData]
  }
  @scala.inline
  implicit class SlotDataOps[Self <: SlotData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: BlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoneData(value: BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boneData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

