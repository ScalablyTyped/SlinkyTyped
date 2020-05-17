package typingsSlinky.expo.anon

import typingsSlinky.expo.aRMod.BlendShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendShapes extends js.Object {
  var blendShapes: js.UndefOr[Boolean | js.Array[BlendShape]] = js.native
  var geometry: js.UndefOr[Boolean] = js.native
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
    def withBlendShapes(value: Boolean | js.Array[BlendShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
  }
  
}

