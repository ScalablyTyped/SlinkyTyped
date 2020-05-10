package typingsSlinky.leafletDraw.mod.DrawOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleShapeOptions extends js.Object {
  /**
    * Determines if the draw tool remains enabled after drawing a shape.
    *
    * @default false
    */
  var repeatMode: js.UndefOr[Boolean] = js.native
}

object SimpleShapeOptions {
  @scala.inline
  def apply(): SimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleShapeOptions]
  }
  @scala.inline
  implicit class SimpleShapeOptionsOps[Self <: SimpleShapeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepeatMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(js.undefined)
        ret
    }
  }
  
}

