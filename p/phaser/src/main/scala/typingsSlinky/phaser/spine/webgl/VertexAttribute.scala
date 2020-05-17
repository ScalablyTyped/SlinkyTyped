package typingsSlinky.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexAttribute extends js.Object {
  var name: String = js.native
  var numElements: Double = js.native
  var `type`: VertexAttributeType = js.native
}

object VertexAttribute {
  @scala.inline
  def apply(name: String, numElements: Double, `type`: VertexAttributeType): VertexAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numElements = numElements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttribute]
  }
  @scala.inline
  implicit class VertexAttributeOps[Self <: VertexAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumElements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: VertexAttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

