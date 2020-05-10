package typingsSlinky.flowdoc

import typingsSlinky.flowdoc.Flow.FileAsset
import typingsSlinky.flowdoc.Flow.Point
import typingsSlinky.flowdoc.Flow.Size
import typingsSlinky.flowdoc.Flow.URLAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graphic extends Node {
  var position: Point = js.native
  var size: Size = js.native
  var source: FileAsset | URLAsset = js.native
}

object Graphic {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: NodeType
  ): Graphic = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  @scala.inline
  implicit class GraphicOps[Self <: Graphic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: FileAsset | URLAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

