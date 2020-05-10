package typingsSlinky.breeze.breeze

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveResult extends js.Object {
  var XHR: XMLHttpRequest = js.native
  var entities: js.Array[Entity] = js.native
  var keyMappings: js.Array[KeyMapping] = js.native
}

object SaveResult {
  @scala.inline
  def apply(XHR: XMLHttpRequest, entities: js.Array[Entity], keyMappings: js.Array[KeyMapping]): SaveResult = {
    val __obj = js.Dynamic.literal(XHR = XHR.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], keyMappings = keyMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  @scala.inline
  implicit class SaveResultOps[Self <: SaveResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXHR(value: XMLHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntities(value: js.Array[Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyMappings(value: js.Array[KeyMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

