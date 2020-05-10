package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.dojo.dijit.ColorPalette.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofColorPalette extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/ColorPalette._Color.html
    *
    * Object associated with each cell in a ColorPalette palette.
    * Implements dijit/Dye.
    * 
    * @param alias English name of the color.     
    * @param row Vertical position in grid.     
    * @param col     
    * @param title Localized name of the color.     
    */
  var _Color: Instantiable4[/* alias */ String, /* row */ Double, /* col */ js.Any, /* title */ String, Color] = js.native
}

object TypeofColorPalette {
  @scala.inline
  def apply(
    _Color: Instantiable4[/* alias */ String, /* row */ Double, /* col */ js.Any, /* title */ String, Color]
  ): TypeofColorPalette = {
    val __obj = js.Dynamic.literal(_Color = _Color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPalette]
  }
  @scala.inline
  implicit class TypeofColorPaletteOps[Self <: TypeofColorPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Color(
      value: Instantiable4[/* alias */ String, /* row */ Double, /* col */ js.Any, /* title */ String, Color]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Color")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

