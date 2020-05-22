package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.html
import typingsSlinky.unist.mod.Data
import typingsSlinky.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML
  extends Literal
     with BlockContent
     with StaticPhrasingContent {
  @JSName("type")
  var type_HTML: html
}

object HTML {
  @scala.inline
  def apply(`type`: html, value: js.Any, data: Data = null, position: Position = null): HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

