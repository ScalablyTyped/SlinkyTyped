package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.PAINT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaintStyle extends BaseStyle {
  var paints: js.Array[Paint] = js.native
  @JSName("type")
  var type_PaintStyle: PAINT = js.native
}

object PaintStyle {
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    paints: js.Array[Paint],
    remote: Boolean,
    remove: () => Unit,
    `type`: PAINT
  ): PaintStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paints = paints.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyle]
  }
  @scala.inline
  implicit class PaintStyleOps[Self <: PaintStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaints(value: js.Array[Paint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PAINT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

