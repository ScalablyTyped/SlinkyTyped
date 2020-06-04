package typingsSlinky.expo.anon

import typingsSlinky.expo.aRMod.BlendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendShapes extends js.Object {
  var blendShapes: js.UndefOr[Boolean | js.Array[BlendShape]] = js.undefined
  var geometry: js.UndefOr[Boolean] = js.undefined
}

object BlendShapes {
  @scala.inline
  def apply(): BlendShapes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendShapes]
  }
  @scala.inline
  implicit class BlendShapesOps[Self <: BlendShapes] (val x: Self) extends AnyVal {
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
    def setBlendShapes(value: Boolean | js.Array[BlendShape]): Self = this.set("blendShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendShapes: Self = this.set("blendShapes", js.undefined)
    @scala.inline
    def setGeometry(value: Boolean): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
  }
  
}

