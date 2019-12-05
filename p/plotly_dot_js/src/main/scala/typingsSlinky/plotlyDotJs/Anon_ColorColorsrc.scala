package typingsSlinky.plotlyDotJs

import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Color
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.horizontal
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.none
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.radial
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorColorsrc extends js.Object {
  var color: Color
  var colorsrc: js.Any
  var `type`: radial | horizontal | vertical | none
  var typesrc: js.Any
}

object Anon_ColorColorsrc {
  @scala.inline
  def apply(color: Color, colorsrc: js.Any, `type`: radial | horizontal | vertical | none, typesrc: js.Any): Anon_ColorColorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorColorsrc]
  }
}

