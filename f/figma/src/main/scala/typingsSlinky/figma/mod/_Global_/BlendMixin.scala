package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendMixin extends js.Object {
  var blendMode: BlendMode = js.native
  var effectStyleId: String = js.native
  var effects: js.Array[Effect] = js.native
  var isMask: Boolean = js.native
  var opacity: Double = js.native
}

object BlendMixin {
  @scala.inline
  def apply(
    blendMode: BlendMode,
    effectStyleId: String,
    effects: js.Array[Effect],
    isMask: Boolean,
    opacity: Double
  ): BlendMixin = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], effectStyleId = effectStyleId.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], isMask = isMask.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendMixin]
  }
  @scala.inline
  implicit class BlendMixinOps[Self <: BlendMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlendMode(value: BlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffects(value: js.Array[Effect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

