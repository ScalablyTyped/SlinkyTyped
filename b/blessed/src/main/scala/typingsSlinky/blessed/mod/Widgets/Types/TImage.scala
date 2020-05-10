package typingsSlinky.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TImage extends js.Object {
  /**
    * Image bitmap.
    */
  var bmp: js.Any = js.native
  /**
    * Image cellmap (bitmap scaled down to cell size).
    */
  var cellmap: js.Any = js.native
  /**
    * Pixel height.
    */
  var height: Double = js.native
  /**
    * Pixel width.
    */
  var width: Double = js.native
}

object TImage {
  @scala.inline
  def apply(bmp: js.Any, cellmap: js.Any, height: Double, width: Double): TImage = {
    val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], cellmap = cellmap.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TImage]
  }
  @scala.inline
  implicit class TImageOps[Self <: TImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBmp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellmap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

