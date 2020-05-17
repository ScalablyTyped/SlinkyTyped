package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.EFFECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectStyle extends BaseStyle {
  var effects: js.Array[Effect] = js.native
  @JSName("type")
  var type_EffectStyle: EFFECT = js.native
}

object EffectStyle {
  @scala.inline
  def apply(
    description: String,
    effects: js.Array[Effect],
    id: String,
    key: String,
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: EFFECT
  ): EffectStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectStyle]
  }
  @scala.inline
  implicit class EffectStyleOps[Self <: EffectStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffects(value: js.Array[Effect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EFFECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

