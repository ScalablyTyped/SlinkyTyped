package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.link
import typingsSlinky.unist.mod.Data
import typingsSlinky.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link
  extends Parent
     with Resource
     with PhrasingContent {
  @JSName("children")
  var children_Link: js.Array[StaticPhrasingContent]
  @JSName("type")
  var type_Link: link
}

object Link {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    `type`: link,
    url: String,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

