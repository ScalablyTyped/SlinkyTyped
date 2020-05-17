package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.TextureAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atlas extends js.Object {
  var atlas: js.UndefOr[TextureAtlas] = js.native
  var frameKeys: js.UndefOr[js.Array[String]] = js.native
  var pixelsPerUnit: js.UndefOr[Double] = js.native
  var renderMode: js.UndefOr[Double] = js.native
}

object Atlas {
  @scala.inline
  def apply(): Atlas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Atlas]
  }
  @scala.inline
  implicit class AtlasOps[Self <: Atlas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtlas(value: TextureAtlas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlas")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelsPerUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelsPerUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
        ret
    }
  }
  
}

