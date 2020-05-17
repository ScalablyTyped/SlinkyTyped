package typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Split_ extends js.Object {
  var first: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox = js.native
  var second: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox = js.native
}

object Split_ {
  @scala.inline
  def apply(
    first: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox,
    second: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox
  ): Split_ = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Split_]
  }
  @scala.inline
  implicit class Split_Ops[Self <: Split_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

