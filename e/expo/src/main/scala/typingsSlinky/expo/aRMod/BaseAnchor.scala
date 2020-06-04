package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAnchor extends Anchor {
  var id: String
  var transform: Matrix
  var `type`: AnchorType
}

object BaseAnchor {
  @scala.inline
  def apply(id: String, transform: Matrix, `type`: AnchorType): BaseAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAnchor]
  }
  @scala.inline
  implicit class BaseAnchorOps[Self <: BaseAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AnchorType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

