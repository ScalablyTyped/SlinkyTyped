package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.horizontal
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.radial
import typingsSlinky.plotlyJs.plotlyJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colorsrc extends js.Object {
  var color: typingsSlinky.plotlyJs.mod.Color = js.native
  var colorsrc: js.Any = js.native
  var `type`: radial | horizontal | vertical | none = js.native
  var typesrc: js.Any = js.native
}

object Colorsrc {
  @scala.inline
  def apply(
    color: typingsSlinky.plotlyJs.mod.Color,
    colorsrc: js.Any,
    `type`: radial | horizontal | vertical | none,
    typesrc: js.Any
  ): Colorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colorsrc]
  }
  @scala.inline
  implicit class ColorsrcOps[Self <: Colorsrc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: typingsSlinky.plotlyJs.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorsrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: radial | horizontal | vertical | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypesrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typesrc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

