package typingsSlinky.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMapOptions extends js.Object {
  var buffer: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var posx: js.UndefOr[Double] = js.native
  var posy: js.UndefOr[Double] = js.native
  var sizex: js.UndefOr[Double] = js.native
  var sizey: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TileMapOptions {
  @scala.inline
  def apply(): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMapOptions]
  }
  @scala.inline
  implicit class TileMapOptionsOps[Self <: TileMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPosx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posx")(js.undefined)
        ret
    }
    @scala.inline
    def withPosy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posy")(js.undefined)
        ret
    }
    @scala.inline
    def withSizex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizex")(js.undefined)
        ret
    }
    @scala.inline
    def withSizey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizey")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

