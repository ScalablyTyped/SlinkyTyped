package typingsSlinky.osmtogeojson.mod.OsmJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsmJSONObject extends js.Object {
  var elements: js.Array[Node | Way | Relationship] = js.native
}

object OsmJSONObject {
  @scala.inline
  def apply(elements: js.Array[Node | Way | Relationship]): OsmJSONObject = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsmJSONObject]
  }
  @scala.inline
  implicit class OsmJSONObjectOps[Self <: OsmJSONObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[Node | Way | Relationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

