package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLVideoElement extends js.Object {
  var mozSrcObject: js.Any = js.native
}

object HTMLVideoElement {
  @scala.inline
  def apply(mozSrcObject: js.Any): HTMLVideoElement = {
    val __obj = js.Dynamic.literal(mozSrcObject = mozSrcObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLVideoElement]
  }
  @scala.inline
  implicit class HTMLVideoElementOps[Self <: HTMLVideoElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozSrcObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozSrcObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

