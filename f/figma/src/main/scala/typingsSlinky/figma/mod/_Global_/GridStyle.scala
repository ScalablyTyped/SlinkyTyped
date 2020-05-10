package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStyle extends BaseStyle {
  var layoutGrids: js.Array[LayoutGrid] = js.native
  @JSName("type")
  var type_GridStyle: GRID = js.native
}

object GridStyle {
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    layoutGrids: js.Array[LayoutGrid],
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: GRID
  ): GridStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStyle]
  }
  @scala.inline
  implicit class GridStyleOps[Self <: GridStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutGrids(value: js.Array[LayoutGrid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutGrids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GRID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

