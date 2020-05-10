package typingsSlinky.mapboxSpritezero

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId extends js.Object {
  var id: String = js.native
  var svg: Buffer = js.native
}

object AnonId {
  @scala.inline
  def apply(id: String, svg: Buffer): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
  @scala.inline
  implicit class AnonIdOps[Self <: AnonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvg(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

